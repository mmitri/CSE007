// Mark Mitri
// CSE 002
// Lab 2
// 1/29/2020

import java.util.Arrays;

public class Test{
    public static void main(String [] args){
        int[] myArray1 = {1,2,3,4};
        int[] myArray2 = {4,3,2,1};
        Z(myArray1, myArray2);
        print1d(myArray1);
        System.out.println();
        print1d(myArray2);
    }

    public static void U( int[][] a, int[][] b ){
        int[][] temp = b; b = a; a = temp;
        } public static int V( int a, int b ){
        int temp = b; b = a; a = temp;
        return b;
        } public static void X( int[][] a, int[][] b ){
        int[][] temp = new int[a.length][];
        for(int i = 0; i< a.length; i++){ temp[i]=a[i]; }
        for(int j = 0; j< a.length; j++){ a[j]=b[j]; }
        for(int k = 0; k< a.length; k++){ b[k]=temp[k]; }
        } public static int[] Y( int[] a, int[] b ){
        int[] temp = new int[a.length];
        for(int i = 0; i< a.length; i++){ temp[i]=a[i]; }
        for(int j = 0; j< a.length; j++){ a[j]=b[j]; }
        for(int k = 0; k< a.length; k++){ b[k]=temp[k]; }
        return temp;
        } public static void Z( int[] a, int[] b ){
        int[] temp = b; b = a; a = temp;
        } public static void print1d( int[] a ){
        System.out.print("{");
        for( int j = 0; j<a.length; j++){
        System.out.print(a[j] + " ");
        }System.out.print("},");
        } public static void print2d( int[][] a ){
        for( int i = 0; i<a.length; i++){
        System.out.print("{");
        for( int j = 0; j<a[i].length; j++){
        System.out.print(a[i][j] + " ");
        }System.out.print("},");
        }
        }
}