public class Demo {
    public static void main(String[] args) {
        int [] arr = {2,3,5,8,1,6,7,0,4};
        testDemoBu(arr);
    }
    public static void display (int [] arr){
        for (Integer p: arr){
            System.out.print(p);
        }
        System.out.println();
    }
    public static void testDemoBu(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n-i-1; j++) {  // j  j+1 < n-i => j<n-i-1
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            display(arr);
        }
    }
}
