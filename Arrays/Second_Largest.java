/*Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

Note: The second largest element should not be equal to the largest element.*/

class Solution{
   public int getSecondLargest(int[] arr) {
     int n=arr.length;
     int max1=Integer.MIN_VALUE;
     int max2=Integer.MIN_VALUE;
     for(int i=0; i<n; i++){
       if(arr[i]>max1){
         max2=max1;
         max1=arr[i];
       }
       if(arr[i]>max2 && arr[i]!=max1){
         max2=arr[i];
       }
     }
     if(max2==Integer.MIN_VALUE){
       return -1;
     }
     return max2;
   }
}
     
