package com.yaorange.service.Impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yaorange.mapper.CourseMapper;
import com.yaorange.mapper.KnowpointMapper;
import com.yaorange.pojo.Course;
import com.yaorange.pojo.DataResult;
import com.yaorange.pojo.EasyBuyResult;
import com.yaorange.pojo.Knowpoint;
import com.yaorange.pojo.KnowpointExample;
import com.yaorange.pojo.KnowpointExample.Criteria;
import com.yaorange.service.KnowPointService;
@Service
public class KnowPointServiceImpl implements KnowPointService {
    @Autowired
    private KnowpointMapper knowPointMapper;
    @Autowired
    private CourseMapper courseMapper;
    
	@Override
	public DataResult getKnowPointList(String username, Integer pageIndex, Integer pageSize){
		PageHelper.startPage(pageIndex, pageSize);
		KnowpointExample example=new KnowpointExample();
		Criteria criteria = example.createCriteria();
		if(StringUtils.isNotEmpty(username)){
			criteria.andKnowpointNameLike("%"+username+"%");
		}
		List<Knowpoint> list = knowPointMapper.selectByExample(example);
		PageInfo<Knowpoint> pageInfo=new PageInfo<>(list);
		long total=pageInfo.getTotal();
		DataResult result=new DataResult();
		result.setCount(total);
		result.setList(list);
		result.setMsg("获取成功");
		result.setRel(true);
		return result;
	}
	public EasyBuyResult saveKnowPoint(Integer courseId,String knowpointName) {
		
		try {
			Course course = courseMapper.selectByPrimaryKey(courseId);
			Knowpoint knowpoint = new Knowpoint();
			knowpoint.setCourseName(course.getCourseName());
			knowpoint.setKnowpointName(knowpointName);
			knowPointMapper.insert(knowpoint);
			return EasyBuyResult.build(200,"添加成功");
		} catch (Exception e) {
			return EasyBuyResult.build(200,"添加失败");
		}
	}
	@Override
	public EasyBuyResult deleteKnowPoint(Integer id) {
		int key = knowPointMapper.deleteByPrimaryKey(id);
		if (key > 0) {
			return EasyBuyResult.build(200, "删除成功");
		}
		return EasyBuyResult.build(200, "删除失败，请重试");
	}
	public List<Knowpoint> getKnowPointList() {
//		KnowPointExample example = new KnowPointExample();
//		List<KnowPoint> list = knowPointMapper.selectByExample(example);
		return null;
	}
	@Override
	public EasyBuyResult updateKnowPoint(Knowpoint knowPoint) {
//		knowPoint.setCreatetime(new Date());
		int key = knowPointMapper.updateByPrimaryKeySelective(knowPoint);
		if (key > 0) {
			return EasyBuyResult.build(200, "修改成功");
		}
		return EasyBuyResult.build(200, "修改失败，请重试");
	}
	@Override
	public Knowpoint getKnowPointById(Integer id) {
		return knowPointMapper.selectByPrimaryKey(id);
	}
	@Override
	public EasyBuyResult deleteAllKnowPoint(String ids) {
		KnowpointExample example=new KnowpointExample();
		Criteria criteria=example.createCriteria();
		List<Integer> list=new ArrayList<>();
		String [] split=ids.split(",");
		for (String str : split){
			if(StringUtils.isNotEmpty(str)){
				Integer id = Integer.valueOf(str).intValue();
				list.add(id);
			}						
		}
//		criteria.andIdIn(list);
		int key = knowPointMapper.deleteByExample(example);
		if (key > 0) {
			return EasyBuyResult.build(200, "删除成功");
		}
		return EasyBuyResult.build(200, "删除失败，请重试");
	}
	@Override
	public List<Knowpoint> getknowlist(String name) {
		KnowpointExample example=new KnowpointExample();
		Criteria criteria = example.createCriteria();
		if(!StringUtils.isBlank(name)){
//			criteria.andCourseNameEqualTo(name);
			criteria.andCourseNameLike(name);
		}
		return knowPointMapper.selectByExample(example);
	}

}
