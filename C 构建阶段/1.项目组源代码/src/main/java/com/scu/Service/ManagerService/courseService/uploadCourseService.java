package com.scu.Service.ManagerService.courseService;

import com.scu.Dao.ManagerDao.courseDao.uploadCourseDao;
import com.scu.Entity.ManagerEntity.Course;

public class uploadCourseService {
    public static boolean processUpload(Integer courseID,String courseName,Integer teacherID,Integer courseCredit,String courseRoom,String courseTime,String courseDescription ){

        Course course = new Course(courseID,courseName,teacherID,courseCredit,courseRoom,courseTime, courseDescription);

        //将课程信息存储进数据库中
        if(uploadCourseDao.uploadIntoDB(course)){
            System.out.println("插入成功：service");
            return true;
        }
        return false;
    }
}
