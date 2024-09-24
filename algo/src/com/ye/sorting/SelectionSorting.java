package com.ye.sorting;



public class SelectionSorting {

    public static void main(String[] args) {

        int[] list = { 78 , 3 , 8 , 1 , 10 , 2 };

        System.out.print("Unsorted List:");
        showinglist(list);
        System.out.print("\n =================================== \n ");
        System.out.print("Sorted List By Selection Sorting: ");
        int[] newList = selectionSort(list);
        showinglist(newList);
     }

    private static int[] selectionSort(int[] list) {

        return list ;
    }

    public static void showinglist(int[] list) {

        for ( int i : list ){
            System.out.print(i  + " ");
        }

    }
}
