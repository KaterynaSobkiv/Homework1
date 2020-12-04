package Task3;

public class Task3 {
    public static void main(String args[]) {
        int arr[] = {-1, -2, -3, -4, -5, -5, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int min = arr[0];
        for (int x : arr) {
            if (x < min) min = x;
        }
        System.out.println("Minimal element: " + min);
        int num[] = {-1, -2, -3, -4, -5, -5, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double sum = 0;
        for (int x : num) {
            sum += x;
        }

        System.out.print("Average is: " + sum / num.length + System.lineSeparator());
        arr[6] = (int) sum / num.length;
        System.out.print("Replaced value is: " + (int) sum / num.length + System.lineSeparator());
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == min) {
                arr[i] = (int) sum / num.length;

            }

        }
    }
}