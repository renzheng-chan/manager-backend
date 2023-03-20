package com.scu.Dao;

import com.scu.Entity.Course;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class stuCourseDao {
    public List<Course> Load() {
        List<Course> courses = new ArrayList<Course>();
        //连接数据库
        Connection connection = stuDBUtil.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            String sql = "select * from course";
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Course course = new Course();
                course.setCourseID(resultSet.getInt("courseID"));
                course.setCourseName(resultSet.getString("courseName"));
                course.setTeacherID(resultSet.getInt("teacherID"));
                course.setCourseCredit(resultSet.getInt("courseCredit"));
                course.setCourseRoom(resultSet.getString("courseRoom"));
                course.setCourseDescription(resultSet.getString("courseDescription"));
                course.setCourseTime(resultSet.getString("courseTime"));
//                System.out.println(student.toString());
                courses.add(course);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            stuDBUtil.close(connection, statement, resultSet);
        }
        setName(courses);
        return courses;
    }

    public List<Course> stuFind(int stuID) {
        List<Course> courses = new ArrayList<Course>();
        //连接数据库
        Connection connection = stuDBUtil.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        int courseID = 0;
        try {
            String sql = "select courseID from stucourse where stuID=" + stuID + "";
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                courseID = resultSet.getInt("courseID");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            String sql = "select * from course where courseID=" + courseID + "";
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Course course = new Course();
                course.setTeacherID(resultSet.getInt("teacherID"));
                course.setCourseID(resultSet.getInt("courseID"));
                course.setCourseName(resultSet.getString("courseName"));
                course.setCourseCredit(resultSet.getInt("courseCredit"));
                course.setCourseRoom(resultSet.getString("courseRoom"));
                course.setCourseDescription(resultSet.getString("courseDescription"));
                course.setCourseTime(resultSet.getString("courseTime"));
//                System.out.println(student.toString());
                courses.add(course);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            stuDBUtil.close(connection, statement, resultSet);
        }
        setName(courses);
        return courses;
    }

    private void setName(List<Course> list) {
        //连接数据库
        Connection connection = stuDBUtil.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        for (int i = 0; i < list.size(); i++) {
            try {
                Course course = new Course();
                course = list.get(i);
                String sql = "select teacherName from teacher where teacherID=" + course.getTeacherID() + "";
                statement = connection.prepareStatement(sql);
                resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    course.setTeacherName(resultSet.getString("teacherName"));
                }
                list.set(i, course);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        stuDBUtil.close(connection, statement, resultSet);
    }
}
