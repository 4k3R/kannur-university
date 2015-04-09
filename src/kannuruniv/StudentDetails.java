package kannuruniv;

/**
 * @author Anjith Sasindran
 *
 */
public class StudentDetails {
	@SuppressWarnings("unused")
	private static String SUBMIT = "SUBMIT";

	private String registerNo;
	private int birthDay;
	private int birthMonth;
	private int birthYear;

	/**
	 * @param registerNo
	 * @param birthDay
	 * @param birthMonth
	 * @param birthYear
	 */
	public StudentDetails(String registerNo, int birthDay, int birthMonth,
			int birthYear) {
		this.registerNo = registerNo;
		this.birthDay = birthDay;
		this.birthMonth = birthMonth;
		this.birthYear = birthYear;
	}

	public String getRegisterNo() {
		return registerNo;
	}

	public void setRegisterNo(String registerNo) {
		this.registerNo = registerNo;
	}

	public int getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}

	public int getBirthMonth() {
		return birthMonth;
	}

	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

}
