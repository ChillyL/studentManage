package com.chilly.demo.entity;

/**
 * @auther ChillyLin
 * @date 2019/12/29
 */
public class Course {
    private String course_id;   //课程编号
    private String course_name;   //课程名称
    private String course_sort;   //课程类型
    private String course_exam;   //考核方式
    private int course_credit;   //学分
    private String course_remark; //备注

    public int getCourse_credit() {
        return course_credit;
    }

    public void setCourse_credit(int course_credit) {
        this.course_credit = course_credit;
    }

    public String getCourse_exam() {
        return course_exam;
    }

    public String getCourse_id() {
        return course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public String getCourse_remark() {
        return course_remark;
    }

    public String getCourse_sort() {
        return course_sort;
    }

    public void setCourse_exam(String course_exam) {
        this.course_exam = course_exam;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public void setCourse_sort(String course_sort) {
        this.course_sort = course_sort;
    }

    public void setCourse_remark(String course_remark) {
        this.course_remark = course_remark;
    }
}
