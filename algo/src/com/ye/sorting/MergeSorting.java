package com.ye.sorting;

public class MergeSorting {

    public static void main(String[] args) {

        int[] list = { 4 , 5 , 1 , 34 , 67 , 32 , 2 , 100 };

        System.out.print("Unsorted List: ");
        printSorting(list);
        System.out.print("\n=====================================\n");
        System.out.print("Sorted List: ");
        int[] newSortList = mergeSorting(list);
        printSorting(list);
    }

    private static int[] mergeSorting(int[] list) {

        return null ;
    }

    public static void printSorting ( int[] list ){

        for ( int i : list ){
            System.out.print(i + " ");
        };
    }
}
