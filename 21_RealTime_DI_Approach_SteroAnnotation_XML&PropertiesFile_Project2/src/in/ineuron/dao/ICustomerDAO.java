package in.ineuron.dao;

import in.ineuron.bo.CustomerBo;

public interface ICustomerDAO {
	
	public int save(CustomerBo bo) throws Exception;

}
