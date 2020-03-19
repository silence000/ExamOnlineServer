package com.xdl.controller;

import com.xdl.bean.PaperCreateParam;
import com.xdl.services.PaperAddService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class PaperAddController {
    @Resource
    private PaperAddService paperAddService;

    @RequestMapping(value = "/admin/PaperManage/PaperAdd/addPaper", method = RequestMethod.POST)
    @ResponseBody
    public int addPaper(@RequestBody PaperCreateParam paperCreateParam){
        return paperAddService.addPaper(paperCreateParam);
    }
}
