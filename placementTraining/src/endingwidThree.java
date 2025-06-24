import java.util.Scanner;

public class endingwidThree {
    public static void main(String[] args) {
        int[] arr = {13,18,11,48,53,58};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%10==8){
                System.out.println(arr[i]);
            }
        }
    }
}
