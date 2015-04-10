package kannuruniv;

/**
 * @author Anjith Sasindran
 *
 */
public class StudentDetails {
	@SuppressWarnings("unused")
	private static String SUBMIT = "SUBMIT";

	private String registerNo;
	private String birthDay;
	private String birthMonth;
	private String birthYear;

	/**
	 * @param registerNo
	 * @param birthDay
	 * @param birthMonth
	 * @param birthYear
	 */
	public StudentDetails(String registerNo, String birthDay, String birthMonth,
			String birthYear) {
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

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getBirthMonth() {
		return birthMonth;
	}

	public void setBirthMonth(String birthMonth) {
		this.birthMonth = birthMonth;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

}
