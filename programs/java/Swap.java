package programs.java;

import java.util.*;
import java.util.stream.Collectors;

public class Swap {
    public static int maximumNumber(int n){
        String str = "";
        str = String.valueOf(n);
        String[] splitter = str.split("");
        List<Integer> ls = new ArrayList<>();

        for (String i : splitter){
            int j = Integer.parseInt(i);
            ls.add(j);
        }
        Collections.sort(ls);
        Collections.reverse(ls);
        String result = ls.stream().map(i -> String.valueOf(i)).collect(Collectors.joining());
        int res = Integer.parseInt(result);
        System.out.println(res);
        return res;
    }
    public static void main(String[] args){
        Swap.maximumNumber(4589);
    }
}
