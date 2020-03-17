package com.xdl.services;

import com.xdl.bean.KnowledgePoint;
import com.xdl.mapper.KnowledgePointMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PointManageService {
    @Resource
    private KnowledgePointMapper knowledgePointMapper;

    public int insertPoint(String point_name, String memo) {
        return knowledgePointMapper.insertPoint(point_name, memo);
    }

    public List<KnowledgePoint> getAllPoint() {
        return knowledgePointMapper.getAllPoint();
    }

    public int deletePointById(String point_id) {
        return knowledgePointMapper.deletePointById(point_id);
    }
}
