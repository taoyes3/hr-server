package com.taoyes3.hr.service;

import com.taoyes3.hr.mapper.MenuMapper;
import com.taoyes3.hr.model.Hr;
import com.taoyes3.hr.model.Menu;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author taoyes3
 * @date 2022/9/11 18:13
 */
@Service
public class MenuService {
    @Resource
    private MenuMapper menuMapper;

    public List<Menu> getMenusByHrId() {
        Hr hr = (Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return menuMapper.getMenusByHrId(hr.getId());
    }
}
