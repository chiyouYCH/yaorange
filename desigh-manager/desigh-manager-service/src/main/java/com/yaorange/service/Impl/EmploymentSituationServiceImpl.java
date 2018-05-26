package com.yaorange.service.Impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yaorange.mapper.EmploymentSituationMapper;
import com.yaorange.mapper.InterviewRecordsMapper;
import com.yaorange.pojo.DataResult;
import com.yaorange.pojo.EasyBuyResult;
import com.yaorange.pojo.EmploymentSituation;
import com.yaorange.pojo.EmploymentSituationExample;
import com.yaorange.pojo.EmploymentSituationWithBLOBs;
import com.yaorange.pojo.InterviewRecords;
import com.yaorange.pojo.InterviewRecordsExample;
import com.yaorange.pojo.InterviewRecordsExample.Criteria;
import com.yaorange.service.EmploymentSituationService;

@Service
public class EmploymentSituationServiceImpl implements EmploymentSituationService {
	
	@Autowired
	private EmploymentSituationMapper employmentSituationMapper;

	@Override
	public DataResult getEmploymentSituationList(String name, Integer pageIndex, Integer pageSize) {
		PageHelper.startPage(pageIndex, pageSize);
		EmploymentSituationExample employmentSituationExample = new EmploymentSituationExample();
		
		EmploymentSituationExample.Criteria criteria = employmentSituationExample.createCriteria();

		List<EmploymentSituation> employmentSituationList=employmentSituationMapper.selectByExample(employmentSituationExample);
	
	    PageInfo<EmploymentSituation> pageInfo = new PageInfo<>(employmentSituationList);
	    long total= pageInfo.getTotal();
	    DataResult result=new DataResult();
	    result.setList(employmentSituationList);
	    result.setCount(total);
	    result.setRel(true);
	    result.setMsg("获取成功");
		return result;
		
	}

	@Override
	public DataResult savaEmploymentSituation(EmploymentSituationWithBLOBs em) {
		// TODO Auto-generated method stub
		 DataResult result=new DataResult();
		try {
			int rs = employmentSituationMapper.insertSelective(em);
			if(rs>0){
			result.setRel(true);
			 result.setMsg("添加成功");
			}else {
				result.setRel(false);
				 result.setMsg("添加失败");
			}
		} catch (Exception e) {
			e.printStackTrace();
			result.setRel(false);
			 result.setMsg("添加失败");
		}
		return result;
	}

}
