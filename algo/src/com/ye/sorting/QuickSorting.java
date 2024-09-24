package com.ye.sorting;

public class QuickSorting {
    public static void main(String[] args) {

        int[] list = { 40 , 90 , 80 , 50 , 30 , 20 , 70 };

        int n = list.length;

        System.out.print("Unsorted List: ");
        printList(list);
        System.out.print("\n==============================\n");
        System.out.print("Sorted List with Quick Sort: ");
        // quicksorting function
        quickSort( list , 0 , n -1  );
        printList(list);
    }
    // function swapping for pivote partition
    public static void swapping ( int[] list , int i , int j ){
        int temp = list[i];
        list[i] = list[j] ;
        list[j] = temp ;
    }

    public static int partitionPivot ( int[] list , int low , int high ){

        // make a pivot with last index
        int pivot = list[high];

        int i = ( low - 1 ) ;

        for ( int j = low ; j <= high; j++ ) {
            if ( list[j] < pivot ) {
                i++;
                // for swapping
                swapping ( list , i , j );
            }
        }
        // for swapping
        swapping ( list , i + 1 , high );

        // the position of index of pivot
        return (i + 1);
    }

    public static void quickSort ( int[] list , int low , int high ){

        if ( low < high ) {
            int pivot = partitionPivot (list , low , high);
            // sort for left side
            quickSort(list , low , pivot -1 );
            // sort for right side
            quickSort(list , pivot +1 , high);
        }

    }

    public static void printList(int[] list) {
        for ( int i : list ){
            System.out.print(i + " ");
        }
    }
}
