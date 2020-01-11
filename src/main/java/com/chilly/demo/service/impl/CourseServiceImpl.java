package com.chilly.demo.service.impl;

import com.chilly.demo.entity.Course;
import com.chilly.demo.entity.Student;
import com.chilly.demo.entity.Teacher;
import com.chilly.demo.mapper.CourseMapper;
import com.chilly.demo.service.CourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther ChillyLin
 * @date 2019/12/30
 */
@Service
public class CourseServiceImpl implements CourseService {

    @Resource
    private CourseMapper courseMapper;

    /**
     * 获取所有课程信息
     * @return
     */
    public List<Course> getCourseList(){
        return courseMapper.getCourseList();
    }

    /**
     * 新增课程信息
     * @param course
     * @return 成功返回1，失败返回0
     */
    public int addCourse(Course course){
        return courseMapper.addCourse(course);
    }

    /**
     * 删除课程信息
     * @param courseId
     * @return
     */
    public int deleteCourseById(String courseId){
        return courseMapper.deleteCourseById(courseId);
    }

    /**
     * 获取课程详情
     * @param courseId
     * @return
     */
    public Course getCourseById(String courseId){
        return courseMapper.getCourseById(courseId);
    }

    /**
     * 获取相关课程的学生
     * @param courseId
     * @return
     */
    public List<Student> getStudentCourse(String courseId){
        return courseMapper.getStudentCourse(courseId);
    }

    /**
     * 获取相关课程的教师
     * @param courseId
     * @return
     */
    public List<Teacher> getTeacherCourse(String courseId){
        return courseMapper.getTeacherCourse(courseId);
    }

    /**
     * 更改课程信息
     * @param course
     * @return
     */
    public int updateCourse(Course course){
        return courseMapper.updateCourse(course);
    }
}
