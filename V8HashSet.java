import java.util.*;

public class V8HashSet {
    public static void main(String[] args) {
        
        HashSet<Integer> set = new HashSet<>();

        //adding elements---- .add()
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);

        //searching elements --- .contains()
        // if(set.contains(1)){
        //     System.out.println("conatins 1");
        // }
        // if(!set.contains(6)){
        //     System.out.println("does not contains 6");
        // }
        
        // size of set
        System.out.println("set size: " + set.size());

        //printing  directly 
        System.out.println(set);    //only prints unique elements


        //iteration in hashset
        Iterator it = set.iterator();
// has 2 functions  ---- next() nd hasNext()
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        //deletig elements from set --- .remove()
        set.remove(2);
        System.out.println(set);
        

    }
}
