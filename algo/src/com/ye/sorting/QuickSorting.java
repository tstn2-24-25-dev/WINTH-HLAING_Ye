package com.ye.sorting;

import java.util.Arrays;

public class QuickSorting {
    public static void main(String[] args) {

        int[] list = {100, 0, 50, 60, 20, 30, 70};

        int n = list.length;

        System.out.print("Unsorted List: ");
        printList(list);
        System.out.print("\n==============================\n");
        System.out.print("Sorted List with Quick Sort: ");
        // quicksorting function
        quickSort(list, 0, n - 1);
        printList(list);
    }

    public static void printList(int[] list){
        for ( int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
    }

    public static  void quickSort(int[] list, int start, int end){
        if ( end <= start ){
            return ;  // return to base
        }

        int pivot = partition(list , start , end );

        quickSort(list , start , pivot - 1 );
        quickSort(list , pivot + 1 , end );
    }

    public static int partition (int[] list , int start ,int end ){

        int pivot = list[end];
        int i = start -1 ;

        for (int j = start ; j <= end ; j++){
            if ( list[j] < pivot ){
                i++;

                int temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }

        i++;
        int temp = list[i];
        list[i] = list[end];
        list[end] = temp;

        return i;
    }
}

