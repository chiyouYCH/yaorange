package com.yaorange.service.Impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yaorange.mapper.InterviewRecordsMapper;
import com.yaorange.pojo.DataResult;
import com.yaorange.pojo.InterviewRecords;
import com.yaorange.pojo.InterviewRecordsExample;
import com.yaorange.pojo.User;
import com.yaorange.pojo.UserExample;
import com.yaorange.pojo.InterviewRecordsExample.Criteria;
import com.yaorange.service.InterviewRecordService;
@Service
public class InterviewRecordServiceImpl implements InterviewRecordService {
	
	@Autowired
	private InterviewRecordsMapper interviewRecordsMapper;

	@Override
	public DataResult getInterviewRecordList(String name, Integer pageIndex, Integer pageSize) {
		
				PageHelper.startPage(pageIndex, pageSize);
				InterviewRecordsExample interviewRecordsExample = new InterviewRecordsExample();
				
				Criteria criteria = interviewRecordsExample.createCriteria();
				if(StringUtils.isNotEmpty(name)){
					criteria.andInterviewcompanyLike("%" + name + "%");
				}
				
				
				List<InterviewRecords> interviewRecordsList=interviewRecordsMapper.selectByExample(interviewRecordsExample);
			
			    PageInfo<InterviewRecords> pageInfo = new PageInfo<>(interviewRecordsList);
			    long total= pageInfo.getTotal();
			    DataResult result=new DataResult();
			    result.setList(interviewRecordsList);
			    result.setCount(total);
			    result.setRel(true);
			    result.setMsg("获取成功");
				return result;
				
				
			
	}

}
