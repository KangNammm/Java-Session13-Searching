package TH.Demo;

import java.util.Scanner;

public class DemoBinarySearching {
    public static void main(String[] args) {
        int arr[] = {1,2,4,7,9,11,14,15,17};
        System.out.println("Hãy nhập giá trị cần tìm kiếm : ");
        Scanner scanner = new Scanner(System.in);
        int searchNumber = Integer.parseInt(scanner.nextLine());
        int mid;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == searchNumber){
                System.out.printf("Phần tử %d cần tìm kiếm ở vị trí %d\n", searchNumber, mid);
                return;
            }

            if (arr[mid] < searchNumber){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.printf("Không tìm được phần tử.");

    }
}
