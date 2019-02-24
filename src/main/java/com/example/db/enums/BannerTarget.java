package com.example.db.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;

public enum  BannerTarget {
    Blank(0, "新的窗口"),
    Self(1, "当前窗口");


    @EnumValue
    private final Integer code;

    private final String desc;

    private BannerTarget(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }
}
