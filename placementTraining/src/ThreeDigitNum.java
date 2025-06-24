public class ThreeDigitNum {
    public static void main(String[] args) {
        int[] arr = {100,90,380,1080,20,200};
        for(int i=0;i<arr.length;i++){
            if(arr[i]<1000&&arr[i]>99){
                System.out.println(arr[i]);
            }
        }
    }
}
