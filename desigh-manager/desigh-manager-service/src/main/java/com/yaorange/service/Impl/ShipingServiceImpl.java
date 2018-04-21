package com.yaorange.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yaorange.mapper.ShipingMapper;
import com.yaorange.pojo.DataResult;
import com.yaorange.pojo.EasyBuyResult;
import com.yaorange.pojo.Shiping;
import com.yaorange.pojo.ShipingExample;
import com.yaorange.pojo.StudentExample;
import com.yaorange.pojo.ShipingExample.Criteria;
import com.yaorange.service.ShipingService;
@Service
public class ShipingServiceImpl implements ShipingService {
    @Autowired private ShipingMapper shipingMapper;
	@Override
	public DataResult getShipingList(String name, Integer pageIndex, Integer pageSize) {
		PageHelper.startPage(pageIndex, pageSize);
		ShipingExample example=new ShipingExample();
		Criteria criteria= example.createCriteria();
		if(StringUtils.isNoneEmpty(name)){
			criteria.andTitleLike("%"+name+"%");
		}
		List<Shiping> list=shipingMapper.selectByExample(example);
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
	public EasyBuyResult saveShiping(Shiping shiping) {
		int key=shipingMapper.insert(shiping);
		if(key>0){
			return EasyBuyResult.build(200,"添加成功");
		}
		return EasyBuyResult.build(200,"添加失败，请重试");
	}
	@Override
	public Shiping getShipingById(Integer id) {
		return shipingMapper.selectByPrimaryKey(id);
	}
	@Override
	public EasyBuyResult updateShiping(Shiping shiping) {
		int key=shipingMapper.updateByPrimaryKeySelective(shiping);
		if (key > 0) {
			return EasyBuyResult.build(200, "修改成功");
		}
		return EasyBuyResult.build(200, "修改失败，请重试");
	}
	@Override
	public EasyBuyResult deleteShiping(Integer id) {
		int key=shipingMapper.deleteByPrimaryKey(id);
		if (key > 0) {
			return EasyBuyResult.build(200, "修改成功");
		}
		return EasyBuyResult.build(200, "修改失败，请重试");
	}
	@Override
	public EasyBuyResult deleteAllShiping(String ids) {
		ShipingExample example=new ShipingExample();
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
		int key = shipingMapper.deleteByExample(example);
		if (key > 0) {
			return EasyBuyResult.build(200, "删除成功");
		}
		return EasyBuyResult.build(200, "删除失败，请重试");
	}

}
