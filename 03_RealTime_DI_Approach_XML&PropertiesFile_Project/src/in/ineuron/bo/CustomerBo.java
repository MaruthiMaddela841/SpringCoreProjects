package in.ineuron.bo;

public class CustomerBo {
	
	private String customerName;
	private String customerAddress;
	
	private Float pamt;
	private Float rate;
	private Float time;
	
	private Float intrAmount;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public Float getPamt() {
		return pamt;
	}

	public void setPamt(Float pamt) {
		this.pamt = pamt;
	}

	public Float getRate() {
		return rate;
	}

	public void setRate(Float rate) {
		this.rate = rate;
	}

	public Float getTime() {
		return time;
	}

	public void setTime(Float time) {
		this.time = time;
	}

	public Float getIntrAmount() {
		return intrAmount;
	}

	public void setIntrAmount(Float intrAmount) {
		this.intrAmount = intrAmount;
	}

	@Override
	public String toString() {
		return "CustomerBo [customerName=" + customerName + ", customerAddress=" + customerAddress + ", pamt=" + pamt
				+ ", rate=" + rate + ", time=" + time + ", intrAmount=" + intrAmount + "]";
	}
	
	

}
