


import java.util.*;

public class V5Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //array declare input and print
        // int arr[] = new int[n];
        //     //input
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }
        //     //printing
        // //System.out.println("normal array: ");
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();


        // int n=sc.nextInt();

        // int arr[] = {1,2,3};
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i] + " ");
        // }
        
        // int size = sc.nextInt();
        // int arr[] = new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i] + " ");
        // }
        
        // int size = sc.nextInt();
        // int numbers[] = new int[size];
        // for(int i=0;i<size;i++){
        //     numbers[i] = sc.nextInt();
        // }
        // System.out.print("enter target val: ");
        // int x = sc.nextInt();
        // for(int i=0;i<size;i++){
        //     if(numbers[i]==x){
        //         System.out.println("index no: " + i);
        //     }
        // }


        //arr of names nd print
        // int n = sc.nextInt();
        // String arr[] = new String[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.next();
        // }
        // for(int i=0;i<n;i++){
        //     System.out.println(arr[i]);
        // }


        //max and min numbers in int arr
        // int arr[] = new int[n];
        
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }

        // int min = Integer.MAX_VALUE;
        // int max = Integer.MIN_VALUE;
        
        // for(int i=0;i<n;i++){
        //     if(arr[i]<min){
        //         min = arr[i];
        //     }
        //     if(arr[i]>max){
        //         max = arr[i];
        //     }
        // }
        // System.out.println(min);
        // System.out.println(max);

    //arr is in asc order or not 
        // int n=sc.nextInt();
        // int arr[] = new int[n];
        
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }
        // boolean flag = true;
        // for(int i=0;i<n-1;i++){
        //     if(arr[i]>arr[i+1]){
        //         flag = false;
        //     }
        // }
        // if(flag){
        //     System.out.println("Yes it is in asc order");
        // }else{
        //     System.out.println("No it is not in asc order");
        // }
        
    //Find the maximum nd minimum element in an array.
        // int arr[] = new int[n];
        
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println("normal: ");
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();
        
        // Arrays.sort(arr);
        // System.out.println("sorted: ");
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();
        // int max = arr[arr.length-1];
        // int min = arr[0];
        // System.out.println("max ele: "+ max);
        // System.out.println("min ele: "+ min);

    //Calculate the sum of all elements in an array.
        // int arr[] = new int[n];
        
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }
        // int sum = 0;
        // for(int i=0;i<n;i++){
        //     sum +=arr[i];
        // }
        // System.out.println();
        // System.out.println("sum is: "+sum);

    //Reverse an array.
    // int n = sc.nextInt();
    //     int arr[] = new int[n];
    //     for(int i=0;i<n;i++){
    //         arr[i] = sc.nextInt();
    //     }
    //     System.out.println("normal array: ");
    //     for(int i=0;i<n;i++){
    //         System.out.print(arr[i] + " ");
    //     }
    //     System.out.println();
        
        // int revarr[] = new int[n];
        // int x=arr.length-1;
        // for(int i=0;i<n;i++){
        //     revarr[i]= arr[x];
        //     x--;
        // }
        // System.out.println();
        // System.out.println("reversed arr : ");
        // for(int i=0;i<n;i++){
        //     System.out.print(revarr[i] + " ");
        // }
////another way of printing reversed array without making a new array
        // System.out.println("reversed arr : ");
        // for(int i=n-1;i>=0;i--){
        //     System.out.print( arr[i] + " ");
        // }

        //print subarrays and the count 
        // int arr[] = {1,2,3,4};
        // int m = arr.length;
        // int count =0;
        // for(int i=0;i<m;i++){
        //     for(int j=i;j<m;j++){
        //         for(int k=i;k<=j;k++){
        //             System.out.print(arr[k] + " ");
        //         }
        //         System.out.println();
        //         count++;
        //     }
        // }
        // System.out.println(count);
        // int arr[] = {1,2,3,4};
        // int m = arr.length;
        // int count =0;
        // for(int i=0;i<m;i++){
        //     for(int j=i;j<m;j++){
        //         for(int k=i;k<=j;k++){
        //             System.out.print(arr[k] + " ");
        //         }
        //         System.out.println();
        //         count++;
        //     }
        // }
        // System.out.println(count);
        
        //subarray sum    -- here doing sum including every element 
        int arr[] = {1,2,3};
        int m = arr.length;
        int sum=0;
        for(int i=0;i<m;i++){
            for(int j=i;j<m;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k] + " ");
                    sum=sum+arr[k]; 
                }
                System.out.println();
            }
        }
        

    //Remove duplicates from a sorted array.
        // int N=4;
        // int A[] = {1,2,2,3};
        // int ans = remove_duplicate(A,N); // this function is made separately at the end 
        // System.out.println(ans);
    
    //
    
    
    }
    // public static int remove_duplicate(int A[], int N) {
    //     ArrayList<Integer> al = new ArrayList<>();
    //     al.add(A[0]);  

    //     for (int i = 1; i < N; i++) {
    //         if (A[i] != A[i - 1]) {
    //             al.add(A[i]);  
    //         }
    //     }

    //     for (int i = 0; i < al.size(); i++) {
    //         A[i] = al.get(i);
    //     }
    //     return al.size();  
    // }
}
