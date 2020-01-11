package com.chilly.demo.mapper;

import com.chilly.demo.entity.Course;
import com.chilly.demo.entity.Grades;
import com.chilly.demo.entity.Student;
import com.chilly.demo.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseMapper {
    /**
     * 获取所有课程信息
     * @return
     */
    List<Course> getCourseList();

    /**
     * 新增课程信息
     * @param course
     * @return 成功返回1，失败返回0
     */
    int addCourse(Course course);

    /**
     * 删除课程信息
     * @param courseId
     * @return
     */
    int deleteCourseById(String courseId);

    /**
     * 获取课程详情
     * @param courseId
     * @return
     */
    Course getCourseById(String courseId);

    /**
     * 获取相关课程的学生
     * @param courseId
     * @return
     */
    List<Student> getStudentCourse(String courseId);

    /**
     * 获取相关课程的教师
     * @param courseId
     * @return
     */
    List<Teacher> getTeacherCourse(String courseId);

    /**
     * 更改课程信息
     * @param course
     * @return
     */
    int updateCourse(Course course);

}
