package com.ye.sorting;

public class MergeSorting {

    public static void main(String[] args) {

        int[] list = { 4 , 5 , 1 , 34 , 67 , 32 , 2  };

        int length = list.length;

        int medium = length/2;

//        System.out.println( length  + " " + medium);
        System.out.print("Unsorted List: ");
        printSorting(list);

        System.out.print("\n=====================================\n");
        System.out.print("Sorted List: ");

        mergeSorting(list);
        printSorting(list);
    }

    public static void mergeSorting (int[] list ){
        int length = list.length;
        if ( length <= 1 ){
            return ; // return to base case
        }

        int middle = length/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; // left array
        int j = 0 ; // for right

        // split into two arrays
        for (i=0  ; i < length ; i++){
            if ( i  < middle ){
                leftArray[i] = list[i];
            }else {
                rightArray[j] = list[i];
                j++;
            }
        }
        // recursively sort both
        mergeSorting(leftArray);
        mergeSorting(rightArray);

        merge(leftArray , rightArray , list );
    }

    public static void merge(int[] leftArray , int[] rightArray , int[] list ){
        int leftSize = list.length / 2 ;
        int rightSize = list.length -leftSize ;

        int i = 0 , l = 0 , r = 0 ;

        // check the condition for merging
        while ( l < leftSize && r < rightSize ){
            if ( leftArray[l] < rightArray[r]){
                list[i] = leftArray[l];
                i++;
                l++;
            }else {
                list[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while (l < leftSize ){
            list[i] = leftArray[l];
            i++;
            l++;
        }

        while ( r < rightSize){
            list[i] = rightArray[r];
            i++;
            r++;
        }
    }
    // function to print list
    public static void printSorting ( int[] list ){

        for ( int i : list ){
            System.out.print(i + " ");
        };
    }
}
