package com.yaorange.service;

import com.yaorange.pojo.Dagang;
import com.yaorange.pojo.DataResult;
import com.yaorange.pojo.EasyBuyResult;

public interface DagangService {

	DataResult getDagangList(String name, Integer pageIndex, Integer pageSize);

	EasyBuyResult saveDagang(Dagang dagang);

	Dagang getDagangById(Integer id);

	EasyBuyResult deleteDagang(Integer id);

	EasyBuyResult deleteAllDagang(String ids);

	EasyBuyResult updateDagang(Dagang dagang);

}
