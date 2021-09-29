package com.amit.select;

import java.util.HashMap;
import java.util.Map;

public class SelectMain {
    private static int arr[] = new int[]{-1,1,-2,1,2,1,5,6,10,100};
    public static void main(String[] args) {
        QuickSelect quickSelect = new QuickSelect(arr);
        int k_pos = 6;
        int kthElement = quickSelect.select(0,arr.length-1,k_pos-1);
        //System.out.println("kthElement..."+kthElement);

        String str = "AmitSingha";
        char[] characters = str.toCharArray();
        Map<Character,Integer> charMap = new HashMap<>();
        for(char c:characters){
            if(c == 'a'){
                System.out.println("hahahaha");
            }
            System.out.println(c);
            if(charMap.containsKey(c)){
                charMap.put(c,charMap.get(c)+1);
            }
            else{
                charMap.put(c,1);
            }
        }
        for(Map.Entry entry:charMap.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
