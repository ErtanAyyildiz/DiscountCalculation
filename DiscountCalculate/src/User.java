
public class User {
	private AccType accType;
	private int yearsOfService;
	
	public User(AccType accType, int yearsOfService) {
		this.accType=accType;
		this.yearsOfService=yearsOfService;
		
	}

	public AccType getAccType() {
		return accType;
	}

	public void setAccType(AccType accType) {
		this.accType = accType;
	}

	public int getYearsOfService() {
		return yearsOfService;
	}

	public void setYearsOfService(int yearsOfService) {
		this.yearsOfService = yearsOfService;
	}
	
}
