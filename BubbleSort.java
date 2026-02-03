import java.io.*;
import java.util.*;
class BubbleSort{
    static void bubble(int []arr){
        int i,j;
        for(i=0;i<arr.length;i++){
            for(j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int t=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=t;
                }
            }
        }
    }
    public static void main(String []args){
        int[] arr={7,9,5,3};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}