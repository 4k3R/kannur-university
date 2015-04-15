/**
 * HallTicket extends StudentDetails
 * Used for downloading HallTicket
 */
package kannuruniv;

/**
 * @author Anjith Sasindran
 *
 */
public class HallTicket extends StudentDetails{

	public HallTicket(String registerNo, String birthDay, String birthMonth,
			String birthYear) {
		super(registerNo, birthDay, birthMonth, birthYear);
		// TODO Auto-generated constructor stub
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
