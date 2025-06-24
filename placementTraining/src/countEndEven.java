public class countEndEven {
    public static void main(String[] args) {
        int[] arr = {10,22,13,15,14};
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
