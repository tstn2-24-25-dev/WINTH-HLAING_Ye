package com.ye.sorting;

public class InsertionSorting {

    public static void main(String[] args) {

        int[] list = { 1 , 3  , 4 , 6 , 2 , 8 , 11 };

        System.out.print("Unsorted List : " );
        showingList(list);

        System.out.print("\n====================================\n");

        System.out.print("Sorted List : ")  ;
        int[] newSortingList = insertionSort(list);
        insertionSort(newSortingList);
        showingList(newSortingList);

    }

    // function for insertion sorting
    public static int[] insertionSort(int[] list) {

        for ( int i = 1 ; i < list.length ; i++ ){

            int key = list[i];
            int j = i - 1;
            //while j = 0 and 3 > 1 (1)
            //while j= 1 and 3 > 6 (2)
            while (j >= 0 && list[j] > key) {
                // list[0] will become 1 (1)
                // list[1] will still 3 (2)
                // list[0] will still 1 (2)
                list[j + 1] = list[j];

                // j is -1 so while loop will stop (1)
                // j is 1 so while loop will continue (2) for list[0] to compare 1 > 6
                j = j - 1;


            }
            // pass list[1] = 3 (1)
            // pass list[2] = 6 (2)
            list[j + 1] = key;

        }
        return list;
    }
    // function for showing sorting list
    public static void showingList(int[] list) {
        for (int j : list) {
            System.out.print(j + " ");
        }
    }


}
