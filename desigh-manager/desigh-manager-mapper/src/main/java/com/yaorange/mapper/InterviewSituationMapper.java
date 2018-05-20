package com.yaorange.mapper;

import com.yaorange.pojo.InterviewSituation;
import com.yaorange.pojo.InterviewSituationExample;
import com.yaorange.pojo.InterviewSituationWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InterviewSituationMapper {
    int countByExample(InterviewSituationExample example);

    int deleteByExample(InterviewSituationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InterviewSituationWithBLOBs record);

    int insertSelective(InterviewSituationWithBLOBs record);

    List<InterviewSituationWithBLOBs> selectByExampleWithBLOBs(InterviewSituationExample example);

    List<InterviewSituation> selectByExample(InterviewSituationExample example);

    InterviewSituationWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InterviewSituationWithBLOBs record, @Param("example") InterviewSituationExample example);

    int updateByExampleWithBLOBs(@Param("record") InterviewSituationWithBLOBs record, @Param("example") InterviewSituationExample example);

    int updateByExample(@Param("record") InterviewSituation record, @Param("example") InterviewSituationExample example);

    int updateByPrimaryKeySelective(InterviewSituationWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(InterviewSituationWithBLOBs record);

    int updateByPrimaryKey(InterviewSituation record);
}