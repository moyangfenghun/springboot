package com.yyt.weixinchengxu.entity;

import java.util.Date;

public class weixinUser {
    private Integer id;

    private String name;

    private Boolean sex;

    private Date birthday;

    private String phone;

    private String presentation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation == null ? null : presentation.trim();
    }

	@Override
	public String toString() {
		return "weixinUser [id=" + id + ", name=" + name + ", sex=" + sex + ", birthday=" + birthday + ", phone="
				+ phone + ", presentation=" + presentation + "]";
	}
    
}