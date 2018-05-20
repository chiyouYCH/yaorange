package com.yaorange.mapper;

import com.yaorange.pojo.EmploymentSituation;
import com.yaorange.pojo.EmploymentSituationExample;
import com.yaorange.pojo.EmploymentSituationWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmploymentSituationMapper {
    int countByExample(EmploymentSituationExample example);

    int deleteByExample(EmploymentSituationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(EmploymentSituationWithBLOBs record);

    int insertSelective(EmploymentSituationWithBLOBs record);

    List<EmploymentSituationWithBLOBs> selectByExampleWithBLOBs(EmploymentSituationExample example);

    List<EmploymentSituation> selectByExample(EmploymentSituationExample example);

    EmploymentSituationWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EmploymentSituationWithBLOBs record, @Param("example") EmploymentSituationExample example);

    int updateByExampleWithBLOBs(@Param("record") EmploymentSituationWithBLOBs record, @Param("example") EmploymentSituationExample example);

    int updateByExample(@Param("record") EmploymentSituation record, @Param("example") EmploymentSituationExample example);

    int updateByPrimaryKeySelective(EmploymentSituationWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EmploymentSituationWithBLOBs record);

    int updateByPrimaryKey(EmploymentSituation record);
}