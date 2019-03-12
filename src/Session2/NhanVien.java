package Session2;
import java.util.Scanner;

public class NhanVien {
    String name;
    int age;
    String address;
    double salary;
    int workTime;
    double bound;

    void inputInfo() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter name");
        name = userInput.next();

        System.out.println("Enter age");
        age = userInput.nextInt();

        System.out.println("Enter address");
        address = userInput.next();

        System.out.println("Enter salary");
        salary = userInput.nextDouble();

        System.out.println("Enter worktime");
        workTime = userInput.nextInt();
    }
    void printInfo() {

    }

    double bound() {
        if(workTime >= 200) {
            bound = salary * 0.2;
        } else if(workTime < 200 && workTime >= 100) {
            bound = salary * 0.1;
        } else if(workTime <= 100) {
            bound = 0;
        }
        return bound;
    };

    public static void main(String[] args) {
        NhanVien nhanvien1 = new NhanVien();
        nhanvien1.inputInfo();
        nhanvien1.printInfo();
        System.out.println(nhanvien1.bound());
    }
}
