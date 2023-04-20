package com.hainiu;

import java.sql.*;
import java.util.ArrayList;
import java.util.Locale;

public class Demo01 {
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
        String sql="select cid,cname from category";
        //执行操作
        ResultSet resultSet = statement.executeQuery(sql);
        //集合容器
        ArrayList<Category> list = new ArrayList<>();
        //处理结果集 当有下一条数据时，获取下一条数据
        while(resultSet.next()){
            int cid =resultSet.getInt("cid");//根据列名称获取
            //int cid = resultSet.getInt(1);   根据列的索引获取
            String cname=resultSet.getString("cname");
            //封装成java对象
            Category category = new Category(cid, cname);
            list.add(category);
        }
        //将集合对象传递给下一个业务
        for (Category category : list) {
            System.out.println(category);
        }
        //释放资源
        //statement.close();
        connection.close();
    }
}
