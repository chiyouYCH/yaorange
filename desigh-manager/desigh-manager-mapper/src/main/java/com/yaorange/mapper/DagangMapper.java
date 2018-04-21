package com.yaorange.mapper;

import com.yaorange.pojo.Dagang;
import com.yaorange.pojo.DagangExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DagangMapper {
    int countByExample(DagangExample example);

    int deleteByExample(DagangExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dagang record);

    int insertSelective(Dagang record);

    List<Dagang> selectByExample(DagangExample example);

    Dagang selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dagang record, @Param("example") DagangExample example);

    int updateByExample(@Param("record") Dagang record, @Param("example") DagangExample example);

    int updateByPrimaryKeySelective(Dagang record);

    int updateByPrimaryKey(Dagang record);
}