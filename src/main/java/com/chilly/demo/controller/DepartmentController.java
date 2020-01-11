package com.chilly.demo.controller;

import com.chilly.demo.entity.Course;
import com.chilly.demo.entity.Department;
import com.chilly.demo.entity.Student;
import com.chilly.demo.entity.Teacher;
import com.chilly.demo.exception.BaseExceptionHandleAction;
import com.chilly.demo.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther ChillyLin
 * @date 2020/1/1
 */

@Controller
@RequestMapping("/department")
public class DepartmentController extends BaseExceptionHandleAction {
    @Resource
    private DepartmentService departmentService;

    @GetMapping({"/index"})
    public String initDepartmentIndex(Model model) {
        List<Department> departmentList = departmentService.getAllDepartment();
        model.addAttribute("departmentList",departmentList);
        return "department_index";
    }

    @RequestMapping("/toAddDepartment")
    public String toAddDepartment(){
        return "department_add";
    }

    @RequestMapping("/addDepartment")
    public String addDepartment(Department department){
        departmentService.addDepartment(department);
        return "redirect:/department/index";
    }

    @RequestMapping("/deleteDepartment")
    public String deleteDepartment(int departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return "redirect:/department/index";
    }

    @RequestMapping("/departmentIntro")
    public String departmentIntro(int departmentId,Model model){
        Department department = departmentService.getDepartmentById(departmentId);
        if (department == null){
            return "department_404";
        }
        List<Teacher> teacherList = departmentService.getTeacherDepartment(departmentId);
        List<Student> studentList = departmentService.getStudentDepartment(departmentId);
        model.addAttribute("department",department);
        model.addAttribute("teacherList",teacherList);
        model.addAttribute("studentList",studentList);
        return "department_intro";
    }

}
