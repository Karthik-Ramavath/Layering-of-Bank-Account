import java.sql.*;
public class TrialConnect{
	public static void main(String[] args){
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","zoha","zoha");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from BRANCH");
			while(rs.next())  
				System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}