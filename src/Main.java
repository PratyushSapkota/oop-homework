import models.Student;


public class Main {
    public static void main(String[] args) {
        float[] marks1 = {96, 89, 84};
        float[] marks2 = {56, 69, 39};
        float[] marks3 = {26, 19, 31};

        Student student1 = new Student("Ram", 1, 21, marks1);
        Student student2 = new Student("Shyam", 1, 21, marks2);
        Student student3 = new Student("Hari", 1, 21, marks3);

        student1.generateResult();
        student2.generateResult();
        student3.generateResult();
    }
}