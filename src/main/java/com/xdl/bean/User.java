package com.xdl.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class User implements Serializable {
    private Integer id; // 主键
    private String username; // 账号
    private String truename; // 真实姓名
    private String password; // 密码
    private String email; // 邮箱
    private String phone; // 手机
    private Timestamp add_date; // 注册时间
    private Timestamp expire_date; // 有效日期
    private Integer add_by; // 创建人
    private Integer enabled; // 激活状态：0-未激活 1-激活
    private Integer field_id; // 题库ID
    private Timestamp last_login_time; // 上一次登录时间
    private Timestamp login_time; // 最后一次登录时间
    private String province; // 省份
    private String company; // 公司
    private String department; // 介绍
    private Integer classID; // 班级ID

    public User() {
    }

    public User(Integer id, String username, String truename, String password, String email, String phone, Timestamp add_date, Timestamp expire_date, Integer add_by, Integer enabled, Integer field_id, Timestamp last_login_time, Timestamp login_time, String province, String company, String department, Integer classID) {
        this.id = id;
        this.username = username;
        this.truename = truename;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.add_date = add_date;
        this.expire_date = expire_date;
        this.add_by = add_by;
        this.enabled = enabled;
        this.field_id = field_id;
        this.last_login_time = last_login_time;
        this.login_time = login_time;
        this.province = province;
        this.company = company;
        this.department = department;
        this.classID = classID;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", truename='" + truename + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", add_date=" + add_date +
                ", expire_date=" + expire_date +
                ", add_by=" + add_by +
                ", enabled=" + enabled +
                ", field_id=" + field_id +
                ", last_login_time=" + last_login_time +
                ", login_time=" + login_time +
                ", province='" + province + '\'' +
                ", company='" + company + '\'' +
                ", department='" + department + '\'' +
                ", classID=" + classID +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Timestamp getAdd_date() {
        return add_date;
    }

    public void setAdd_date(Timestamp add_date) {
        this.add_date = add_date;
    }

    public Timestamp getExpire_date() {
        return expire_date;
    }

    public void setExpire_date(Timestamp expire_date) {
        this.expire_date = expire_date;
    }

    public Integer getAdd_by() {
        return add_by;
    }

    public void setAdd_by(Integer add_by) {
        this.add_by = add_by;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public Integer getField_id() {
        return field_id;
    }

    public void setField_id(Integer field_id) {
        this.field_id = field_id;
    }

    public Timestamp getLast_login_time() {
        return last_login_time;
    }

    public void setLast_login_time(Timestamp last_login_time) {
        this.last_login_time = last_login_time;
    }

    public Timestamp getLogin_time() {
        return login_time;
    }

    public void setLogin_time(Timestamp login_time) {
        this.login_time = login_time;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getClassID() {
        return classID;
    }

    public void setClassID(Integer classID) {
        this.classID = classID;
    }
}
