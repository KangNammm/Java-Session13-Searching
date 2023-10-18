package BT;

public class FindMax {
    private static int[] getArr() {
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = getArr();
        // In ra mảng
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Tìm số lớn nhất
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // In ra số lớn nhất
        System.out.println("Số lớn nhất là: " + max);
    }
}
