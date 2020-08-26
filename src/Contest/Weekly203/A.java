package Contest.Weekly203;

import java.util.*;

public class A {

    public static void main(String[] args) {
//        int[] rounds = {3,2,1,2,1,3,2,1,2,1,3,2,3,1};
//        int[] rounds = {1,3,1,2};
        int[] rounds = {1,3,5,7};
//        int[] rounds = {2,1,2,1,2,1,2,1,2};
        A a = new A();
        System.out.println(a.mostVisited(7, rounds));
    }

    public List<Integer> mostVisited(int n, int[] rounds) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < rounds.length - 1; i++) {

            int d = 0;
            if(rounds[i+1] < rounds[i]){
                d = Math.abs(rounds[i+1] + n - rounds[i]);
            } else {
                d = Math.abs(rounds[i+1] - rounds[i]);
            }

            for (int j = 0; j < d; j++) {

                int a = (rounds[i] + j) % n;
                if(map.containsKey(a)) {
                    map.put(a, map.get(a)+1);
                } else {
                    map.put(a, 1);
                }
            }
        }

        int end = rounds[rounds.length-1];
        if(end == n) {
            if(map.containsKey(0)) {
                map.put(0, map.get(0)+1);
            } else {
                map.put(0, 1);
            }

        } else {
            if(map.containsKey(end)) {
                map.put(end, map.get(end)+1);
            } else {
                map.put(end, 1);
            }

        }

        int max = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            max = Math.max(max, e.getValue());
        }

        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if(e.getValue() == max) {
                if(e.getKey() == 0) {
                    list.add(n);
                } else {
                    list.add(e.getKey());
                }

            }
        }

        Collections.sort(list);
        return list;
    }
}
