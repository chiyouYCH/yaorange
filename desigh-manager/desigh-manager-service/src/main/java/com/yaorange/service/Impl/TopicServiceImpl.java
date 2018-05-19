package com.yaorange.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yaorange.mapper.TopicMapper;
import com.yaorange.pojo.DataResult;
import com.yaorange.pojo.EasyBuyResult;
import com.yaorange.pojo.Student;
import com.yaorange.pojo.StudentExample;
import com.yaorange.pojo.Topic;
import com.yaorange.pojo.TopicExample;
import com.yaorange.pojo.TopicExample.Criteria;
import com.yaorange.service.TopicService;
@Service
public class TopicServiceImpl implements TopicService {
    @Autowired
    private TopicMapper topicMapper;
    
	@Override
	public DataResult getTopicList(String TopicName,String knowpointName, String courseName, Integer pageIndex, Integer pageSize){
		PageHelper.startPage(pageIndex, pageSize);
		TopicExample example=new TopicExample();
		Criteria criteria = example.createCriteria();
		if(StringUtils.isNotEmpty(TopicName)){
			criteria.andStemNameLike("%"+TopicName+"%");
		}
		if(StringUtils.isNotEmpty(knowpointName)){
			criteria.andKnowpointLike("%"+knowpointName+"%");
		}
		if(StringUtils.isNotEmpty(courseName)){
			criteria.andCourseLike("%"+courseName+"%");
		}
		//example.setOrderByClause("id desc");
		List<Topic> list = topicMapper.selectByExample(example);
		PageInfo<Topic> pageInfo=new PageInfo<>(list);
		long total=pageInfo.getTotal();
		DataResult result=new DataResult();
		result.setCount(total);
		result.setList(list);
		result.setMsg("获取成功");
		result.setRel(true);
		return result;
	}
	public EasyBuyResult savetopic(Topic topic) {
		try {
			topicMapper.insert(topic);
			return EasyBuyResult.build(200,"添加成功");
		} catch (Exception e) {
			return EasyBuyResult.build(200,"添加失败");
		}
	}
	@Override
	public EasyBuyResult deleteTopic(Integer id) {
		int key = topicMapper.deleteByPrimaryKey(id);
		if (key > 0) {
			return EasyBuyResult.build(200, "删除成功");
		}
		return EasyBuyResult.build(200, "删除失败，请重试");
	}
	public List<Topic> gettopicList() {
//		topicExample example = new topicExample();
//		List<topic> list = topicMapper.selectByExample(example);
		return null;
	}
	@Override
	public EasyBuyResult updateTopic(Topic topic) {
		int key = topicMapper.updateByPrimaryKeySelective(topic);
		if (key > 0) {
			return EasyBuyResult.build(200, "修改成功");
		}
		return EasyBuyResult.build(200, "修改失败，请重试");
	}
	@Override
	public Topic getTopicById(Integer id) {
		return topicMapper.selectByPrimaryKey(id);
	}
	@Override
	public EasyBuyResult deleteAllTopic(String ids) {
		TopicExample example=new TopicExample();
		Criteria criteria=example.createCriteria();
		List<Integer> list=new ArrayList<>();
		String [] split=ids.split(",");
		for (String str : split){
			if(StringUtils.isNotEmpty(str)){
				Integer id = Integer.valueOf(str).intValue();
				list.add(id);
			}						
		}
		criteria.andIdIn(list);
		int key = topicMapper.deleteByExample(example);
		if (key > 0) {
			return EasyBuyResult.build(200, "删除成功");
		}
		return EasyBuyResult.build(200, "删除失败，请重试");
	}
	
	@Override
	public EasyBuyResult saveTopic(Topic topic) {
		topic.setNumber(1);
		int key = topicMapper.insert(topic);
		if (key > 0) {
			return EasyBuyResult.build(200, "添加成功");
		}
		return EasyBuyResult.build(200, "添加失败，请重试");
	}

}
