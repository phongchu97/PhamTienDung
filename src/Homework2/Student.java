package Homework2;
import java.util.Scanner;

public class Student {
    String studentID;
    double averageScore;
    int age;
    String classCode;

    //Getter
    public String getStudentID() {
        return studentID;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public int getAge() {
        return age;
    }

    public String getClassCode() {
        return classCode;
    }

    //Setter
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    void inputInfo() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter student ID: ");
        setStudentID(userInput.next());

        System.out.println("Enter student age: ");
        setAge(userInput.nextInt());

        System.out.println("Enter student classCode: ");
        setClassCode(userInput.next());

        System.out.println("Enter student average score: ");
        setAverageScore(userInput.nextDouble());
    }

    void showInfo(){
        System.out.println("Student ID: " + getStudentID());
        System.out.println("Student age: " + getAge());
        System.out.println("Student classCode: " + getClassCode());
        System.out.println("Student average score: " + getAverageScore());
    }

    void scholarshipCheck(){
       if(averageScore >= 8){
           System.out.println("Scholarship achieved");
       } else {
           System.out.println("No scholarship achieved");
       }
    }

    public Student(){
        inputInfo();
        showInfo();
        scholarshipCheck();
    }

    public Student(String studentID, double averageScore, int age, String classCode) {
        this.studentID = studentID;
        this.averageScore = averageScore;
        this.age = age;
        this.classCode = classCode;
    }

    public static void main(String[] args){
        Student student1 = new Student();
        Student student2 = new Student("TH1805032", 10, 18, "T1807M");
    }
}
