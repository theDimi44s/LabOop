package com.chnu.oop.lab3;

import java.util.Arrays;
import java.util.Random;

public class lab3 {



    public static int[] sort(int[] arr) {
        if (arr.length < 2) return arr;
        int m = arr.length / 2;
        int[] arr1 = Arrays.copyOfRange(arr, 0, m);
        int[] arr2 = Arrays.copyOfRange(arr, m, arr.length);
        return merge(sort(arr1), sort(arr2));
    }


    public static int[] merge(int[] arr1, int arr2[]) {
        int n = arr1.length + arr2.length;
        int[] arr = new int[n];
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < n; i++) {
            if (i1 == arr1.length) {
                arr[i] = arr2[i2++];
            } else if (i2 == arr2.length) {
                arr[i] = arr1[i1++];
            } else {
                if (arr1[i1] < arr2[i2]) {
                    arr[i] = arr1[i1++];
                } else {
                    arr[i] = arr2[i2++];
                }
            }
        }
        return arr;
    }
    public static int linerSearch(int []arr,int key)
    {
        int len=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
            else if(key<arr[i])
            {
                len++;
            }
        }
        return arr.length-len;
    }

    public static int find(int []array,double x) {
        int i = -1;
        if (array != null) {
            int low = 0, high = array.length, mid;
            while (low < high) {
                mid = (low + high)/2; // Можно заменить на: (low + high) >>> 1, чтоб не возникло переполнение целого
                if (x == array[mid]) {
                    i = mid;
                    break;
                } else {
                    if (x < array[mid]) {
                        high = mid;
                    } else {
                        low = mid + 1;
                    }
                }
            }
        }
        return i;
    }
    public static int[] task1(int []arr, int key)
    {
        int len = linerSearch(arr,key);
        if(len==-1)
        {
            len=arr.length;
        }
        int[]result=new int [len];
        int iResult=0;
        for(int i=0;i<result.length;i++)
        {
            if(arr[i]<key)
            {
                result[iResult++]=arr[i];
            }
        }
        return result;
    }
    public static int [][] task2(int [][]arr, int nCol, int col, int row )
    {
        int temp=0;
        // int endPos;
        System.out.println("/////////////////////////////////////////// Result");
        for(int i=0;i<row;i++)
        {
            for(int j=i+1;j<row;j++)
                if(arr[nCol][i]<arr[nCol][j])
                {
                    // endPos=i-1;
                    for(int k=0;k<col;k++)
                    {
                        temp=arr[k][j];
                        arr[k][j]=arr[k][i];
                        arr[k][i]=temp;
                    }
                }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        return arr;
    }
    public static boolean task3(String s)
    {
        char [] arrCh= s.toCharArray();
        boolean result=false;
        int mid=s.length()/2;
        for(int i=0, j=s.length()-1;i<mid&&j>mid;i++, j--)
        {
            if(arrCh[i]==arrCh[j])
            {
                result= true;
            }
            else
            {
                result=false;
                break;
            }
        }
        return result;
    }
    public static void printMarray(int array[][])
    {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static boolean isSorted(int[] arr) {
        boolean result = true;
        boolean firstTime = true;
        boolean isRise = false;
        for (int i = 1; i < arr.length; i++) {
            if (firstTime) {
                if (arr[i] > arr[i - 1]) {
                    isRise = true;
                    firstTime = false;
                } else {
                    firstTime = false;
                }
            }
            if (isRise) {
                if (arr[i] < arr[i - 1]) {
                    result = false;
                    return result;
                }
            } else {
                if (arr[i] > arr[i - 1]) {
                    result = false;
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[]args) {

        int[] arr = new int[6];
        int[] arr2 = new int[arr.length];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(10) + 1;
        }
        int n = 4;
        int m = 4;
        int[][] marr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                marr[i][j] = rnd.nextInt(10) + 1;
            }
        }
        int numb = 2;
        String s = "asdsa";
        System.out.println("Array: " + Arrays.toString(arr) + " Is sorted?: " + isSorted(arr));
        arr2 = Arrays.copyOf(sort(arr), arr2.length);
        System.out.println("Sorted array: " + Arrays.toString(arr2) + " Is sorted?: " + isSorted(arr2));
        System.out.println("Position of search number(" + numb + "): " + find(arr2, numb));
        System.out.println("Task 1 key = 7 " + Arrays.toString(task1(arr2, 7)));
        printMarray(marr);
        System.out.println("Task 2 " +task2(marr, 2, n, m));
        System.out.println("Task 3 " +task3(s));

    }
}
