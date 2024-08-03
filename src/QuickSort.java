
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("排序后的数组：");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(arr, left, right);
            quickSort(arr, left, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        boolean judge = true;
        while (left < right) {
            while(judge && left < right){
                if (arr[right] < pivot) { //如果右边的数小于基准数，则交换
                    arr[left] = arr[right];
                    judge = false;
                } else {//如果右边的数大于等于基准数，则右边的指针向左移动一位
                    right--;
                }
            }
            while(!judge && left < right){
                if (arr[left] > pivot) { //如果左边的数大于基准数，则交换
                    //如果左边的数大于基准数，则交换
                    arr[right] = arr[left];
                    judge = true;
                } else {//如果左边的数小于等于基准数，则左边的指针向右移动一位
                    left++;
                }
            }
        }
        arr[left]=pivot;
        return left;
    }
}