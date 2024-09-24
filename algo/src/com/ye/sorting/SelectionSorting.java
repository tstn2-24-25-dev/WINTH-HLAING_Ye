package com.ye.sorting;



public class SelectionSorting {

    public static void main(String[] args) {

        int[] list = { 78 , 3 , 8 , 1 , 10 , 2 };

        System.out.print("Unsorted List:");
        showinglist(list);
        System.out.print("\n===================================\n");
        System.out.print("Sorted List By Selection Sorting: ");
        int[] newList = selectionSort(list);
        showinglist(newList);
     }

    public static int[] selectionSort(int[] list)
    {
        int n = list.length;


        for (int i = 0; i < n-1; i++)
        {
            // find the minimum element in  array
            int minindex = i;
            for (int j = i+1; j < n; j++)
                if (list[j] < list[minindex])
                     minindex = j;

            // sway the found minimum element with the first index

            int temp = list[minindex];
            list[minindex] = list[i];
            list[i] = temp;
        }
        return list;
    }

    public static void showinglist(int[] list) {

        for ( int i : list ){
            System.out.print(i  + " ");
        }

    }
}
