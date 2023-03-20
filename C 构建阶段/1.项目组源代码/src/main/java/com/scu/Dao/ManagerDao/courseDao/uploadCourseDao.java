package com.scu.Dao.ManagerDao.courseDao;
import com.scu.Dao.DBUtil;
import com.scu.Entity.ManagerEntity.Course;
import org.apache.ibatis.session.SqlSession;

public class uploadCourseDao {
    public static boolean uploadIntoDB(Course course){
        SqlSession sqlSession = DBUtil.getSqlSession();
        System.out.println(course);
        int row = sqlSession.insert("uploadCourse",course);
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
