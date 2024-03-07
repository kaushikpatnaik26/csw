
class college{
    private String collegeName;
    private String collegeLoc;

    public college (String collegeName, String collegeLoc){
        this.collegeName = collegeName;
        this.collegeLoc = collegeLoc;
    }
    public String getCollegeName(){
        return collegeName;
    }
    public String setCollegeLoc(){
        return collegeLoc;
    }
    public void displayCollegeinfo(){
        System.out.println("college name: "+ collegeName);

    }
}
class student
{
    private int studentId;
    private String studentName;
    private college College;
    public student(int studentId, String  studentName, college College) {
        this.College=College;
        this.studentId = studentId;
        this.studentName = studentName;
    }
    public void displayStudentinfo()
{
    System.out.println("Student ID: " + studentId);
    System.out.println("student Name:"+ studentName);

}
public class college {
    public static void main(String[] args) {
        college c1 = new college("");
        college c2 = new college("ABC University", "London");
    }

}
}

