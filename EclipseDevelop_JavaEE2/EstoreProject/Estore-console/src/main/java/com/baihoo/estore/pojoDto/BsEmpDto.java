package com.baihoo.estore.pojoDto;

import java.util.List;

import com.baihoo.estore.core.base.BaseDto;
import com.baihoo.estore.core.base.BaseUser;
import com.baihoo.estore.pojo.EstBsEmp;
/**
 * 
 * @ClassName: BsEmpDto
 * @Description: TODO
 * @author: Administrator
 * @date: 2018年7月28日 下午2:37:50
 */
public class BsEmpDto extends EstBsEmp  implements BaseDto , BaseUser<BsPermDto>{
	
	
	private List<BsPermDto> permissions;
	public void setPermissions(List<BsPermDto> permissions) {
		this.permissions = permissions;
	}
	/*************************** BaseDto实现接口方法*****************************/
	public String getId() {
		return this.getEstBsEmpId()+"";
	}
	public String getUsername() {
		return this.getEmpCode()+","+this.getEmpName()+","+this.getLoginName();
	}
	public String getPassword() {
		return this.getEmpPwd();
	}
	public List<BsPermDto> getPermissions() {
		return permissions;
	}
}

