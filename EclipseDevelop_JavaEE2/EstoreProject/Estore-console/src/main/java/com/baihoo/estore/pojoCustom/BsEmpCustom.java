package com.baihoo.estore.pojoCustom;

import com.baihoo.estore.pojo.EstBsEmp;
import com.baihoo.estore.pojoDto.BsEmpDto;

/**
 * 员工包装类
 * @ClassName: BsEmpCustom
 * @Description: TODO
 * @author: Administrator
 * @date: 2018年7月29日 上午9:16:25
 */
public class BsEmpCustom {
	
	private BsEmpDto bsEmpDto;
	private EstBsEmp estBsEmp;
	
	public BsEmpDto getBsEmpDto() {
		return bsEmpDto;
	}

	public void setBsEmpDto(BsEmpDto bsEmpDto) {
		this.bsEmpDto = bsEmpDto;
	}

	public EstBsEmp getEstBsEmp() {
		return estBsEmp;
	}

	public void setEstBsEmp(EstBsEmp estBsEmp) {
		this.estBsEmp = estBsEmp;
	}
	
}
