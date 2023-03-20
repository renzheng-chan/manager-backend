package com.scu.Dao;

import com.scu.Entity.Score;
import com.scu.Service.stuScoreService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class stuScoreDao implements stuScoreService {
    public List<Score> scoreFind(int stuID) {
        List<Score> scores = new ArrayList<Score>();
        //连接数据库
        Connection connection = stuDBUtil.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try{
            String sql = "select * from score where stuID=" + stuID + "";
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Score score = new Score();
                score.setStuID(stuID);
                score.setCourseID(resultSet.getInt("courseID"));
                score.setScore(resultSet.getInt("score"));
                score.setTeacherID(resultSet.getInt("teacherID"));
                scores.add(score);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            stuDBUtil.close(connection,statement,resultSet);
        }
        setTeaName(scores);
        setCouName(scores);
        setGPA(scores);
        return scores;
    }

    private void setTeaName(List<Score> list){
        //连接数据库
        Connection connection = stuDBUtil.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        for (int i = 0; i<list.size();i++){
            try{
                Score score = new Score();
                score = list.get(i);
                String sql = "select teacherName from teacher where teacherID="+score.getTeacherID()+"";
                statement = connection.prepareStatement(sql);
                resultSet = statement.executeQuery();
                while (resultSet.next()){
                    score.setTeacherName(resultSet.getString("teacherName"));
                }
                list.set(i, score);
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        stuDBUtil.close(connection, statement, resultSet);
    }
    private void setCouName(List<Score> list){
        //连接数据库
        Connection connection = stuDBUtil.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        for (int i = 0; i<list.size();i++){
            try{
                Score score = new Score();
                score = list.get(i);
                String sql = "select courseName,courseCredit from course where courseID="+score.getCourseID()+"";
                statement = connection.prepareStatement(sql);
                resultSet = statement.executeQuery();
                while (resultSet.next()){
                    score.setCourseName(resultSet.getString("courseName"));
                    score.setCourseCredit(resultSet.getInt("courseCredit"));
                }
                list.set(i, score);
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        stuDBUtil.close(connection, statement, resultSet);
    }

    private void setGPA(List<Score> list){
        for(int i = 0; i<list.size();i++){
            Score tmp = list.get(i);
            int score = tmp.getScore();
            double gpa = 0;
            if(score<60){
                gpa = 0.0;
            }
            else if(score==60){
                gpa = 1.0;
            }
            else if(score<=62){
                gpa = 1.3;
            }
            else if(score<=65){
                gpa = 1.7;
            }
            else if(score<=69){
                gpa = 2.0;
            }
            else if(score<=72){
                gpa = 2.3;
            }
            else if (score<=75){
                gpa = 2.7;
            }
            else if (score<=79){
                gpa = 3.0;
            }
            else if(score<=84){
                gpa = 3.3;
            }
            else if(score<=89){
                gpa = 3.7;
            }
            else{
                gpa=4.0;
            }
            tmp.setGpa(gpa);
            list.set(i,tmp);
        }
    }
}
