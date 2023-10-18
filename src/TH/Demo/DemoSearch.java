package TH.Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoSearch {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Nguyễn Văn A", true));
        students.add(new Student(2, "Trần Văn B", true));
        students.add(new Student(3, "Nguyễn Thị C", true));
        boolean isNotFound = true;

        System.out.println("Hãy nhập từ khóa tìm kiếm sinh viên : ");
        String keyword = scanner.nextLine();
        for (Student student : students) {
            if (student.getName().contains(keyword)){
                System.out.println(student);
                isNotFound = false;
            }
        }
        if (isNotFound){
            System.out.println("Không tìm thấy tên bạn vừa nhập.");
        }
    }
}
