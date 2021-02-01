public class Students {

	private String registrationNumber;

	public Students(String regNo) {
		this.registrationNumber = regNo;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("In Students equals method...");
		if (obj != null && obj instanceof Students) {
			String regNumber = ((Students) obj).getRegistrationNumber();
			if (regNumber != "" && regNumber.equals(this.registrationNumber)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		System.out.println("In Students hashCode method...");
		return this.registrationNumber.hashCode();
	}
}
