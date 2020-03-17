package com.xdl.controller;

import com.xdl.bean.KnowledgePoint;
import com.xdl.services.PointManageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class PointManageController {
    @Resource
    private PointManageService pointManageService;

    @RequestMapping(value = "/admin/PointManage/PointAdd", method = RequestMethod.POST)
    @ResponseBody
    public int insertPoint(@RequestParam("name") String point_name, @RequestParam("memo") String memo) {
        if (!point_name.isEmpty()) {
            if (!memo.isEmpty()) {
                return pointManageService.insertPoint(point_name, memo);
            }
        }
        return 0;
    }
    @RequestMapping(value = "/admin/PointManage/getAllPoint", method = RequestMethod.GET)
    @ResponseBody
    public List<KnowledgePoint> getAllPoint() {
        return pointManageService.getAllPoint();
    }

    @RequestMapping(value = "/admin/PointManage/deletePoint/{id}", method = RequestMethod.POST)
    @ResponseBody
    public int deletePointById(@PathVariable("id") String id) {
        System.out.println(id);
        return pointManageService.deletePointById(id);
    }
}
