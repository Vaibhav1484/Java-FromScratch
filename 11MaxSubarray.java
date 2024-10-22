public class V11MaxSubarray {
    public static void main(String[] args) {

        // max subarray sum with bruteforce with time complexity of n^3
        // int []arr = {1,2,3,4};
        // int max = Integer.MIN_VALUE;
        // int sum=0;

        // for(int i=0;i<arr.length;i++){
        //     for(int j=i;j<arr.length;j++){
        //         for(int k=i;k<=j;k++){
        //             System.out.print(arr[k]+" ");
        //         }
        //         System.out.println();
        //     }
        //     sum=sum+arr[i];
        //     if(max<sum){
        //         max=sum;
        //     }
        // }
        // System.out.println("max sum == "+max);



        // KADANE'S ALGORITHM  -- says to ignore value which take the sum to less than 0
        // optiomal approach with time complexity of n

        // just for printing the subarray and its indexes 
        // start, ans_start, ans_end is used nothing else
        int []arr = {-2,-3,4,-1,-2,1,5,-3};
        int max = Integer.MIN_VALUE;
        int sum=0;
        int ans_start = -1;
        int ans_end = -1;
        int start = 0;
        for(int i=0;i<arr.length;i++){
            // if(sum == 0){    
            //     start=i;
            // }
            sum=sum+arr[i];
            if(sum>max){
                max = sum;
                // ans_start=start;
                // ans_end = i;
            }
            if(sum<0){
                sum = 0;
            }
        }
        System.out.println("max subarray == " + max);
        // System.out.println(ans_start);
        // System.out.println(ans_end);
        // System.out.println("subarry==");
        // for(int i=ans_start;i<=ans_end;i++){
        //     System.out.print(arr[i]+" ");
        // }

    }
}
