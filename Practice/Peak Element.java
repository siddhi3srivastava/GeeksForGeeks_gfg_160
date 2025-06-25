/* Given an array arr[] where no two adjacent elements are same, find the index of a peak element. An element is considered to be a peak if it is greater than its adjacent elements (if they exist). If there are multiple peak elements, return index of any one of them. The output will be "true" if the index returned by your function is correct; otherwise, it will be "false".

Note: Consider the element before the first element and the element after the last element to be negative infinity. */


class Solution {

    public int peakElement(int[] arr) {
        int n=arr.length;        
        //for array with single element
        if(n==1){
            return 0;
        }       
        //for first element being greater
        if(arr[0]>arr[1]){
            return 0;
        }      
        //for last element being greater
        if(arr[n-1]>arr[n-2]){
            return n-1;
        }        
        //for middle elements
        for(int i=1; i<n-1; i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                return i;
            }
        }        
        return -1;
    }
}
