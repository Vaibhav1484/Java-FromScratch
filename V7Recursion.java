import java.util.*;

public class V7Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        // print numbers 
        // n to one 
        // printnum(n);
        
        // one to n
        // int i=1;
        // numprint(n,i);

        //factorial
        // int ans = fact(n);
        // System.out.println(ans);

        //sum of first n nums
        // int sum=0;
        // int i=1;
        // printsum(i,n,sum);

        //factorial
        // int ans=factorial(n);
        // System.out.println(ans);
    
        // fibonaci
        // int f1=0;
        // int f2=1;
        // System.out.println(f1);
        // System.out.println(f2);
        // fibonaci(f1, f2, n-2);

        // first occurance of a number from the last of arr
        // int[] arr={1,2,1,1,4,3,5,2,2,8,3,3,1};
        // System.out.print(lastOcc(arr.length-1,arr));

        // first occurance of a number in an array 
        int[] arr={1,2,5,1,1,4,3,5,2,2,8,3,3,1};
        System.out.print(firOcc(arr.length,arr,0));
        
    }
    public static int firOcc(int n,int[] arr,int i){
        if(i==n-1) return -1;
        if(arr[i]==5) return i;
        return firOcc(n,arr,i+1);   
    }

    public static int lastOcc(int n,int[] arr){
        if(n<0) return -1;
        if(arr[n]==5) return n;   
        return lastOcc(n-1,arr);
    }

    public static void fibonaci(int f1,int f2,int n){
        int c=f1+f2;
        if(n==0) return;
        System.out.println(c);
        fibonaci(f2, c, n-1);
    }


    public static int factorial(int n){
        if(n==0) return 1; // fact of 0 is also 1
        if(n==1) return 1;
        return n*factorial(n-1);
    }

    public static void printsum(int i,int n,int sum) {
        if(i==n){
            sum=sum+i;
            System.out.println(sum);
            return;
        } 
        sum=sum+i;
        printsum(i+1, n, sum);
    }

    public static void printnum(int n){
        if(n==0)    return;
        System.out.println(n);
        printnum(n-1);
    }
    public static void numprint(int n,int i){
        if(i==n+1)  return;
        System.out.println(i);
        numprint(n,i+1);
    }
    public static int fact(int n){
        if(n==0) return 1; // fact of 0 is also 1
        if(n==1) return 1;
        return n*fact(n-1); 
    }
}
