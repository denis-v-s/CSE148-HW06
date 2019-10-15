public class App {
  public static void main(String[] args) throws Exception {
    // Create 2 Student objects: student "David" and student "Mary"
    Student  s1 = new Student("David", "1234 Long Str", 21, "45645674567", "Male", "CS");
    Student  s2 = new Student("Mary", "100 River Ln", 20, "45645674567", "Female", "EE");

    // Create a 4 Course objects: course118, course148, course222, course218
    Course course118 = new Course("Intro to Programming", 4, "Intro to Programmaing in Java");
    Course course148 = new Course("Object Oriented Programming", 4, "Intro to Programmaing in Java");
    Course course222 = new Course("Comp Architect & Organization", 4, "Digital Design & Computer Architecture");
    Course course248 = new Course("Adv Obj-Oriented Programming", 4, "Intro to Programmaing in Java");

    // Create a few MyCourse objects and add them to "David"
    // Create another few MyCourse objects and add them to "Mary"
    MyCourse c1 = new MyCourse(course118, 3.8, 1);
    MyCourse c2 = new MyCourse(course148, 3.5, 0);
    MyCourse c3 = new MyCourse(course248, 3.2, 0);
    MyCourse c4 = new MyCourse(course222, 2.5, 3);

    s1.addCourse(c1);
    s1.addCourse(c2);
    s2.addCourse(c3);
    s2.addCourse(c4);

    // Check David and Mary’s average GPA
    System.out.println("David's avergae GPA is " + s1.getAverageGPA());
    System.out.println("Mary's avergae GPA is " + s2.getAverageGPA());

    // try to add a course with status 5
    Course course0 = null;
    MyCourse c0 = null;
    try {
      course0 = new Course("Other Course", 2, "Other Course Textbook");
      c0 = new MyCourse(course0, 2.1, 5);
      s2.addCourse(c0);
    }
    catch (Exception ex) {
      System.out.println("Unable to add: " + course0.getCourseName());
      System.out.println(ex.getMessage());
    }
  }
}