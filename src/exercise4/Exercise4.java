package exercise4;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author allewi01
 * @assignment 4
 */
public class Exercise4 {
    
    public static void main(String[] args) {
        System.out.println();
    }
    
    public Integer task1(Integer n) {
        return n * n * n;
    }
    
    public Integer task2(String s) {
        return s.length();
    }
    
    public Integer task3(Character c) {
        return (int) c;
    }
    
    public Character task4(String s) {
        return s.charAt(s.length() - 1);
    }
    
    public Integer task5(Integer m, Integer n) {
        return m + n;
    }
    
    public Character task6(String s, Integer n) {
        return s.charAt(n % s.length());
    }
    
    public Integer task7(Integer[] n) {
        return n[n.length - 1];
    }
    
    public Boolean task8(Integer[] m, Integer n) {
        for (Integer m1: m) {
            if (m1 == n) {
                return true;
            }
        }
        return false;
    }
    
    public Integer task9(ArrayList<String> s) {
        int total = 0;
        for (int i = 0; i < s.size(); i++) {
            total += s.get(i).length();
        }
        return total;
    }
    
    public Integer task10(HashMap<Integer, Integer> h) {
        int total = 0;
        for (HashMap.Entry item: h.entrySet()) {
            total += (int) item.getKey() * (int) item.getValue();
        }
        return total;
    }
    
}
