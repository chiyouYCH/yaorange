package com.yaorange.service;

import com.yaorange.pojo.DataResult;
import com.yaorange.pojo.EasyBuyResult;
import com.yaorange.pojo.InterviewRecords;

public interface InterviewRecordService {

	DataResult getInterviewRecordList(String name, Integer pageIndex, Integer pageSize);

	EasyBuyResult deleteInterviewRecord(Integer id);

	InterviewRecords getInterviewRecordById(Integer id);

	EasyBuyResult updateInterviewRecord(InterviewRecords interviewRecords);

	EasyBuyResult saveInterviewRecord(InterviewRecords interviewRecords);

}
