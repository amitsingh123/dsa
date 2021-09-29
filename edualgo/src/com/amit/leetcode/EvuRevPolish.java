package com.amit.leetcode;

import java.util.Stack;

public class EvuRevPolish {
    //using stack
    static String[] token = new String[]{"2","1","+","3","*"};

    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        int num;
        String opStr = "+-/*";
        for(int i=0;i<token.length;i++){
            if(opStr.contains(token[i])){
                num = cal(Integer.valueOf(st.pop()),Integer.valueOf(st.pop()),token[i]);
                st.push(String.valueOf(num));
            }
            else{
                st.push(token[i]);
            }
        }
        System.out.println(st.pop());
    }

    private static int cal(int num1,int num2,String op){
        switch(op){
            case "+" : return num1+num2;
            case "-" : return num1-num2;
            case "/" : return num1/num2;
            case "*" : return num1*num2;
        }
        return 0;
    }
}
