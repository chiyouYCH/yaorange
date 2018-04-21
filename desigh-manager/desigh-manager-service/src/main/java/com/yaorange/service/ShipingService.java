package com.yaorange.service;

import com.yaorange.pojo.DataResult;
import com.yaorange.pojo.EasyBuyResult;
import com.yaorange.pojo.Shiping;

public interface ShipingService {

	DataResult getShipingList(String name, Integer pageIndex, Integer pageSize);

	EasyBuyResult saveShiping(Shiping shiping);

	Shiping getShipingById(Integer id);

	EasyBuyResult updateShiping(Shiping shiping);

	EasyBuyResult deleteShiping(Integer id);

	EasyBuyResult deleteAllShiping(String ids);

}
