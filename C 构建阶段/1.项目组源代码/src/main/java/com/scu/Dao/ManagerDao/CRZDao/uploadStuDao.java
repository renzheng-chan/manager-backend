package com.scu.Dao.ManagerDao.CRZDao;

import com.scu.Dao.DBUtil;
import com.scu.Entity.ManagerEntity.CRZEntity.Student;
import org.apache.ibatis.session.SqlSession;

public class uploadStuDao {
    public static boolean uploadIntoDB(Student student){
        SqlSession sqlSession = DBUtil.getSqlSession();
        System.out.println("上传学生3");
        int row = sqlSession.insert("uploadStu",student);
        sqlSession.commit();
        sqlSession.close();
        if(row != 1){
            System.out.println("插入失败");
            return false;
        }
        System.out.println("插入成功");
        return true;

    }
}
