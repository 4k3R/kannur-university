/**
 * MarkList extends StudentDetails
 * Used for downloading MarkList
 */
package kannuruniv;

/**
 * @author Anjith Sasindran
 *
 */
public class MarkList extends StudentDetails{

	public MarkList(String registerNo, String examType) {
		super(registerNo, examType);
		// TODO Auto-generated constructor stub
	}

	public String getExamType() {
		return examType;
	}

	public void setExamType(String examType) {
		this.examType = examType;
	}

}
