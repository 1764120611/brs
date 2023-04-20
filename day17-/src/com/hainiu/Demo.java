package com.hainiu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //反射 加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //通过DriverManager获取连接getConnection(ur1, username, password)
        String ur1="jdbc:mysql://11.147.251.101:3306/hainiu?useSSL=false&characterEncoding=UTF-8";
        String username="root";
        String password="hainiu";
        Connection connection = DriverManager.getConnection(ur1, username, password);
        //通过连接获取执行对象
        Statement statement = connection.createStatement();
        //sql语句
        String sql="insert into category values(7,'图书/电子书')";
        //执行操作
        int i =statement.executeUpdate(sql);
        System.out.println("受影响的数据有"+i+"条");
        //释放资源
        //statement.close();
        connection.close();
    }
}
