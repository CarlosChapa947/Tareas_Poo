/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quicksort_poo;

/**
 *
 * @author cec19
 */
public class Utils {
    Utils(){
        
    }
    
    public static <E extends Number> E[] ordena(E arr[]){
        quickSort(arr, 0, arr.length-1);
        return arr;
    }
    
    private static <E extends Number> void quickSort(E[] arr, int left, int right){
        int index= partition(arr, left, right);
        if(left < index-1){
            quickSort(arr, left, index-1);
        }
        
        if(index < right){
            quickSort(arr, index, right);
        }
    }
    
    private static <E extends Number> int partition(E[] arr, int left, int right){
        E pivote = arr[(left + right) / 2];
        while(left <= right){
            while(arr[left].doubleValue() < pivote.doubleValue()){
                left++;
            }
            
            while(arr[right].doubleValue() > pivote.doubleValue()){
                right--;
            }
            
            if(left <= right){
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }
    
    private static <E extends Number> void swap(E[] arr, int left, int right){
        if (left != right) {
            E temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
    }
}
