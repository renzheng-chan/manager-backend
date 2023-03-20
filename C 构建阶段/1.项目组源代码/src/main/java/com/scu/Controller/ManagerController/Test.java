package com.scu.Controller.ManagerController;

import com.scu.Dao.DBUtil;
import com.scu.Entity.ManagerEntity.Teacher;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        SqlSession sqlsession = DBUtil.getSqlSession();
        List<Teacher> list = sqlsession.selectList("selectTeacherByID",2222);
        System.out.println(list=null);

    }
}
