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
public class Ordenamiento_Generico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] intVector = { 101, 99, 12, 19, 21, 111, 345, 25, 77, 81 }; // Me tiraba error con int[] profe :(
        Integer [] result = Utils.ordena (intVector);
        
        Float [] floatVector = { 19.1f, 456.6f, 23.45f, 12.34f, 11.11f, 354.55f, 78.45f, 28.33f, 45.99f, 108.88f }; //Igual me tiraba error con primitivo
        Float [] result_F = Utils.ordena (floatVector);

        for(Integer i : result){
            System.out.println(i);
        }
        
        for(Float i : result_F){
            System.out.println(i);
        }

        
    }
    
}
