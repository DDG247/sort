public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        insertSort(arr);
        System.out.println("排序后的数组：");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void insertSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int min = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > min) { // 将比min大的元素后移
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = min; // 将min插入到正确的位置
        }
    }
}