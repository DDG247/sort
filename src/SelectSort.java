public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        selectSort(arr);
        System.out.println("排序后的数组：");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void selectSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            int min = arr[i];
            boolean isswapped = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < min) {
                    isswapped = true;
                    min = arr[j];
                    minIndex = j;
                }
            }

            if (!isswapped) {
                break;
            }
            arr[minIndex] = arr[i];
            arr[i] = min;
        }
    }
}
