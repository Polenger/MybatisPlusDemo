package com.loikun.controller;

import com.loikun.domain.UserReq;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * 用户控制层： 简单测试功能
 */
@RestController
@RequestMapping("/user")
@Api(tags = "控制层提供的api")
public class UserController {

    @PostMapping("add")
    @ApiOperation(value = "用户新增")
    public Map<String, String> addUser(@Valid @RequestBody UserReq userReq){
        System.out.println("用户新增");
        System.out.println(userReq);
        Map<String,String> result = new HashMap<>();
        result.put("respCode", "01");
        result.put("respMsg", "新增成功");
        return result;
    }

    @ApiOperation(value = "用户查询{id}")
    @GetMapping("query/{id}")
    public Map<String,String> queryUser(@PathVariable("id") String id){
        Map<String,String> result = new HashMap<>();
        result.put("respCode", "01");
        result.put("respMsg", "查询的信息");
        result.put("data", "查询得到的数据");
        return result;
    }


}
