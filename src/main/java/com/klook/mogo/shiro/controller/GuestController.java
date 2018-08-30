package com.klook.mogo.shiro.controller;

import com.klook.mogo.shiro.model.ResultMap;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA
 *
 * @Author mogo
 * @Description 游客角色可以访问的页面
 * @Date 2018-04-30
 * @Time 14:24
 */
@RestController
@RequestMapping("/guest")
public class GuestController {
    private final ResultMap resultMap;

    @Autowired
    public GuestController(ResultMap resultMap) {
        this.resultMap = resultMap;
    }

    @GetMapping("/welcome")
    public ResultMap login() {
        return resultMap.success().code(200).message("欢迎访问游客页面！！");
    }
}
