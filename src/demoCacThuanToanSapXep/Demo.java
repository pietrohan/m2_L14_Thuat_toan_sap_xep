package demoCacThuanToanSapXep;

public class Demo {

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--)
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
        }
    }
    public static void selectionSort(int[] array)
    {
        int min; // chỉ số phần tử nhỏ nhất trong dãy hiện hành
        for (int  i = 0; i < array.length - 1; i++){
            min = i;
            for(int j = i + 1; j < array.length; j++)
                if (array[j] < array[min])
                    min = j; // ghi nhận vị trí phần tử nhỏ nhất
            if (min != i){
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
    }
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        int[] array = {1,65,23,67,35,75,98};
        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        int[] array2 = {1,65,23,67,35,75,98};
        selectionSort(array2);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        int[] array3 = {1,65,23,67,35,75,98};
        insertionSort(array3);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
