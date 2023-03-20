package com.scu.Dao.ManagerDao.CRZDao;
import  com.scu.Dao.DBUtil;
import com.scu.Entity.ManagerEntity.CRZEntity.ClassInfo;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class ShowClassDao {
    public static List<ClassInfo> showClassDao(){
        SqlSession sqlSession = DBUtil.getSqlSession();
        List<ClassInfo> list = new ArrayList<>();
        list = sqlSession.selectList("showClass");
        return list;
    }
}
