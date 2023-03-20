package com.scu.Service;

import com.scu.Entity.Student;

import java.util.List;

public interface stuInfoService {
    List<Student> Load();
    Student stuFind(int stuID);
}
