package com.xcy.pojo;

import io.swagger.annotations.ApiModelProperty;

public class Cases {
    @ApiModelProperty("模板序号")
    private int id;
    @ApiModelProperty("模板类型")
    private String type;
    @ApiModelProperty("名称")
    private String companyname;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompanyname() {
        return companyname;

    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    @Override
    public String toString() {
        return "Case{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", companyname='" + companyname + '\'' +
                '}';
    }
}
