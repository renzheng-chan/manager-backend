package com.scu.Dao.ManagerDao.CRZDao;

import com.scu.Dao.DBUtil;
import com.scu.Entity.ManagerEntity.CRZEntity.Application;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class showApplicationDao {
    public static List<Application> loadApplicationDao(){
        //获取申请信息
        List<Application> list = new ArrayList<>();
        SqlSession sqlSession = DBUtil.getSqlSession();
        list = sqlSession.selectList("queryApplication");
        return list;
    }
    public static List<Application> loadApplicationDao(Integer applicationID){
        List<Application> list;
        SqlSession sqlSession = DBUtil.getSqlSession();
        list = sqlSession.selectList("queryApplicationByID",applicationID);
        return list;
    }


}
