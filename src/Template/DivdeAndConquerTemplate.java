package Template;

public class DivdeAndConquerTemplate {

    /**
     * D&C template
     * @param S the problem to solve
     */
    public int[] divideAndConquer(int[] S) {
        //(1). Divide the problem into a set of subproblems.
        //  S -> subS = [S1, S2, ..., Sn]
        int[][] subS = divide(S);

        int[][] R = new int[subS.length][];
        //(2). Solve the subproblem recursively,
        //  obtain the results of subproblems as R = [R1, R2... Rn].
        for (int i = 0; i < subS.length; i++) {
          R[i] = divideAndConquer(subS[i]);
        }

        //(3). combine the results from the subproblems.
        // and return the combined result.
        return combine(R);
    }

    /**
     * Divide the problem S into a set of subproblem. 1dim -> 2dim
     * @param S
     * @return a set of subproblems
     */
    public int[][] divide(int[] S) {
        int[][] subS = new int[2][];
        return subS;
    }

    /**
     * Combine the results of each subproblem. 2dim -> 1dim
     * @param R
     */
    public int[] combine(int[][] R) {
        int[] ans = new int[1];
        return ans;
    }
}
