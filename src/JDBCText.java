package databaseDemo;
import java.sql.*;
import org.junit.Test;


public class JDBCText {
	
	// JDBC �����������ݿ� URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/SW";
 
    // ���ݿ���û��������룬��Ҫ�����Լ�������
    static final String USER = "root";
    static final String PASS = "MySQLPassword322622";
    Connection conn = null;
    Statement state = null;{
    try{
    	Class.forName("com.mysql.jdbc.Driver");
    	 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/SW?useUnicode=true&characterEncoding=utf-8&useSSL=true",USER,PASS); 
    	 state = conn.createStatement();
    	 ResultSet rs = state.executeQuery("select * from user");
    	 while(rs.next()){
    		 System.out.println("id:"+rs.getInt(1)+"\tname:"+rs.getString(2)+"\tbirthday:"+rs.getDate(3)+"\tmoney:"+rs.getFloat(4));
    	 }
    	 rs.close();
    	 state.close();
    	 conn.close();
    }catch (SQLException e1){
  	  e1.printStackTrace();
    }catch (ClassNotFoundException e){
  	  e.printStackTrace();
    }
    }

}