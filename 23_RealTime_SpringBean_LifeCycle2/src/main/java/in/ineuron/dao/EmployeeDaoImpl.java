package in.ineuron.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.ineuron.bo.EmployeeBO;

@Repository(value="dao")
public class EmployeeDaoImpl implements IEmployeeDAO{
	
	private static final String SQL_INSERT_QUERY = "INSERT INTO employee(ename,eage,eaddress,esalary,ehike)VALUES(?,?,?,?,?);";
	int count=0;
	
	static {
		System.out.println("EmployeeDaoImpl .class file is loading...");
	}
	
	public EmployeeDaoImpl() {
		System.out.println("EmployeeDaoImpl :: zero param constructor...");
	}
	
	@Autowired
	private DataSource datasource;

	@Override
	public EmployeeBO save(EmployeeBO bo) {
		try(Connection connection=datasource.getConnection();
				PreparedStatement ps=connection.prepareStatement(SQL_INSERT_QUERY)){
			ps.setString(1, bo.getEname());
			ps.setInt(2, bo.getEage());
			ps.setString(3, bo.getEaddress());
			ps.setFloat(4, bo.getEsalary());
			ps.setFloat(5,bo.getHikeAmt());
			count=ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(count!=-1) {
			return bo;
		}
		else {
			return null;
		}
	}

	@Override
	public String toString() {
		return "EmployeeDaoImpl [datasource=" + datasource + "]";
	}


}
