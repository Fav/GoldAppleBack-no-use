package com.drdg.department.service;

import java.util.List;

import com.drdg.department.bean.EmpBean;

public interface IEmpService {

	public abstract int doInsertEmp(EmpBean empBean);
	
	public abstract int doInsertEmpSelective(EmpBean empBean);
	
	public abstract List<EmpBean> doGetEmpList();
	
	public abstract EmpBean doGetEmpById(Integer empId);
	
	public abstract int doDeleteEmpById(Integer empId);
}