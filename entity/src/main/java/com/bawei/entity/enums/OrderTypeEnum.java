package com.bawei.entity.enums;

public enum OrderTypeEnum {
    APPLY("申购"),
    REDEEM("赎回");

    private String desc;

    OrderTypeEnum(String desc) {
        this.desc = desc;
    }
}
