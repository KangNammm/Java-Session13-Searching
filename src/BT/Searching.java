package BT;

import java.util.Scanner;

public class Searching {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Nhập mảng
            System.out.println("Nhập số lượng phần tử của mảng: ");
            int size = scanner.nextInt();
            int[] arr = new int[size];
            System.out.println("Nhập các phần tử của mảng: ");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }

            // Nhập giá trị cần tìm
            System.out.println("Nhập giá trị cần tìm: ");
            int searching = scanner.nextInt();

            // Tìm kiếm tuyến tính
            int index = 0;
            for (int i = 0; i < size; i++) {
                if (arr[i] == searching) {
                    index = i;
                    break;
                }
            }

            // In kết quả
            if (index != 0) {
                System.out.println("Giá trị cần tìm có trong mảng ở vị trí: " + index);
            } else {
                System.out.println("Không tìm thấy giá trị cần tìm");
            }
        }

}
