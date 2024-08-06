import java.util.*;
public class V4Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    
        // int a = sc.nextInt();    
        // int b = sc.nextInt();
    
        //fibonacci series
        // fibo(n);
        
        //gcd of 2 num
        // gcd(a,b);
        
        //power of number
        // rasietopower(a,b);

        //circumferrence of circle
        // circum(n);

        // greatest of 2 numbers
        // greatnum(a,b);

        //odd num sum
        // oddsum(n);

        //avg of 3 numbers
        // numavg(n,a,b);

        //printing table
        // prnttable(n);

        //chcking a num even or not
        // chcknum(n);

        //prime no
        // primeno(n);
        
        //factorial
        // int ans = factorial(n);
        // System.out.println(ans);
        
        //sum of 2 no
        // int ans = sum(a,b);ṇ
        // System.out.println(ans);
        // sum(a,b);    
    }

    // public static void fibo(int n){
    //     if(n>=0) System.out.print(0 + " ");
    //     if(n>=1) System.out.print(1 + " ");
    //     int f0=0;
    //     int f1=1;
    //     for (int i=2;i<n;i++){
    //         int ans = f0 + f1;
    //         System.out.print(ans +" ");
    //         f0=f1;
    //         f1=ans;
    //     }
    // }

    // public static void gcd(int a,int b){
    //     int smaller=0;
    //     if(a<b){
    //         smaller = a;    
    //     }else{
    //         smaller = b;
    //     }
    //     int ans=1;
    //     for(int i=smaller;i>0;i--){
    //         if(a%i==0 && b%i==0){
    //             ans =i;
    //             break;
    //         }            
    //     }
    //     System.out.println(ans);
    // }

    // public static void rasietopower(int a,int b){
    //     int ans = 1;
    //     for(int i=1;i<=b;i++){
    //         ans = ans * a;
    //     }
    //     System.out.println(ans);
    // }

    // public static void circum(int n){
    //     double circumferrence;
    //     circumferrence = (2*3.14)*n;
    //     System.out.println(circumferrence);
    // }

    // public static void greatnum(int a,int b){
    //     if(a>b){
    //         System.out.println("A is greater");
    //     }else{
    //         System.out.println("B is greater");
    //     }
    // }

    // public static void oddsum(int n){
    //     int sum=0;
    //     for(int i=1;i<=n;i++){
    //         if(i%2 != 0){
    //             sum+=i;
    //         }
    //     }
    //     System.out.println(sum);
    // }

    // public static void numavg(int n,int a,int b){
    //     System.out.println((n+a+b)/3);
    // }

    // public static void prnttable(int n){
    //     int ans=1;
    //     for(int i=1;i<=10;i++){
    //         ans = n*i;
    //         System.out.println(ans);
    //     }
    // }

    // public static void chcknum(int n){
    //     if(n%2 == 0){
    //         System.out.println("yes it is even num");
    //     }else{
    //         System.out.println("no its not an even no");
    //     }
    // }
 
    // public static void primeno(int n){
    //     boolean flag = true;

    //     for(int i=2;i<n;i++){
    //         if(n%i == 0){
    //             flag = false;
    //             break;
    //         }
    //     } 

    //     if(flag){
    //         System.out.println("yes it is prime");
    //     }else{
    //         System.out.println("not a prime no");
    //     }
    // }

    // public static int factorial(int n){
    //     if(n<=0){
    //         return 0;
    //     }
    //     int ans=1;
    //     for(int i=n;i>=1;i--){
    //         ans=ans*i;
    //     }
    //     return ans;
    // }

    // public static int sum(int a,int b){
    //     int sum=a+b;
    //     return sum;
    //     // System.out.println(sum);
    // }.0
}
