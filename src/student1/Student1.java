package student1;

/**
 *
 * @author Bhavy
 */
public class Student1 {

    /**
     * @param args the command line arguments
     */
  private String studentId;
  private String studentName;

    public Student1(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}