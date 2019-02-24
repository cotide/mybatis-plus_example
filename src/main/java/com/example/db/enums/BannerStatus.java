package com.example.db.enums;


import com.baomidou.mybatisplus.annotation.EnumValue;

public enum BannerStatus  {
    Normal(0, "正常"),
    Stop(-1, "禁止");

    @EnumValue
    private final Integer code;
    private final String desc;

    private BannerStatus(Integer code, String desc) {
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
