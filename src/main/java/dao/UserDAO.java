package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.User;
import util.DBUtil;

public class UserDAO {
		public static void insertUser(User user) throws Exception
		{
			try
			{
			Class.forName("org.postgresql.Driver");
			Connection conn = DBUtil.getConnection();
			PreparedStatement pstmt = conn.prepareStatement("INSERT INTO credentials(email, username, password) VALUES (?, ?, ?)");
			pstmt.setString(1, user.getEmail()); 
			pstmt.setString(2, user.getUsername()); 
			pstmt.setString(3, user.getPassword()); 
			int rowsInserted = pstmt.executeUpdate();
			System.out.println("data inserted");
			conn.close();			
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		}
		public static boolean validateUser(User user) 
		{
		        try  {
		        	Class.forName("org.postgresql.Driver");
		        	Connection conn = DBUtil.getConnection();
		            String sql = "SELECT * FROM credentials WHERE username = ? AND password = ?";
		            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
		                pstmt.setString(1, user.getUsername());
		                pstmt.setString(2, user.getPassword());
		                try (ResultSet rs = pstmt.executeQuery()) {
		                    return rs.next();
		                }
		            }
		        } catch (Exception e) {
		            e.printStackTrace(); // Log error
		            return false;
		        }
		}
}
