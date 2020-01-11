package com.chilly.demo.entity;

/**
 * @auther ChillyLin
 * @date 2020/1/1
 */
public class Department {
    private int department_id;  //院系代号
    private String department_name;  //院系名称
    private String department_remarks;  //备注

    public String getDepartment_name() {
        return department_name;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public String getDepartment_remarks() {
        return department_remarks;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public void setDepartment_remarks(String department_remarks) {
        this.department_remarks = department_remarks;
    }
}
