package day4hw3;

public class StateInfo {
	private String stateId;
	private String firstName;
	private String lastName;
	private String birthYear;

	public StateInfo() {
		super();
	}

	public StateInfo(String stateId, String firstName, String lastName, String birthYear) {
		super();
		this.stateId = stateId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
	}

	public String getStateId() {
		return stateId;
	}

	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

}
