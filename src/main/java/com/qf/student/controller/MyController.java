package com.qf.student.controller;

import com.qf.student.entity.Student;
import com.qf.student.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("user")
public class MyController {
    @Autowired
    private IUserService userService;

    @RequestMapping("queryAll")
    private String list(Model model){
        List<Student> list = userService.list();
        model.addAttribute("stus",list);
        return "stulist";
    }

    @RequestMapping("delete")
    private String delete(String id){
        userService.removeById(id);
        return "redirect:/user/queryAll";
    }

    @RequestMapping("toadd")
    private String toadd(){
        return "useradd";
    }

    @RequestMapping("add")
    private String add(Student student){
        userService.save(student);
        return "redirect:/user/queryAll";
    }

    @RequestMapping("toupdate")
    private String toupdate(String id,Model model){
        Student byId = userService.getById(id);
        model.addAttribute("student",byId);
        return "userupdate";
    }

    @RequestMapping("update")
    private String update(Student student){
        userService.updateById(student);
        return "redirect:/user/queryAll";
    }
}
