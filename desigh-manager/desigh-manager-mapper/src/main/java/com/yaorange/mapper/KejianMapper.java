package com.yaorange.mapper;

import com.yaorange.pojo.Kejian;
import com.yaorange.pojo.KejianExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KejianMapper {
    int countByExample(KejianExample example);

    int deleteByExample(KejianExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Kejian record);

    int insertSelective(Kejian record);

    List<Kejian> selectByExample(KejianExample example);

    Kejian selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Kejian record, @Param("example") KejianExample example);

    int updateByExample(@Param("record") Kejian record, @Param("example") KejianExample example);

    int updateByPrimaryKeySelective(Kejian record);

    int updateByPrimaryKey(Kejian record);
}