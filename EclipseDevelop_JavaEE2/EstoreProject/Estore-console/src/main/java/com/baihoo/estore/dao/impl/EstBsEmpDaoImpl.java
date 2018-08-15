package com.baihoo.estore.dao.impl;

import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.stereotype.Repository;

import com.baihoo.estore.core.base.BaseDaoImpl;
import com.baihoo.estore.core.base.BaseDto;
import com.baihoo.estore.dao.EstBsEmpDao;
import com.baihoo.estore.pojo.EstBsEmp;
import com.baihoo.estore.pojoCustom.BsEmpCustom;
import com.baihoo.estore.pojoDto.BsEmpDto;
import com.baihoo.estore.pojoDto.BsPermDto;

/**
 * 
 * @ClassName: EstBsEmpDaoImpl
 * @Description: TODO
 * @author: Administrator
 * @date: 2018年7月28日 下午3:04:44
 */
@Repository("estBsEmpDao")
public class EstBsEmpDaoImpl extends BaseDaoImpl<EstBsEmp>  implements EstBsEmpDao{

	/**
	 * 回調方法
	 */
	public void doQueryDetachedCriteria(DetachedCriteria dc, BaseDto bDto) {
		BsEmpDto bsEmpDto = (BsEmpDto) bDto;
		if (bDto != null) {
			// 鈎子回調函數，分頁查詢
			dc.add(Restrictions.or(Restrictions.eq("loginName", bsEmpDto.getLoginName()),
					Restrictions.eq("empCode", bsEmpDto.getEmpCode()),
					Restrictions.eq("empName", bsEmpDto.getEmpName()),
					Restrictions.eq("estBsEmpId" , bsEmpDto.getEstBsEmpId())
					));
		}
	}
	/**
	 * 通过登陆名称或真实姓名或员工编号和密码登陆
	 */
	@SuppressWarnings("unchecked")
	public BsEmpCustom findByEmpCodeOrNameOrLoginAndPwd(String loginname, String loginpwd)  throws Exception {
		DetachedCriteria dc = DetachedCriteria.forClass(EstBsEmp.class);
		dc.add(Restrictions.or(
				Restrictions.eq("loginName", loginname) , 
				Restrictions.eq("empCode", loginname),
				Restrictions.eq("empName", loginname)
				));
		dc.add(Restrictions.and(Restrictions.eq("empPwd", loginpwd)));
		 //查詢用戶
		List<EstBsEmp> list = (List<EstBsEmp>) this.getHibernateTemplate().findByCriteria(dc);
		 if(list!=null && list.size()==1) {
			 BsEmpCustom empCustom = new BsEmpCustom();
			 BsEmpDto empDto = new BsEmpDto();
			 //拷貝之包裝的dto對象
			 BeanUtils.copyProperties(empDto, list.get(0));
			 empCustom.setBsEmpDto(empDto);
			 //查詢出用戶的權限
			 List<BsPermDto> permissions = this.getHibernateTemplate().execute(new HibernateCallback<List<BsPermDto>>() {
				@Override
				public List<BsPermDto> doInHibernate(Session session) throws HibernateException {
					SQLQuery sqlQuery = session.createSQLQuery("SELECT DISTINCT\r\n" + 
							"	erp.PERM_ID AS estBsPermId,\r\n" + 
							"	erp.PERM_CODE AS permCode,\r\n" + 
							"	erp.PERM_NAME AS permName\r\n" + 
							"FROM\r\n" + 
							"	est_bs_role_perm erp\r\n" + 
							"WHERE\r\n" + 
							"	erp.ROLE_ID IN (\r\n" + 
							"		EXISTS (\r\n" + 
							"			SELECT\r\n" + 
							"				er.ROLE_ID\r\n" + 
							"			FROM\r\n" + 
							"				est_bs_emp_role er\r\n" + 
							"			WHERE\r\n" + 
							"				er.emp_id = ?\r\n" + 
							"		)\r\n" + 
							"	)");
					sqlQuery.setInteger(0, empCustom.getBsEmpDto().getEstBsEmpId());
					// 进行结果集的转换  
					sqlQuery.setResultTransformer(Transformers.aliasToBean(BsPermDto.class));  
	                // 查询结果并且放回  
	                return sqlQuery.list();
				}
			 });
			 empCustom.getBsEmpDto().setPermissions(permissions);
			 return  empCustom;
		 }
		return null;
	}
	
}
