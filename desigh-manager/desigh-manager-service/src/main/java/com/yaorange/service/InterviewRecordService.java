package com.yaorange.service;

import com.yaorange.pojo.DataResult;

public interface InterviewRecordService {

	DataResult getInterviewRecordList(String name, Integer pageIndex, Integer pageSize);

}
