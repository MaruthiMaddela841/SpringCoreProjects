package in.ineuron.service;

import in.ineuron.bo.CustomerBo;
import in.ineuron.dao.ICustomerDAO;
import in.ineuron.dto.CustomerDto;

public class CustomerMgmntServiceImpl implements ICustomerMgmntService{
	
	private ICustomerDAO dao;
	
	public CustomerMgmntServiceImpl(ICustomerDAO dao) {
		super();
		this.dao = dao;
		System.out.println("CustomerMgmntServiceImpl:: 1 param constructor-->"+dao.getClass().getName());
	}

	@Override
	public String calculateSimpleInterest(CustomerDto dto) throws Exception {
			float intrAmount=(dto.getPamt()*dto.getTime()*dto.getRate())/100.0f;
			CustomerBo customerBo= new CustomerBo();
			customerBo.setCustomerName(dto.getCustomerName());
			customerBo.setCustomerAddress(dto.getCustomerAddress());
			customerBo.setPamt(dto.getPamt());
			customerBo.setRate(dto.getRate());
			customerBo.setTime(dto.getTime());
			customerBo.setIntrAmount(intrAmount);
			int count=dao.save(customerBo);
		return count==0?"Customer Registration Failed":"Customer Registration Successfull-->Intrerest Amount::"+intrAmount;
	}
}
