package com.yaorange.service;

import com.yaorange.pojo.DataResult;

public interface InterviewSituationService {

	DataResult getInterviewSituationList(String name, Integer pageIndex, Integer pageSize);

}
