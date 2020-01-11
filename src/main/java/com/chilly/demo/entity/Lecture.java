package com.chilly.demo.entity;

/**
 * @auther ChillyLin
 * @date 2019/12/30
 */
public class Lecture {
    private String l_teacher_id;  //教师编号
    private String l_course_id;   //课程编号
    private String l_course_time;   //课程时间
    private String l_course_name;  //课程名称
    private String l_course_sort;   //课程类型
    private String l_course_exam;   //考核方式
    private int l_course_credit;   //学分

    public int getL_course_credit() {
        return l_course_credit;
    }

    public String getL_course_exam() {
        return l_course_exam;
    }

    public String getL_course_id() {
        return l_course_id;
    }

    public String getL_course_name() {
        return l_course_name;
    }

    public String getL_course_sort() {
        return l_course_sort;
    }

    public String getL_course_time() {
        return l_course_time;
    }

    public String getL_teacher_id() {
        return l_teacher_id;
    }

    public void setL_course_credit(int l_course_credit) {
        this.l_course_credit = l_course_credit;
    }

    public void setL_course_exam(String l_course_exam) {
        this.l_course_exam = l_course_exam;
    }

    public void setL_course_id(String l_course_id) {
        this.l_course_id = l_course_id;
    }

    public void setL_course_name(String l_course_name) {
        this.l_course_name = l_course_name;
    }

    public void setL_course_sort(String l_course_sort) {
        this.l_course_sort = l_course_sort;
    }

    public void setL_course_time(String l_course_time) {
        this.l_course_time = l_course_time;
    }

    public void setL_teacher_id(String l_teacher_id) {
        this.l_teacher_id = l_teacher_id;
    }
}
