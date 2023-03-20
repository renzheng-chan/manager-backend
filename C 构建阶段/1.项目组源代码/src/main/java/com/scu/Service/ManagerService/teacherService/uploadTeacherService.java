package com.scu.Service.ManagerService.teacherService;

import com.scu.Dao.ManagerDao.teacherDao.uploadTeacherDao;
import com.scu.Entity.ManagerEntity.Teacher;

public class uploadTeacherService {
    public static boolean processUpload(Integer teacherID, String teacherName, Integer teacherAge, String teacherSex, String teacherOBTime, String teacherTitle, String teacherDept){

        Teacher teacher = new Teacher(teacherID,  teacherName, teacherAge, teacherSex,teacherOBTime, teacherTitle, teacherDept);
        //将教师信息存储进数据库中
        if(uploadTeacherDao.uploadIntoDB(teacher)){
            System.out.println("插入成功：service");
            return true;
        }
        return false;
    }
}
