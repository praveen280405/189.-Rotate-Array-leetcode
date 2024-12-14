class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        int xx = k % n;
        if(n==1){
            arr[0] = arr[0];
        }else{
        while(xx-->0){
             int temp = arr[n-1];
             int temp2 = arr[n-2];
             for(int i = n-2; i>=1; i--){
                arr[i] = arr[i-1];
             }
           
            arr[n-1] = temp2;
            arr[0] = temp;
       
        }
        }
    }
   ;
}
