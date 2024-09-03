class Solution {
    public int[] countBits(int n) {
        
        int[] arr = new int[n+1];

        arr[0] = 0;
        if (n==0) return arr;
        arr[1] = 1;
        if (n==1) return arr;
        arr[2] = 1;
        if (n==2) return arr;

        for (int i=3; i<=n; i++){
            if (i%2 == 0){
                arr[i] = arr[i/2];
            }else{
                arr[i] = arr[i/2] + 1;
            }
        }

        return arr;
    }

}