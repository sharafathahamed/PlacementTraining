public class prodOfEven {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 15};
        int sum = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum *= arr[i];
            }
            System.out.println(sum);
        }
    }
}
