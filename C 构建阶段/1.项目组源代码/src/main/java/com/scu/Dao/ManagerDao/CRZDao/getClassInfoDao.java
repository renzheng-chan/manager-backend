package com.scu.Dao.ManagerDao.CRZDao;

import  com.scu.Dao.DBUtil;
import com.scu.Entity.ManagerEntity.CRZEntity.Student;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class getClassInfoDao {
    public static List<Student> getClassDao(Integer classID){
        SqlSession sqlSession = DBUtil.getSqlSession();
        return sqlSession.selectList("getClassByID",classID);
    }
}
