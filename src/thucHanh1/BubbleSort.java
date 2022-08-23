package thucHanh1;

public class BubbleSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    // codes below here
    public static void bubbleSort(int[] list){
        boolean needNextPass = true ;

        for (int i = 0; i < list.length; i++) {
            /* Array may be sorted and next pass not needed */
            for (int j = 0; j < list.length; j++) {
                int temp = list[i];
                list[i] = list[i+1];
                list[i+1] = temp;

                needNextPass = true;
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}