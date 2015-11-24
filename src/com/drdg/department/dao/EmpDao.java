package com.drdg.department.dao;

import java.util.List;

import com.drdg.department.bean.EmpBean;

public interface EmpDao {

	int doInsertEmp(EmpBean empBean);
	
	int doInsertEmpSelective(EmpBean empBean);
	
	int doDeleteEmpById(Integer empId);
	
	List<EmpBean> doGetEmpList();
	
	EmpBean doGetEmpById(Integer empId);
}
