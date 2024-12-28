package in.ineuron.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import in.ineuron.bo.CustomerBo;

public class CustomerMySqlDaoImpl implements ICustomerDAO{
	
	private static final String REALTIME_DI_CUSTOMER_INSERT_QUERY = "INSERT INTO customer_2(cname,caddress,pamt,rate,time,intrAmt)VALUES(?,?,?,?,?,?);";
	
	private DataSource datasource;
	
	

	public CustomerMySqlDaoImpl(DataSource datasource) {
		super();
		this.datasource = datasource;
		System.out.println("CustomerMySqlDaoImpl :: 1 param constructor-->"+datasource.getClass().getName());
	}

	@Override
	public int save(CustomerBo bo) throws Exception {
		int count=0;
		try(Connection connection=datasource.getConnection();
				PreparedStatement ps=connection.prepareStatement(REALTIME_DI_CUSTOMER_INSERT_QUERY)){
			ps.setString(1, bo.getCustomerName());
			ps.setString(2, bo.getCustomerAddress());
			ps.setFloat(3, bo.getPamt());
			ps.setFloat(4, bo.getRate());
			ps.setFloat(5,bo.getTime());
			ps.setFloat(6, bo.getIntrAmount());
			
			count=ps.executeUpdate();
		}catch(SQLException se) {
			se.printStackTrace();
			throw se;
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		return count;
	}
}
