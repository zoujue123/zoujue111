package jdbctest;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo{
	public static void main(String[]args){
		String url="jdbc:mysqul://localhost:3306/bookstore";
		String user="root";
		String pwd="zp120708";
		String sql = "select * from bookstore";
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs=null;
		try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","zp120708");
            st = conn.createStatement();
            //添加批处理
            st.addBatch("insert into bookstore values('Los Angeles',1500,'1999-01-09')");
            st.addBatch("insert into bookstore values('San Diego',250,'1999-01-07')");
            st.addBatch("insert into bookstore values('Los Angeles',300,'1999-01-08')");
            st.addBatch("insert into bookstore values('Boston',700,'1999-01-08')");
            //执行批处理
            st.executeBatch();
            rs=st.executeQuery(sql);
            while(rs.next()){
            	System.out.println(rs.getObject(1)+" "+rs.getInt("Sales")+" "+rs.getObject(3));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(st != null) {
                    st.close();
                    st = null;
                }
                if(conn != null) {
                    conn.close();
                    conn = null;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }    
        }
	}
}