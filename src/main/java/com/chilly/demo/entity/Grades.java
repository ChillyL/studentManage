package com.chilly.demo.entity;

/**
 * @auther ChillyLin
 * @date 2019/12/29
 */
public class Grades {
    private String g_student_id;  //学号
    private String g_course_id;   //课程编号
    private String g_course_name;   //课程名称
    private String g_course_sort;   //课程类型
    private int g_course_credit;   //学分
    private int grades;  //成绩
    private String g_course_time;   //课程时间
    private String grades_remark;   //备注

    public int getG_course_credit() {
        return g_course_credit;
    }

    public void setG_course_credit(int g_course_credit) {
        this.g_course_credit = g_course_credit;
    }

    public String getG_course_sort() {
        return g_course_sort;
    }

    public void setG_course_sort(String g_course_sort) {
        this.g_course_sort = g_course_sort;
    }

    public int getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }

    public String getG_course_id() {
        return g_course_id;
    }

    public void setG_course_id(String g_course_id) {
        this.g_course_id = g_course_id;
    }

    public String getG_course_time() {
        return g_course_time;
    }

    public void setG_course_time(String g_course_time) {
        this.g_course_time = g_course_time;
    }

    public String getG_student_id() {
        return g_student_id;
    }

    public void setG_student_id(String g_student_id) {
        this.g_student_id = g_student_id;
    }

    public String getGrades_remark() {
        return grades_remark;
    }

    public void setGrades_remark(String grades_remark) {
        this.grades_remark = grades_remark;
    }

    public String getG_course_name() {
        return g_course_name;
    }

    public void setG_course_name(String g_course_name) {
        this.g_course_name = g_course_name;
    }
}
