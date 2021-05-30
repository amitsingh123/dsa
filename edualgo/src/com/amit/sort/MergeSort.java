package com.amit.sort;

/*
    Merge sort is a recursive divide and conquer algorithm that essentially divides a given array into two halves,
    sorts those halves, and merges them together in order

 */
public class MergeSort {
    public int[] mergeSort(int arr[],int leftIndex,int rightIndex){
        if(leftIndex<0||rightIndex<0)
            return null;
        if(rightIndex>leftIndex){
            int mid = leftIndex+(rightIndex-leftIndex)/2;
            mergeSort(arr,leftIndex,mid);
            mergeSort(arr,mid+1,rightIndex);
            merge(arr,leftIndex,mid,rightIndex);
        }
        return arr;
    }

    public void merge(int arr[],int left,int mid,int right){
        int i,j,k;
        int sizeLeft = mid-left+1;
        int sizeRight = right-mid;

        int[] leftArr = new int[sizeLeft];
        int[] rightArr = new int[sizeRight];

        for(i=0;i<sizeLeft;i++)
            leftArr[i] = arr[left+i];
        for(j=0;j<sizeRight;j++)
            rightArr[j]=arr[mid+1+j];
        i=0;
        j=0;
        k=left;

        while(i<sizeLeft && j<sizeRight){
            if(leftArr[i]<=rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            }else{
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while(i<sizeLeft){
            arr[k]=leftArr[i];
            i++;
            k++;
        }
        while(j<sizeRight){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
