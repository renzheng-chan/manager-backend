package com.scu.Dao;

import com.scu.Entity.Notice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class noticeDao {
    public List<Notice> Load(){
        List<Notice> notices = new ArrayList<Notice>();
        //连接数据库
        Connection connection = stuDBUtil.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try{
            String sql = "select * from notice";
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            while (resultSet.next()){
                Notice notice = new Notice();
                notice.setNoticeID(resultSet.getInt("noticeID"));
                notice.setNoticeInfo(resultSet.getString("noticeInfo"));
                notice.setNoticeTime(resultSet.getString("noticeTime"));
                notice.setNoticeTitle(resultSet.getString("noticeTitle"));
                notice.setNotifier(resultSet.getString("notifier"));
                notices.add(notice);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            stuDBUtil.close(connection, statement, resultSet);
        }
        return notices;
    }
}
