package com.capg.doa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.capg.model.Trainee;

public class TraineeDaodbcBased implements ITraineeDAO {

	Connection con;
	PreparedStatement ps;
	public TraineeDaodbcBased() throws SQLException {

		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe",
				"system","praveen99");
	}
	public Trainee addTrainee(Trainee trainee) throws SQLException {
		ps=con.prepareStatement("insert into trainee values(?,?,?)");
		ps.setInt(1, trainee.gettId());
		ps.setString(2, trainee.gettName());
		ps.setString(3, trainee.getDept());
		
		int rowsUpdated=ps.executeUpdate();
		if(rowsUpdated>0)
		{
			return trainee;
		}
		else
			return null;
	}

	public Trainee findTrainee(int id) throws SQLException {
		Trainee trainee = new Trainee();
		ps=con.prepareStatement("select * from trainee where tId=?");  
        ps.setInt(1,id); 
        ResultSet rs = ps.executeQuery();
        if(rs!=null)
        {
       
		while(rs.next())
        {
        	trainee.settId(rs.getInt("tId"));
        	trainee.settName(rs.getString("tName"));
        	trainee.setDept(rs.getString("dept"));
        }
		return trainee;
		
        }
        else
        	return null;
	}

	public boolean removeTrainee(int id) throws SQLException {
ps=con.prepareStatement("DELETE FROM trainee WHERE tId=(?)");
ps.setInt(1, id);
int rowsUpdate=ps.executeUpdate();
if(rowsUpdate>0)
{
	return true;
}
else
	return false;
}

	public Trainee viewTraiees() throws SQLException
	{
		ps=con.prepareStatement("select * from trainee");
	ResultSet trainees=	ps.executeQuery();
	
	return null;
	
	}
}
