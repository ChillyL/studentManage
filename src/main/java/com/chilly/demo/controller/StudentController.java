package com.chilly.demo.controller;

import com.chilly.demo.entity.Grades;
import com.chilly.demo.entity.Student;
import com.chilly.demo.exception.BaseExceptionHandleAction;
import com.chilly.demo.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther ChillyLin
 * @date 2019/12/29
 */
@Controller
@RequestMapping("/student")
public class StudentController extends BaseExceptionHandleAction {

    @Resource
    private StudentService studentService;

    @GetMapping({"/index"})
    public String initStudentIndex(Model model) {
        List<Student> studentList = studentService.getStudentList();
        model.addAttribute("students",studentList);
        return "student_index";
    }

    @RequestMapping("/toAddStudent")
    public String toAddStudent(){
        return "student_add";
    }

    @RequestMapping("/addStudent")
    public String addStudent(Student student){
        int i = studentService.addStudent(student);
        System.out.println(i);
        return "redirect:/student/index";
    }

    @RequestMapping("/deleteStudent")
    public String deleteStudent(String studentId){
        studentService.deleteStudentById(studentId);
        return "redirect:/student/index";
    }


    @RequestMapping("/studentIntro")
    public String studentIntro(String studentId,Model model){
        Student student = studentService.getStudentById(studentId);
        List<Grades> gradesList = studentService.getStudentGradesById(studentId);
        if (student == null){
            return "student_404";
        }
        model.addAttribute("student",student);
        model.addAttribute("gradesList",gradesList);
        return "student_intro";
    }

    @RequestMapping("/updateStudent")
    public String updateStudent(Student student){
        studentService.updateStudent(student);
        return "redirect:/student/studentIntro?studentId="+student.getStudent_id();
    }

    @RequestMapping("toUpdateStudentById")
    public String toUpdateStudentById(Model model,String studentId){
        Student student = studentService.getStudentById(studentId);
        model.addAttribute("student",student);
        return "student_update";
    }
}
