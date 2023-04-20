package com.hainiu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DruidTest {
    public static void main(String[] args) throws SQLException {
        Connection conn=JDBCUtil.getConnectiong();
        String sql="insert into account(id,name,money)values(?,?,?)";
        PreparedStatement statement =null;
        try{
            statement=conn.prepareStatement(sql);
            statement.setInt(1,0);
            statement.setString(2,"测试x");
            statement.setDouble(3,7777);
            //执行操作
            int num=statement.executeUpdate();
            System.out.println(num);
        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            try {
                JDBCUtil.close(statement,conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
