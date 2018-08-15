package com.baihoo.springboot.service.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.baihoo.springboot.pojo.BhAccount;
import com.baihoo.springboot.repository.BhAccountRepository;
import com.baihoo.springboot.service.BhAccountService;

/**
 * 模擬銀行轉賬服務層類實現方法
 * 
 * @author Administrator
 *
 */
@Service("bhAccountService")
public class BhAccountServiceImpl implements BhAccountService {
	@Autowired
	@Qualifier("bhAccountRepository")
	private BhAccountRepository bhAccountRepository;

	/**
	 * 模擬銀行轉賬方法
	 * 
	 * @param from
	 *            轉賬人
	 * @param to
	 *            收款人
	 * @param money
	 *            轉入金額
	 * @throws Exception
	 */
	public void transferAccount(String from, String to, Double money) throws Exception {
		outAccount(from, money);
		//int i = 1/0;
		inAccount(to, money);
	}

	/**
	 * 進賬方法
	 * 
	 * @param to
	 *            進賬用戶（賬戶名稱）
	 * @param money
	 *            進賬多少資金
	 */
	private void inAccount(String to, Double money) throws Exception {
		// 通過賬戶名稱，查找到進賬用戶
		Optional<BhAccount> optionalAccount = bhAccountRepository.findOne(new Specification<BhAccount>() {

			/**
			 * 拼接確定查詢條件
			 */
			public Predicate toPredicate(Root<BhAccount> root, CriteriaQuery<?> query,
					CriteriaBuilder criteriaBuilder) {
				Predicate predicate = criteriaBuilder.conjunction();
				List<Expression<Boolean>> expressions = predicate.getExpressions();
				expressions.add(criteriaBuilder.equal(root.get("accountName"), to));
				return predicate;
			}
		});
		// 獲取用戶
		BhAccount account = optionalAccount.get();
		//本金
		BigDecimal principal = new BigDecimal(account.getMoney());
		//進賬資金
		BigDecimal transIn = new BigDecimal(money);
		account.setMoney(principal.add(transIn).doubleValue());
		//更新用戶
		bhAccountRepository.save(account);
	}

	/**
	 * 轉賬方法
	 * 
	 * @param from
	 *            轉賬用戶（賬戶名稱）
	 * @param money
	 *            轉出多少資金
	 */

	private void outAccount(String from, Double money) throws Exception {
		// 通過賬戶名稱，查找到轉賬用戶
		Optional<BhAccount> optionalAccount = bhAccountRepository.findOne(new Specification<BhAccount>() {
			public Predicate toPredicate(Root<BhAccount> root, CriteriaQuery<?> query,
					CriteriaBuilder criteriaBuilder) {
				Predicate predicate = criteriaBuilder.conjunction();
				List<Expression<Boolean>> expressions = predicate.getExpressions();
				expressions.add(criteriaBuilder.equal(root.get("accountName"), from));
				return predicate;
			}
		});
		// 獲取用戶
		BhAccount account = optionalAccount.get();
		//本金
		BigDecimal principal = new BigDecimal(account.getMoney());
		//轉出資金
		BigDecimal transOut = new BigDecimal(money);
		account.setMoney(principal.subtract(transOut).doubleValue());
		//更新用戶
		bhAccountRepository.save(account);
	}
}
