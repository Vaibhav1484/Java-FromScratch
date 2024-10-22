import java.util.*;

public class V10Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // concatenation
        // String FName="vaibhav";
        // String LName="bajaj";
        // String name = FName +" "+ LName;
        // System.out.println(name);

        //    .charAt() function for indexing
        // for(int i=0;i<FName.length();i++){
        //     System.out.print(FName.charAt(i)+" ");
        // }

        //for compairng  .coapreTo() is used

        //substring 
        // String sentence = "my name is vaibhav";
        // String name = sentence.substring(11,sentence.length());
        // System.out.println(name);

        // converting int to strings and string to int
        
        // string to number
        // String str = "123" ;
        // int number = Integer.parseInt(str); 
        // System.out.println(number);

        //num to string 
        // int num = 123;
        // String str = Integer.toString(num);
        // System.out.println(str);

        //question
        // Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
        // int n = sc.nextInt();
        // String arr[] = new String[n];
        // int lengthh = 0;
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextLine();
        //     lengthh += arr[i].length();
        // }
        // System.out.println(lengthh);
        
        //question
        //Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
        // String str=sc.next();
        // String result = "";
        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i) == 'e'){
        //         result +='i';
        //     }else{
        //         result+=str.charAt(i);
        //     }
        // }
        // System.out.println(result);

        //question
        //Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.  
        // String email = sc.next();
        // String username = ""; 
        // for(int i=0;i<email.length();i++){
        //     if(email.charAt(i) == '@'){
        //         break;
        //     }else{
        //         username += email.charAt(i);
        //     }
        // }
        // System.out.println(username);

        //-----
        // String builder
        // StringBuilder sb = new StringBuilder("tony");
        // System.out.println(sb);
        
        // .charAt() func is same 
        // new function .setCharAt();

        // sb.setCharAt(0, 'P');
        // System.out.println(sb);
        
        //inserting
        // sb.insert(0, 'S');
        // System.out.println(sb);
        
        // sb.insert(2, 'o');
        // System.out.println(sb);

        //delete
        // sb.delete(2,3);
        // System.out.println(sb);

        //append to insert ele directly t last
        // sb.append("heyyy");
        // System.out.println(sb);

        // System.out.println(sb.length());


        //reversing a string
            // by creating an extra string
        // String str = "Tony";
        // String newstr = "";
        // for(int i=str.length()-1;i>=0;i--){
        //     newstr += str.charAt(i);
        // }
        // System.out.println(newstr);

        //using string builder 
        // String str = "Tony";
        // StringBuilder sb = new StringBuilder(str);
        // //pointing 2 variables at front and end and simulatneously exchanging their positions
        // for(int i=0;i<sb.length()/2;i++){
        //     // storing indexes
        //     int front = i;
        //     int back = sb.length()-1-i;
        //     //storing charcter
            // char frontchar = sb.charAt(front);
            // char backchar = sb.charAt(back);
        //     // updating them 
        //     sb.setCharAt(front, backchar);
        //     sb.setCharAt(back, frontchar);
        // }
        // System.out.println(sb);

        //remove duplicate
        // String str = "Tonytorkio";
        // StringBuilder sb = new StringBuilder(str);
        // for(int i=0;i<sb.length();i++){
        //     for(int j=i+1;j<sb.length();j++){
        //         if(sb.charAt(i) == sb.charAt(j)){
        //             sb.deleteCharAt(j);
        //             j--;
        //         }
        //     }
        // }
        // System.out.println(sb);
        
        //converting string to lower case and removing any non alphabetical char
        // String s = "A man Is Wild";
        // String str = s.toLowerCase();
        // StringBuilder sb = new StringBuilder();
        // for(int i=0;i<str.length();i++){
        //     char ch = str.charAt(i);   
        //     if(ch>='a' && ch<='z'){
        //         sb.append(ch);
        //     }
        // }
        // System.out.println(sb);

        String s = "  hello   wordl ";
        int i=0;
        int j=s.length()-1;
        int n=s.length()-1;
        String result="";
        while(i<n){
            while(i<n && s.charAt(i)==' '){
                i++;
            }
            j=i+1;
            while(j<n && s.charAt(j)!=' '){
                j++;
            }
            String word = s.substring(i,j);
            result = word + " " + result;
            i=j+1;
        }   
        System.out.println(result);

    }
}
