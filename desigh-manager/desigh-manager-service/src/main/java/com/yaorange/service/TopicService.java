package com.yaorange.service;

import java.util.List;

import com.yaorange.pojo.Topic;
import com.yaorange.pojo.DataResult;
import com.yaorange.pojo.EasyBuyResult;

public interface TopicService {

	DataResult getTopicList(String TopicName,String knowpointName, String courseName, Integer pageIndex, Integer pageSize);

	EasyBuyResult saveTopic(Topic topic);

	EasyBuyResult deleteTopic(Integer id);

	EasyBuyResult updateTopic(Topic topic);

	Topic getTopicById(Integer id);

	EasyBuyResult deleteAllTopic(String ids);

}
