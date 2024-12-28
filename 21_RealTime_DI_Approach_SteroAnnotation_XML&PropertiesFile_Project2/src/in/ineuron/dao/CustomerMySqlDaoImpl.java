package in.ineuron.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import in.ineuron.bo.CustomerBo;

@Repository(value="dao")
public class CustomerMySqlDaoImpl implements ICustomerDAO{
	
	private static final String REALTIME_DI_CUSTOMER_INSERT_QUERY = "INSERT INTO customer_2(cname,caddress,pamt,rate,time,intrAmt)VALUES(?,?,?,?,?,?);";
	
	@Autowired
	@Qualifier(value="mysqlDAO")
	private DataSource datasource;
	
	static {
		System.out.println("CustomerMySqlDaoImpl .class file is loading...");
	}
	
	public CustomerMySqlDaoImpl() {
		System.out.println("CustomerMySqlDaoImpl:: zero param constructor...");
	}
	
	public CustomerMySqlDaoImpl(DataSource datasource) {
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
