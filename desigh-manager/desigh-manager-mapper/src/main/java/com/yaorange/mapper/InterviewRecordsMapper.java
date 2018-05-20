package com.yaorange.mapper;

import com.yaorange.pojo.InterviewRecords;
import com.yaorange.pojo.InterviewRecordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InterviewRecordsMapper {
    int countByExample(InterviewRecordsExample example);

    int deleteByExample(InterviewRecordsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InterviewRecords record);

    int insertSelective(InterviewRecords record);

    List<InterviewRecords> selectByExample(InterviewRecordsExample example);

    InterviewRecords selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InterviewRecords record, @Param("example") InterviewRecordsExample example);

    int updateByExample(@Param("record") InterviewRecords record, @Param("example") InterviewRecordsExample example);

    int updateByPrimaryKeySelective(InterviewRecords record);

    int updateByPrimaryKey(InterviewRecords record);

	List<InterviewRecords> findList(String name);
}