/*
 * StudentDetails stores details of students
 * registerNo, birthDay, birthMonth & birthYear are mandatory for downloading hall ticket
 * registerNo & examType are mandatory for downloading mark list
 */
package kannuruniv;

/**
 * @author Anjith Sasindran
 *
 */
public abstract class StudentDetails {
	@SuppressWarnings("unused")
	private static String SUBMIT = "SUBMIT";

	private String registerNo;
	protected String birthDay;
	protected String birthMonth;
	protected String birthYear;
	protected String examType;

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

}
