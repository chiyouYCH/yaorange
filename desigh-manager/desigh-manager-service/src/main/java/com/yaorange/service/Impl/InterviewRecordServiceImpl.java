package com.yaorange.service.Impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yaorange.mapper.InterviewRecordsMapper;
import com.yaorange.pojo.DataResult;
import com.yaorange.pojo.EasyBuyResult;
import com.yaorange.pojo.InterviewRecords;
import com.yaorange.pojo.InterviewRecordsExample;
import com.yaorange.pojo.Student;
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

	@Override
	public EasyBuyResult deleteInterviewRecord(Integer id) {
		// TODO Auto-generated method stub
		int key=interviewRecordsMapper.deleteByPrimaryKey(id.longValue());
		if(key==1){
			return EasyBuyResult.build(200, "删除成功");
		}
		return EasyBuyResult.build(200, "删除失败");
	}

	@Override
	public InterviewRecords getInterviewRecordById(Integer id) {
		// TODO Auto-generated method stub
		return interviewRecordsMapper.selectByPrimaryKey(id.longValue());
	}

	@Override
	public EasyBuyResult updateInterviewRecord(InterviewRecords interviewRecords) {
		int key = interviewRecordsMapper.updateByPrimaryKeySelective(interviewRecords);
		if (key > 0) {
			return EasyBuyResult.build(200, "修改成功");
		}
		return EasyBuyResult.build(200, "修改失败，请重试");
	}

	@Override
	public EasyBuyResult saveInterviewRecord(InterviewRecords interviewRecords) {
		// TODO Auto-generated method stub
		try {
			interviewRecordsMapper.insert(interviewRecords);
			return EasyBuyResult.build(200,"添加成功");
		} catch (Exception e) {
			return EasyBuyResult.build(200,"添加失败");
		}
	}

}
