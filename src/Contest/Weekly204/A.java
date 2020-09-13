package Contest.Weekly204;

public class A {
    public boolean containsPattern(int[] arr, int m, int k) {

        int[] p = new int[m];
        int kk = 0;
        for(int i=0; i<arr.length - m + 1; i++) {
            kk = 0;
            for(int l = i; l < i + m; l++) {
                p[l - i] = arr[l];
            }
            for(int j=i+m; j<arr.length - m + 1; j = j+m){

                int n = 0;
                int z = j;
                boolean flag = true;
                while(n < m) {
                    if(p[n] != arr[z]) {
                        flag = false;

                        break;
                    }
                    n++;
                    z++;
                }
                if(flag) {
                    kk++;
                } else{
                    kk = 0;
                    break;
                };

                if(kk == k - 1) {
                    System.out.println(kk);
                    return true;
                }
            }
        }
        System.out.println(kk);
        return false;
    }

    public static void main(String[] args) {
//        int[] arr = new int[]{1,2,4,4,4,4};
//        int[] arr = new int[]{1,2,1,2,1,1,1,3};
//        int[] arr = new int[]{1,2,1,2,1,3};
        int[] arr = new int[]{2,1,2,1,1,2,1,2,2,1,2,2,2}; // m = 1, k = 4
//        int[] arr = new int[]{1,2,1,2,1,1,1,3}; // m = 2, k = 2



//        int[] arr = new int[]{1,2,3,1,2};
//        int[] arr = new int[]{2,2,2,2};

        int m = 1;
        int k = 4;

        A a = new A();
        System.out.println( a.containsPattern(arr, m, k));
    }
}