package com.hainiu.druidpool;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtil {
    private static final String DRIVER ="com.mysql.jdbc.Driver";
    private static final String URL ="jdbc:mysql://11.147.251.101:3306/hainiu?useSSL=false&characterEncoding=UTF-8";
    private static final String USERNAME ="root";
    private static final String PASSWORD ="hainiu";
    //初始化druid连接池
    private static DruidDataSource dataSource =null;
    //静态代码块 -- 初始化连接池
    static {
        //创建连接池对象
        dataSource =new DruidDataSource();
        dataSource.setDriverClassName(DRIVER);
        dataSource.setUrl(URL);
        dataSource.setUsername(USERNAME);
        dataSource.setPassword(PASSWORD);
    }
    public static Connection getConnectiong(){
        DruidPooledConnection conn =null;
        try {
            conn=dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    public static void close(ResultSet resultSet, Statement statement, Connection connection) throws SQLException {
        if(resultSet!=null){
            resultSet.close();
        }if (statement!=null){
            statement.close();
        }if (connection!=null){
            connection.close();
        }
    }
    public static void close(Statement statement,Connection connection) throws SQLException {
        close(null,statement,connection);
    }

}
