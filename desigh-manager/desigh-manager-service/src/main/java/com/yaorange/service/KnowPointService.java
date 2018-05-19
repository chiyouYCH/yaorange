package com.yaorange.service;

import java.util.List;

import com.yaorange.pojo.Course;
import com.yaorange.pojo.DataResult;
import com.yaorange.pojo.EasyBuyResult;
import com.yaorange.pojo.Knowpoint;

public interface KnowPointService {

	DataResult getKnowPointList(String name, Integer pageIndex, Integer pageSize);

	EasyBuyResult saveKnowPoint(Integer courseId,String knowpointName);

	EasyBuyResult deleteKnowPoint(Integer id);

	EasyBuyResult updateKnowPoint(Knowpoint knowPoint);

	Knowpoint getKnowPointById(Integer id);

	EasyBuyResult deleteAllKnowPoint(String ids);

	List<Knowpoint> getknowlist(String name);

}
