package com.yaorange.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yaorange.mapper.KejianMapper;
import com.yaorange.pojo.DataResult;
import com.yaorange.pojo.EasyBuyResult;
import com.yaorange.pojo.Kejian;
import com.yaorange.pojo.KejianExample;
import com.yaorange.pojo.StudentExample;
import com.yaorange.pojo.KejianExample.Criteria;
import com.yaorange.service.KejianService;
@Service
public class KejianServiceImpl implements KejianService {
    @Autowired private KejianMapper kejianMapper;
	@Override
	public DataResult getKejianList(String name, Integer pageIndex, Integer pageSize) {
		PageHelper.startPage(pageIndex, pageSize);
		KejianExample example=new KejianExample();
		Criteria criteria= example.createCriteria();
		if(StringUtils.isNoneEmpty(name)){
			criteria.andTitleLike("%"+name+"%");
		}
		List<Kejian> list=kejianMapper.selectByExample(example);
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
	public EasyBuyResult saveKejian(Kejian kejian) {
		int key=kejianMapper.insert(kejian);
		if(key>0){
			return EasyBuyResult.build(200,"添加成功");
		}
		return EasyBuyResult.build(200,"添加失败，请重试");
	}
	@Override
	public Kejian getKejianById(Integer id) {
		return kejianMapper.selectByPrimaryKey(id);
	}
	@Override
	public EasyBuyResult updateKejian(Kejian kejian) {
		int key=kejianMapper.updateByPrimaryKeySelective(kejian);
		if (key > 0) {
			return EasyBuyResult.build(200, "修改成功");
		}
		return EasyBuyResult.build(200, "修改失败，请重试");
	}
	@Override
	public EasyBuyResult deleteKejian(Integer id) {
		int key=kejianMapper.deleteByPrimaryKey(id);
		if (key > 0) {
			return EasyBuyResult.build(200, "修改成功");
		}
		return EasyBuyResult.build(200, "修改失败，请重试");
	}
	@Override
	public EasyBuyResult deleteAllKejian(String ids) {
		KejianExample example=new KejianExample();
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
		int key = kejianMapper.deleteByExample(example);
		if (key > 0) {
			return EasyBuyResult.build(200, "删除成功");
		}
		return EasyBuyResult.build(200, "删除失败，请重试");
	}

}
