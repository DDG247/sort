public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        shellSort2(arr);
        System.out.println("排序后的数组：");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void shellSort(int[] arr) {
        int n = arr.length;
        int gap = n / 3 + 1;
        while (gap != 1) {
            for (int i = 0; i < gap; i++) {
                insertSort(arr, gap, i);
            }
            gap = gap / 3 + 1;
        }
        insertSort(arr, 1, 1);
    }

    public static void insertSort(int[] arr, int gap, int start) {
        int n = arr.length;
        for (int i = start; i < n; i += gap) {
            int min = arr[i];
            int j = i;
            while (j - gap >= start && arr[j - gap] > min) { // 将比min大的元素后移
                arr[j] = arr[j - gap];
                j -= gap;
            }
            arr[j] = min; // 将min插入到正确的位置
        }
    }

    public static void shellSort2(int[] arr) {
        int size = arr.length;
        int gap = size;
        while (gap > 1) {
            gap = gap / 3 + 1;    //调整希尔增量
            for (int i = 0; i < size - gap; i++)    //从0遍历到size-gap-1
            {
                int end = i;
                int temp = arr[end + gap];
                while (end >= 0) {
                    if (arr[end] > temp) {
                        arr[end + gap] = arr[end];
                        end -= gap;
                    } else {
                        break;
                    }
                }
                arr[end + gap] = temp;    //以 end+gap 作为插入位置
            }
        }
    }

}
