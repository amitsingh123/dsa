package com.amit.select;

import java.security.SecureRandom;

public class QuickSelect {
    int arr[];
    public QuickSelect(int arr[]){
        this.arr = arr;
    }
    private int partition(int first_index, int last_index){
        int random_pivot = new SecureRandom().nextInt(last_index-first_index+1)+first_index;
        swap(random_pivot,last_index);
        for(int i = first_index;i<last_index;i++){
            if(arr[i]<arr[last_index]){
                swap(i,first_index);
                first_index++;
            }
        }
        swap(last_index,first_index);
        return first_index;
    }
    private void swap(int first_index,int second_index){
        int temp = arr[first_index];
        arr[first_index] = arr[second_index];
        arr[second_index] = temp;
    }
    public int select(int first_index,int last_index,int k){
        int pivot = partition(first_index,last_index);

        if(pivot>k){
            return select(first_index,pivot-1,k);
        }
        else if(pivot<k){
            return select(pivot+1,last_index,k);
        }
        return arr[pivot];
    }
}
