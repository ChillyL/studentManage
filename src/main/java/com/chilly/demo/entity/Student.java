package com.chilly.demo.entity;

/**
 * @auther ChillyLin
 * @date 2019/12/29
 */
public class Student {
    private String student_id;  //学号
    private String student_name;  //姓名
    private String student_sex;  //性别
    private String student_birth;  //出生日期
    private String student_origin;  //生源地
    private int department_id;  //院系代号
    private String student_department;  //院系代号(多表查询转为院系名称)
    private String student_status;  //政治面貌
    private Boolean student_resident;  //是否住宿
    private String student_telephone;  //宿舍电话

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_sex() {
        return student_sex;
    }

    public void setStudent_sex(String student_sex) {
        this.student_sex = student_sex;
    }

    public String getStudent_birth() {
        return student_birth;
    }

    public void setStudent_birth(String student_birth) {
        this.student_birth = student_birth;
    }

    public String getStudent_origin() {
        return student_origin;
    }

    public void setStudent_origin(String student_origin) {
        this.student_origin = student_origin;
    }

    public String getStudent_department() {
        return student_department;
    }

    public void setStudent_department(String student_department) {
        this.student_department = student_department;
    }

    public Boolean getStudent_resident() {
        return student_resident;
    }

    public void setStudent_resident(Boolean student_resident) {
        this.student_resident = student_resident;
    }

    public String getStudent_status() {
        return student_status;
    }

    public void setStudent_status(String student_status) {
        this.student_status = student_status;
    }

    public String getStudent_telephone() {
        return student_telephone;
    }

    public void setStudent_telephone(String student_telephone) {
        this.student_telephone = student_telephone;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }
}

