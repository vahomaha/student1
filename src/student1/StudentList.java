package student1;

/**
 *
 * @author Bhavy
 */
public class StudentList {
    public static void main(String []args){
        //Student1 s1= new Student("s1","Bhavya");
        Student1[] studentList = new Student1[3];
        studentList[0] = new Student1("s1","Bhavya");
        studentList[1] = new Student1("s2","john");
        studentList[2] = new Student1("s3","Akshat");
        
        for(int i=0;i<studentList.length;i++){
            System.out.println(studentList[i].getStudentName());
        }
    }
}