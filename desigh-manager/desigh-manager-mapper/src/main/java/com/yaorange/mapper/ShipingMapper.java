package com.yaorange.mapper;

import com.yaorange.pojo.Shiping;
import com.yaorange.pojo.ShipingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShipingMapper {
    int countByExample(ShipingExample example);

    int deleteByExample(ShipingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Shiping record);

    int insertSelective(Shiping record);

    List<Shiping> selectByExample(ShipingExample example);

    Shiping selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Shiping record, @Param("example") ShipingExample example);

    int updateByExample(@Param("record") Shiping record, @Param("example") ShipingExample example);

    int updateByPrimaryKeySelective(Shiping record);

    int updateByPrimaryKey(Shiping record);
}