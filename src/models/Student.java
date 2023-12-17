package models;

public class Student {
    String name;
    int grade;
    int age;
    float[] marks;

    public Student(String name, int grade, int age, float[] marks) {
        this.name = name;
        this.grade = grade;
        this.age = age;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float[] getMarks() {
        return marks;
    }

    public void setMarks(float[] marks) {
        this.marks = marks;
    }


    public void generateResult(){
        System.out.println("___________________________________");
        System.out.println("Student name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Age: " + age);

        float totalSum = 0;
        for(int i=0; i < marks.length; i++){
            totalSum = totalSum + marks[i];
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }

        float percentage = (totalSum / marks.length);

        String grade = "";

        if(percentage >= 90){
            grade = "A+";
        }else if(percentage >= 80){
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B+";
        } else if (percentage >= 60) {
            grade = "B";
        }else if (percentage >= 50) {
            grade = "C+";
        }else if (percentage >= 40) {
            grade = "C";
        }


        System.out.println("Total percentage: " + percentage + "%");
        System.out.println("Final grade: " + grade);
        System.out.println("___________________________________");
    }
}
