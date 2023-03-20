package com.scu.Service.ManagerService.CRZService;

import com.scu.Dao.ManagerDao.CRZDao.uploadStuDao;
import com.scu.Entity.ManagerEntity.CRZEntity.Student;

public class uploadStuService {
    public static boolean processUpload(String stuName, Integer stuAge, String stuSex, Integer classID, String stuDept, Integer stuGrade, String stuADTime){
       //根据年级生成唯一的stuID,假定11位ID,
        Integer stuID = Integer.valueOf(String.valueOf(stuGrade+(System.currentTimeMillis()%10000000)));
        System.out.println(stuID);
        Student student = new Student(stuID,stuName,classID,stuAge,stuGrade,stuDept,stuSex,stuADTime);
        System.out.println("上传学生2:");
        System.out.println(student);
        //将学生信息存储进数据库中
        if(uploadStuDao.uploadIntoDB(student)){
            System.out.println("插入成功：service");
            return true;
        }
        return false;
    }
}
