package com.scu.Dao.ManagerDao.teacherDao;
import com.scu.Dao.DBUtil;
import com.scu.Entity.ManagerEntity.Teacher;
import org.apache.ibatis.session.SqlSession;
public class uploadTeacherDao {
    public static boolean uploadIntoDB(Teacher teacher){
        SqlSession sqlSession = DBUtil.getSqlSession();
        //System.out.println(teacher);
        int row = sqlSession.insert("uploadTeacher",teacher);
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
