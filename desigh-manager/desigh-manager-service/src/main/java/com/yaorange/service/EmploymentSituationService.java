package com.yaorange.service;

import com.yaorange.pojo.DataResult;

public interface EmploymentSituationService {

	DataResult getEmploymentSituationList(String name, Integer pageIndex, Integer pageSize);

}
