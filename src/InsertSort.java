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
        int count=0;
        while(arr[count+1]>=arr[count]&&count<n-1){
            count++;
        }
        for (int i = count+1; i < n; i++) {
            int min = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > min) {
                    arr[j + 1] = arr[j];
                    if(j==0){
                        arr[j] = min;
                    }
                }else{
                    arr[j+1]=min;
                    break;
                }
            }
        }
    }
}
