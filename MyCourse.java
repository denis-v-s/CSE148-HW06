/**
 * MyCourse
 */
public class MyCourse {

  private Course course;
  private double gpa;
  private int status;

  public MyCourse(Course course, double gpa, int status) {
    this.setCourse(course);
    this.setGpa(gpa);
    this.setStatus(status);
  }

  public Course getCourse() {
    return course;
  }

  public void setCourse(Course course) {
    this.course = course;
  }

  public double getGpa() {
    return gpa;
  }

  public void setGpa(double gpa) {
    this.gpa = gpa;
  }

  public int getStatus() {
    return this.status;
  }

  // 0: taking / in progress, 1: taken/passed, 2: taken/failed, 3: withdraw
  public void setStatus(int status) {
    this.status = status;
  }
}