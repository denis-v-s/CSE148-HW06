/**
 * Course
 */
public class Course {

  private String courseName;
  private int courseId;
  private int credit;
  private String textbook;
  private static int COURSE_ID = 0;

  public Course() {
    super();
    this.getNextCourseId();
  }

  public Course(String courseName, int credit, String textbook) {
    this();
    this.setCourseName(courseName);
    this.setCredit(credit);
    this.setTextbook(textbook);
  }

  public String getCourseName() {
    return this.courseName;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  public int getCourseId() {
    return this.courseId;
  }

  private void getNextCourseId() {
    this.courseId = Course.COURSE_ID++;
  }

  public int getCredit() {
    return this.credit;
  }

  public void setCredit(int credit) {
    this.credit = credit;
  }

  public String getTextbook() {
    return this.textbook;
  }

  public void setTextbook(String textbook) {
    this.textbook = textbook;
  }
}