package com.yaorange.service;

import com.yaorange.pojo.DataResult;
import com.yaorange.pojo.EmploymentSituation;
import com.yaorange.pojo.EmploymentSituationWithBLOBs;

public interface EmploymentSituationService {

	DataResult getEmploymentSituationList(String name, Integer pageIndex, Integer pageSize);
	DataResult savaEmploymentSituation(EmploymentSituationWithBLOBs em);
}
