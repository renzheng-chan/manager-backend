package com.scu.Dao.ManagerDao.CRZDao;

import com.scu.Dao.DBUtil;
import com.scu.Entity.ManagerEntity.CRZEntity.Notification;
import org.apache.ibatis.session.SqlSession;
public class sendNoteDao {
    public static boolean sendNoteToDB(Notification notification){
        System.out.println(notification);
        SqlSession sqlSession = DBUtil.getSqlSession();
       int row =  sqlSession.insert("sendNote",notification);
        sqlSession.commit();
        sqlSession.close();
        return row == 1;
    }
}
