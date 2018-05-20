package com.yaorange.service.Impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yaorange.mapper.InterviewRecordsMapper;
import com.yaorange.mapper.InterviewSituationMapper;
import com.yaorange.pojo.DataResult;
import com.yaorange.pojo.InterviewRecords;
import com.yaorange.pojo.InterviewRecordsExample;
import com.yaorange.pojo.InterviewRecordsExample.Criteria;
import com.yaorange.pojo.InterviewSituation;
import com.yaorange.pojo.InterviewSituationExample;
import com.yaorange.service.InterviewSituationService;

@Service
public class InterviewSituationServiceImpl implements InterviewSituationService {
	
	@Autowired
	private InterviewSituationMapper interviewSituationMapper;
	


	@Override
	public DataResult getInterviewSituationList(String name, Integer pageIndex, Integer pageSize) {
		PageHelper.startPage(pageIndex, pageSize);
		InterviewSituationExample interviewSituationExample = new InterviewSituationExample();
		
		InterviewSituationExample.Criteria criteria = interviewSituationExample.createCriteria();
		if(StringUtils.isNotEmpty(name)){
			criteria.andInterviewcompanyLike("%" + name + "%");
		}
		
		
		List<InterviewSituation> interviewSituationList=interviewSituationMapper.selectByExample(interviewSituationExample);
	
	    PageInfo<InterviewSituation> pageInfo = new PageInfo<>(interviewSituationList);
	    long total= pageInfo.getTotal();
	    DataResult result=new DataResult();
	    result.setList(interviewSituationList);
	    result.setCount(total);
	    result.setRel(true);
	    result.setMsg("获取成功");
		return result;
	}

}
