package com.chilly.demo.entity;

/**
 * @auther ChillyLin
 * @date 2019/12/30
 */
public class Teacher {
    private String teacher_id;
    private String teacher_name;
    private String teacher_sex;
    private String teacher_rank;
    private int department_id;
    private String department_name;

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String getTeacher_id() {
        return teacher_id;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public String getTeacher_rank() {
        return teacher_rank;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public String getTeacher_sex() {
        return teacher_sex;
    }

    public void setTeacher_id(String teacher_id) {
        this.teacher_id = teacher_id;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public void setTeacher_sex(String teacher_sex) {
        this.teacher_sex = teacher_sex;
    }

    public void setTeacher_rank(String teacher_rank) {
        this.teacher_rank = teacher_rank;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }
}
