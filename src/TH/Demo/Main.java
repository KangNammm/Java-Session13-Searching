package TH.Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1,4,5,7,2,3,9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số muốn tìm : ");
        int searchNumber = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchNumber){
                System.out.printf("Phần tử %d cần tìm kiếm ở vị trí %d", searchNumber, i);
                return;
            }
        }
        System.out.println("Không tìm kiếm đc phần tử");

    }
}
