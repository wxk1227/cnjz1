package com.xcy.controller;

import com.xcy.pojo.Cases;
import com.xcy.service.CaseService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CaseController {

    @Autowired
    private CaseService caseService;

    @ApiOperation("展示所有模板")
    @RequestMapping("showAllList")
    public List<Cases> showAllList() {
        return caseService.selectAllCase();

    }

    @ApiOperation("通过id查询模板，如果查询成功返回true，查询失败返回false")
    @RequestMapping("selectById")
    public String selectById(int id){
        int a = caseService.selectById(id);
        if(a>0){
            return "success";
        }else{
            return "fail";
        }


    }

    @ApiOperation("通过关键字查询模板，如果查询成功返回true，查询失败返回false")
    @RequestMapping("selectByName")
    public String selectByName(String string){
        int b = caseService.selectByName(string);
        if (b>0){
            return "true";
        }else {
            return "false";
        }
    }

    @RequestMapping("/insertCases")
    @ApiOperation("添加模板，如果添加成功返回true，添加失败返回false")
    public String insertCases(Cases cases){
        int a=caseService.insertCases(cases);
//        BigInteger b = new BigInteger(a);
        if(a>0){
            return "true";
        }else {
            return "false";
        }

    }

    @RequestMapping("getCasesById")
    @ApiOperation("跳转编辑页面")
    public String getCasesById(int id){
        caseService.selectById(id);
        return "";
    }

    @RequestMapping("/updateCases")
    @ApiOperation("编辑修改对心仪对象的要求，如果修改成功返回true，修改失败返回false")
    public String updatecases(Cases cases){

        int a = caseService.updateCases(cases);
        if (a>0){
            return "true";
        }else {
            return "false";
        }

    }

}
