package BackTracking;

import java.util.Arrays;

/*
    Backtracking: all solutions
    ストーリー：
        一桁目の値を三つから選ぶ、次は再帰に任せる。処理後は常に元の状態に戻す
 */

public class Permutation {

    public static void main(String[] args) {
        Permutation p = new Permutation();
        p.permutation(new int[]{1,2,3}, 0, 2);
    }

    // list = [1,2,3]
    public void permutation(int[] list, int start, int end) {

        if(start == end) { //Base case
            System.out.println(Arrays.toString(list));
        } else {
            for (int i = start; i < end + 1; i++) {  // Choice -> startの位置の値を決める　e.g. 1桁目は [1,2,3]からチョイス、2桁目は残りの二つからチョイス、....
                swap(list, start, i); // swap -> 実際にスワップしてパターンを作る
                permutation(list, start+1, end); // Explore -> the rest by recursion. Keep track of which solutions the recursive calls find.
                swap(list, start, i);  // BackTracking -> ひとつ前のstepの状態に戻る
            }
        }
    }

    private void swap(int[] list, int i, int j) {
        int tmp = list[i];
        list[i] = list[j];
        list[j] = tmp;
    }


}
