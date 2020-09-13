package Contest.Weekly206;

public class A_review {

    public static void main(String[] args) {
        int[][] mat = {{1,0,0},{0,0,1},{1,0,0},};
        System.out.println(new A_review().numSpecial(mat));
    }

    public int numSpecial(int[][] mat) {

        int r = mat.length;
        int c = mat[0].length;

        int[] rsum = new int[r];
        int[] csum = new int[c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                rsum[i] += mat[i][j];
                csum[j] += mat[i][j];
            }
        }

        int ret = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(mat[i][j] == 1 && csum[j] == 1 && rsum[i] == 1) ret++;
            }
        }
        return ret;
    }
}
