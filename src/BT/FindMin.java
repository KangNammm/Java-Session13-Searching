package BT;

public class FindMin {
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

        // Tìm số nhỏ nhất
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // In ra số nhỏ nhất
        System.out.println("Số nhỏ nhất là: " + min);
    }
}
