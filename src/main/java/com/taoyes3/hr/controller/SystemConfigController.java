package com.taoyes3.hr.controller;

import com.taoyes3.hr.model.Menu;
import com.taoyes3.hr.service.MenuService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author taoyes3
 * @date 2022/9/11 18:11
 */
@RestController
@RequestMapping("/system/config")
public class SystemConfigController {
    @Resource
    private MenuService menuService;

    @GetMapping("/menu")
    public List<Menu> getMenusByHrId() {
        return menuService.getMenusByHrId();
    }
}
