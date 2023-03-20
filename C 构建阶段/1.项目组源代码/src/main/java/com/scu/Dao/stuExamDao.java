package com.scu.Dao;

import com.scu.Entity.Exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class stuExamDao {
    public List<Exam> examFind(int stuID) {
        List<Exam> exams = new ArrayList<Exam>();
        //连接数据库
        Connection connection = stuDBUtil.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            String sql = "select * from exam where stuID=" + stuID + "";
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Exam exam = new Exam();
                exam.setStuID(stuID);
                exam.setCourseID(resultSet.getInt("courseID"));
                exam.setExamRoom(resultSet.getString("examRoom"));
                exam.setExamTime(resultSet.getString("examTime"));
                exam.setExamSeat(resultSet.getInt("examSeat"));
                exams.add(exam);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < exams.size(); i++) {
            try {
                Exam exam = new Exam();
                exam = exams.get(i);
                String sql = "select courseName from course where courseID=" + exam.getCourseID() + "";
                statement = connection.prepareStatement(sql);
                resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    exam.setCourseName(resultSet.getString("courseName"));
                }
                exams.set(i, exam);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        stuDBUtil.close(connection, statement, resultSet);
        return exams;
    }
}
