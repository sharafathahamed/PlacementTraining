public class prodOfTwoDig {
    public static void main(String[] args) {
        int[] arr = {100,20,13,150,30,400};
        int sum =1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>9&&arr[i]<100){
                sum*=arr[i];
            }
        }
        System.out.println(sum);
    }
}
