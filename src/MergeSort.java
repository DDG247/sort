public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1);
        System.out.println("排序后的数组：");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void mergeSort(int[] arr, int[] temp, int left, int right) {
        int gap = right - left; //计算步长
        if (gap <= 0) {
            return;
        }
        mergeSort(arr, temp, left, (left + right) / 2);//左数组
        mergeSort(arr, temp, (left + right) / 2 + 1, right);//右数组
        int begin1 = left, end1 = (left + right) / 2;
        int begin2 = (left + right) / 2 + 1;
        int i = 0;
        while (begin1 <= end1 && begin2 <= right) {
            if (arr[begin1] <= arr[begin2]) {
                temp[i++] = arr[begin1++];
            } else {
                temp[i++] = arr[begin2++];
            }
        }
        while (begin1 <= end1) {
            temp[i++] = arr[begin1++];
        }
        while (begin2 <= right) {
            temp[i++] = arr[begin2++];
        }
        //将temp数组中的元素复制到arr数组中
        //注意这里，left + j
        if (i >= 0) System.arraycopy(temp, 0, arr, left, i);
    }
}