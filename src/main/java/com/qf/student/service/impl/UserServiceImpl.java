package com.qf.student.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qf.student.dao.StudentMapper;
import com.qf.student.entity.Student;
import com.qf.student.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<StudentMapper, Student> implements IUserService {

}
