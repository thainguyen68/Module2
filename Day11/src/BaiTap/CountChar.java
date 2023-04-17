package BaiTap;

import java.util.Arrays;
import java.util.TreeMap;

public class CountChar {
        public static void main(String[] args) {
            TreeMap<String, Integer> treeMap = new TreeMap<>();
            String string = "HelloCodegym";
            String[] strings = string.split("");
            System.out.println(Arrays.toString(strings));
            for (int i = 0; i < strings.length; i++) {
                if (treeMap.containsKey(strings[i])){
                    int count = treeMap.get(strings[i]);
                    treeMap.put(strings[i],count +1);
                }else{
                    treeMap.put(strings[i],1);
                }
            }
            System.out.println(treeMap);
        }
    }

