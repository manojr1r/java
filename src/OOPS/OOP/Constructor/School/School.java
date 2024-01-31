package OOPS.OOP.Constructor.School;

public class School {
  private String studentName;
  private int studentPhoneNumber;

  public School(){
    System.out.println("School construcor");
  }
public School(String studentName, int studentPhoneNumber){
  this.studentName = studentName;
  this.studentPhoneNumber = studentPhoneNumber;
  System.out.println("School constructor with two parameters");
}
  public String getStudentName() {
    return studentName;
  }

  public int getStudentPhoneNumber() {
    return studentPhoneNumber;

  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  public void setStudentPhoneNumber(int studentPhoneNumber) {
    this.studentPhoneNumber = studentPhoneNumber;
  }

}
