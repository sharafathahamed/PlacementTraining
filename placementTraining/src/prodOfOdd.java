public class prodOfOdd {
    public static void main(String[] args) {
        int[] arr = {13,15,14,17};
        int sum=1;
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                sum*=arr[i];
            }
        }
        System.out.println(sum);
    }
}
