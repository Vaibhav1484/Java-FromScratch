import java.util.*;

public class V3Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=4;
       
        // *****
        // *****
        // *****
        // *****
        // for(int row=0;row<n;row++){
        //     for(int col=0;col<n+1;col++){
        //         System.out.print("*");
        //     }
        //     System.out.println(); 
        // }

        // *
        // **
        // ***
        // ****
        // for(int row=1;row<=n;row++){
        //     for(int col=1;col<=row;col++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // ****
        // ***
        // **
        // *
        // for(int row=0;row<n;row++){
        //     for(int col=0;col<n-row;col++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //both ways
        // for(int row=0;row<n;row++){
        //     for(int col=n;col>row;col--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // *****
        // *   *
        // *   *
        // *****
        // int m=5;
        // for(int row=1;row<=n;row++){
        //     for(int col=1;col<=m;col++){
        //         if(row==1 || col == 1 || row==n || col==m){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
    //      *
    //     **
    //    ***
    //   ****
        // for(int row=0;row<n;row++){
        //     for(int cts=n-1;cts>row;cts--){
        //         System.out.print(" ");
        //     }   
        //     for(int col=0;col<=row;col++){
        //         System.err.print("*");
        //     }
        //     System.out.println();
        // } 
        //both ways
        // for(int row=0;row<n;row++){
        //     for(int cts=1;cts<n-row;cts++){
        //         System.out.print(" ");
        //     }   
        //     for(int col=0;col<=row;col++){
        //         System.err.print("*");
        //     }
        //     System.out.println();
        // }

        // 1 
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // for(int row=1;row<=n;row++){
        //     for(int col=1;col<=row;col++){
        //         System.out.print(col + " ");
        //     }
        //     System.out.println();
        // }
        

        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }
}
