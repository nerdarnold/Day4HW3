package day4hw3;

public class Gamer extends StateInfo {
	private String userid;
	private String password;
	private String email;
	private int age;
	private int theYearThatTheGamerSignedUp;

	public Gamer(String stateId, String firstName, String lastName, String birthYear, String userid, String password,
			String email, int age, int theYearThatTheGamerSignedUp) {
		super(stateId, firstName, lastName, birthYear);
		this.userid = userid;
		this.password = password;
		this.email = email;
		this.age = age;
		this.theYearThatTheGamerSignedUp = theYearThatTheGamerSignedUp;

	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getTheYearThatTheGamerSignedUp() {
		return theYearThatTheGamerSignedUp;
	}

	public void setTheYearThatTheGamerSignedUp(int theYearThatTheGamerSignedUp) {
		this.theYearThatTheGamerSignedUp = theYearThatTheGamerSignedUp;
	}

}
