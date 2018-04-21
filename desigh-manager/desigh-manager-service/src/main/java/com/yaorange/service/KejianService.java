package com.yaorange.service;

import com.yaorange.pojo.DataResult;
import com.yaorange.pojo.EasyBuyResult;
import com.yaorange.pojo.Kejian;

public interface KejianService {

	DataResult getKejianList(String name, Integer pageIndex, Integer pageSize);

	EasyBuyResult saveKejian(Kejian kejian);

	Kejian getKejianById(Integer id);

	EasyBuyResult updateKejian(Kejian kejian);

	EasyBuyResult deleteKejian(Integer id);

	EasyBuyResult deleteAllKejian(String ids);

}
