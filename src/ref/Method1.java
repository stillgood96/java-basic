package ref;


public class Method1 {

  public static void main(String[] args) {


    Student student1 = new Student();

    initStudnet(student1, "학생1", 15, 90);

    Student student2 = new Student();
    initStudnet(student2, "학생2", 16, 80);

    printStudent(student1);
    printStudent(student2);

  }

  static void initStudnet(Student student, String name, int age, int grade) {

    student.name = name;
    student.age = age;
    student.grade = grade;

  }

  static void printStudent(Student student) {
    System.out.printf("이름: %s 나이: %d 성적: %s\n", student.name, student.age, student.grade);
  }
}
