public class quickSort {

    public static void Qsort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int prt = Prartition(arr, si, ei);
        Qsort(arr, si, prt - 1);
        Qsort(arr, prt + 1, ei);
    }

    public static int Prartition(int arr[], int si, int ei) {
        int i = si - 1;
        int pivot = arr[ei];
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        arr[ei] = arr[i];
        arr[i] = pivot;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 3, 1, 6, 7 };
        Qsort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
