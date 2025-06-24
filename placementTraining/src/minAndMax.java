import java.util.Arrays;

public class minAndMax {
    public static void main(String[] args) {
        int[] arr= {10,20,5,50,30,40};
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length-1];
        System.out.println("Minimum is: "+min);
        System.out.println("Maximum is: "+max);
        }
}

