public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        radixSort(arr,2);
        System.out.println("排序后的数组：");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void radixSort(int[] arr, int radix) {//radix为基数，即进制数
        int n = arr.length;
        int[][] temp= new int[10][n];
        int[] count = new int[10];
        for (int i = 0, divisor = 1; i < radix; i++, divisor *= 10) {
            for (int value : arr) {
                int digit = (value / divisor) % 10;
                temp[digit][count[digit]++] = value;
            }
            int index = 0;
            for (int k = 0; k < 10; k++) {
                for (int l = 0; l < count[k]; l++) {
                    arr[index++] = temp[k][l];
                }
                count[k] = 0;
            }
        }
    }
}