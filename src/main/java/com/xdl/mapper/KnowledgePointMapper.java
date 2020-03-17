package com.xdl.mapper;

import com.xdl.bean.KnowledgePoint;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface KnowledgePointMapper {
    @Insert("INSERT INTO knowledge_point (point_name, memo) VALUES (#{point_name}, #{memo})")
    public int insertPoint(@Param("point_name") String point_name, @Param("memo") String memo);

    @Select("SELECT * FROM knowledge_point")
    public List<KnowledgePoint> getAllPoint();

    @Delete("DELETE FROM knowledge_point WHERE point_id = #{point_id};")
    public int deletePointById(@Param("point_id") String point_id);
}
