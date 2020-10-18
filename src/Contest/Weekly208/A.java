package Contest.Weekly208;

public class A {

    public int minOperations(String[] logs) {
        int depth = 0;
        for (String l:logs) {
            switch (l) {
                case "../":
                    if(depth==0) {
                        break;
                    }
                    depth += -1;
                    break;
                case "./":
                    depth += 0;
                    break;
                default:
                    depth += 1;
            }
        }
        return Math.max(depth, 0);
    }
}
