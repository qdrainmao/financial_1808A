package com.bawei.entity.enums;

public enum ProductStatusEnum {
    AUDITING("审核中"),
    IN_SELL("销售中"),
    LOCKED("暂停销售"),
    FINISHED("已结束");

    private String desc;

    ProductStatusEnum(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
