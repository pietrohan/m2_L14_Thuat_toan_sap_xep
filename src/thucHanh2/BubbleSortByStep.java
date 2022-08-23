package thucHanh2;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter list size: ");
        int size = sc.nextInt();
        int [] list = new int[size];
        System.out.println("Enter "+list.length+" values");
        for (int i = 0; i < list.length; i++) {
            list[i] =sc.nextInt();
        }
        System.out.println(" Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        System.out.println("\nBegin sort processing...");
        bubbleSortByStep(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }//codes below here
    public static void  bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int i = 1; i < list.length && needNextPass ; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length-i; j++) {
                if (list[j]>list[j+1]){
                  /*  Swap list[i] with list[i + 1] */
                    System.out.println("Swap "+list[j] +"with"+list[j+1]);
                    int temp = list[j];
                    list[j] =list[j+1];
                    list[j + 1] = temp;
                    needNextPass =true;
                }
            }
            /* Array may be sorted and next pass not needed */
            if (needNextPass == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            /* Show the list after sort */
            System.out.print("List after the  " + i + "' sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }

    }
        }

