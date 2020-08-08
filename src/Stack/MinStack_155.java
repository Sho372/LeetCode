package Stack;

import java.util.ArrayList;

public class MinStack_155 {

    private ArrayList<Node> list;
    private static class Node {
        int val;
        int minVal;

        public Node(int x, int min) {
            val = x;
            minVal = min;
        }
    }

    /*
      push(x) -- Push element x onto stack.                  O(1)
      pop() -- Removes the element on top of the stack.      O(1)
      top() -- Get the top element.                          O(1)
      getMin() -- Retrieve the minimum element in the stack. O(1)

      Constraints:
      Methods pop, top and getMin operations will always be called on non-empty stacks.
     */

    /** initialize your data structure here. */

    //    Runtime: 4 ms, faster than 95.32% of Java online submissions for Min Stack.
    //    Memory Usage: 41.5 MB, less than 54.36% of Java online submissions for Min Stack.

    public MinStack_155() {
        this.list = new ArrayList<>();
    }

    public void push(int x) {
        int min = x;
        if(list.size() != 0) {
            min = Math.min(list.get(list.size() - 1).minVal, x);
        }
        Node n = new Node(x, min);
        list.add(n);
    }

    public void pop() {
        list.remove(list.size()-1);
    }

    public int top() {
        return list.get(list.size()-1).val;
    }

    public int getMin() {
        return list.get(list.size()-1).minVal;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */


