package com.scu.Dao.ManagerDao.CRZDao;

import com.scu.Dao.DBUtil;
import com.scu.Entity.ManagerEntity.CRZEntity.Application;
import org.apache.ibatis.session.SqlSession;

public class updateApplicationDao {
    public static boolean approvalDao(Application application){
        SqlSession sqlSession = DBUtil.getSqlSession();
        sqlSession.update("updateApplication",application);
        sqlSession.commit();
        sqlSession.close();
        return true;
    }

}
