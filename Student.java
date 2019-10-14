import java.util.*;

public class Student extends Person {
  private String major;
  private static int STUDENT_ID = 0;
  private int studentID;
  private ArrayList<MyCourse> courses = new ArrayList<>();

  public Student(String name, String address, int age, String phoneNumber, String gender, String major) {
    super(name, address, age, phoneNumber, gender);
    this.setMajor(major);
    this.studentID = Student.STUDENT_ID;
    // get the ID that will be used when another object is created
    Student.getNextStudentID();
  }

  public double getAverageGPA() {
    double sum = 0;
    for (MyCourse c : this.courses) {
      sum += c.getGpa();
    }

    return sum / this.courses.size();
  }

  public String getMajor() {
    return this.major;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  public boolean addCourse(MyCourse course) {
    return this.courses.add(course);
  }

  public boolean removeCourse(MyCourse course) {
    return this.courses.remove(course);
  }

  public boolean removeCourse(int courseId) {
    MyCourse c = this.courses.remove(courseId);
    if (c == null) {
      return false;
    }
    
    return true;
  }

  public int getStudentID() {
    return this.studentID;
  }

  public static int getNextStudentID() {
    return Student.STUDENT_ID++;
  }

  @Override
  public String toString() {
    return String.format("%s, Student ID: %d, Major: %s, Avg GPA: %.2f", 
      super.toString(), this.getStudentID(), this.getMajor(), this.getAverageGPA()
    );
  }

  @Override
  public boolean equals(Object o) {
    Student s = (Student) o;
    return (super.equals(s) && this.getMajor().equals(s.getMajor()));
  }
}