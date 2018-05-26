package com.yaorange.service;

import com.yaorange.pojo.DataResult;
import com.yaorange.pojo.EasyBuyResult;
import com.yaorange.pojo.InterviewSituation;
import com.yaorange.pojo.InterviewSituationWithBLOBs;

public interface InterviewSituationService {

	DataResult getInterviewSituationList(String name, Integer pageIndex, Integer pageSize);

	EasyBuyResult saveInterviewSituation(InterviewSituationWithBLOBs interview);

}
