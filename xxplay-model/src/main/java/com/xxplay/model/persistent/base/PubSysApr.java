package com.xxplay.model.persistent.base;


/**
 * 系统参数配置
 * 
 * @Author:chenssy
 * @date:2016年4月9日
 * 
 */
public class PubSysApr {
    private String id;

    private String code;

    private String showmsg;

    private String name;

    private String value;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getShowmsg() {
        return showmsg;
    }

    public void setShowmsg(String showmsg) {
        this.showmsg = showmsg == null ? null : showmsg.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}