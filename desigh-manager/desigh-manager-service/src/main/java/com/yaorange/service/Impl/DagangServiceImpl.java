package com.yaorange.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yaorange.mapper.DagangMapper;
import com.yaorange.pojo.DataResult;
import com.yaorange.pojo.EasyBuyResult;
import com.yaorange.pojo.Dagang;
import com.yaorange.pojo.DagangExample;
import com.yaorange.pojo.StudentExample;
import com.yaorange.pojo.DagangExample.Criteria;
import com.yaorange.service.DagangService;
@Service
public class DagangServiceImpl implements DagangService {
    @Autowired private DagangMapper dagangMapper;
	@Override
	public DataResult getDagangList(String name, Integer pageIndex, Integer pageSize) {
		PageHelper.startPage(pageIndex, pageSize);
		DagangExample example=new DagangExample();
		Criteria criteria= example.createCriteria();
		if(StringUtils.isNoneEmpty(name)){
			criteria.andTitleLike("%"+name+"%");
		}
		List<Dagang> list=dagangMapper.selectByExample(example);
		PageInfo pageInfo=new PageInfo<>(list);
		long total=pageInfo.getTotal();
		DataResult result=new DataResult();
		result.setCount(total);
		result.setList(list);
		result.setRel(true);
		result.setMsg("获取成功");
		return result;
	}
	@Override
	public EasyBuyResult saveDagang(Dagang dagang) {
		int key=dagangMapper.insert(dagang);
		if(key>0){
			return EasyBuyResult.build(200,"添加成功");
		}
		return EasyBuyResult.build(200,"添加失败，请重试");
	}
	@Override
	public Dagang getDagangById(Integer id) {
		return dagangMapper.selectByPrimaryKey(id);
	}
	@Override
	public EasyBuyResult updateDagang(Dagang dagang) {
		int key=dagangMapper.updateByPrimaryKeySelective(dagang);
		if (key > 0) {
			return EasyBuyResult.build(200, "修改成功");
		}
		return EasyBuyResult.build(200, "修改失败，请重试");
	}
	@Override
	public EasyBuyResult deleteDagang(Integer id) {
		int key=dagangMapper.deleteByPrimaryKey(id);
		if (key > 0) {
			return EasyBuyResult.build(200, "修改成功");
		}
		return EasyBuyResult.build(200, "修改失败，请重试");
	}
	@Override
	public EasyBuyResult deleteAllDagang(String ids) {
		DagangExample example=new DagangExample();
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
		int key = dagangMapper.deleteByExample(example);
		if (key > 0) {
			return EasyBuyResult.build(200, "删除成功");
		}
		return EasyBuyResult.build(200, "删除失败，请重试");
	}

}
