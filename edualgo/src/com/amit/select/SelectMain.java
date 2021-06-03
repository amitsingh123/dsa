package com.amit.select;

public class SelectMain {
    private static int arr[] = new int[]{-1,1,-2,5,6,10,100};
    public static void main(String[] args) {
        QuickSelect quickSelect = new QuickSelect(arr);
        int k_pos = 1;
        int kthElement = quickSelect.select(0,arr.length-1,k_pos-1);
        System.out.println("kthElement..."+kthElement);
    }
}
