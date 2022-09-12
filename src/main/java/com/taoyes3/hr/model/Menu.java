package com.taoyes3.hr.model;

import lombok.Data;

import java.util.List;

@Data
public class Menu {
    private Integer id;

    private String url;

    private String path;

    private String component;

    private String name;

    private String iconCls;

    private Integer parentId;

    private Boolean enabled;

    private Meta meta;

    private List<Menu> children;
}