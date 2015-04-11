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
	private String examType;

	/**
	 * @param registerNo
	 * @param birthDay
	 * @param birthMonth
	 * @param birthYear
	 */
	public StudentDetails(String registerNo, String examType) {
		this.registerNo = registerNo;
		this.examType = examType;
	}
	
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

	public String getExamType() {
		return examType;
	}

	public void setExamType(String examType) {
		this.examType = examType;
	}

}
