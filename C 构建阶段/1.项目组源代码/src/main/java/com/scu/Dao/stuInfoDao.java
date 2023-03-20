package com.scu.Dao;

import com.scu.Entity.Student;
import com.scu.Service.stuInfoService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class stuInfoDao implements stuInfoService {
    public List<Student> Load(){
        List<Student> students = new ArrayList<Student>();
        //连接数据库
        Connection connection = stuDBUtil.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try{
            String sql = "select * from student";
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            while (resultSet.next()){
                Student student = new Student();
                student.setStuID(resultSet.getInt("stuID"));
                student.setStuName(resultSet.getString("stuName"));
                student.setStuSex(resultSet.getString("stuSex"));
                student.setStuAge(resultSet.getInt("stuAge"));
                student.setStuGrade(resultSet.getInt("stuGrade"));
                student.setClassID(resultSet.getInt("classID"));
                student.setStuDept(resultSet.getString("stuDept"));
                student.setStuADTime(resultSet.getString("stuADTime"));
//                System.out.println(student.toString());
                students.add(student);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            stuDBUtil.close(connection, statement, resultSet);
        }
        return students;
    }

    public Student stuFind(int stuID){
        //连接数据库
        Connection connection = stuDBUtil.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Student student = new Student();
        student.setStuID(stuID);
        try{
            String sql = "select * from student where stuID='"+stuID+"'";
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            while (resultSet.next()){
                student.setStuName(resultSet.getString("stuName"));
                student.setStuSex(resultSet.getString("stuSex"));
                student.setStuAge(resultSet.getInt("stuAge"));
                student.setStuGrade(resultSet.getInt("stuGrade"));
                student.setClassID(resultSet.getInt("classID"));
                student.setStuDept(resultSet.getString("stuDept"));
                student.setStuADTime(resultSet.getString("stuADTime"));
//                System.out.println(student.toString());
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            stuDBUtil.close(connection, statement, resultSet);
        }
        return student;
    }
}
