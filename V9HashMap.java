import java.util.*;

public class V9HashMap {
    public static void main(String[] args) {
        // (country,population)   as key:value pair
        HashMap<String,Integer> map = new HashMap<>();

        //inserting elements  --- .put()
        map.put("China",150);
        map.put("Pakistan",110);
        map.put("India",80);

        //printing 
        // System.out.println(map);

        // .put() is also used as for updating values
        // map.put("China",180);
        // System.out.println(map);

        //search   .containsKey()
        // if(map.containsKey("China")){
        //     System.out.println("yes it exists");
        // }else{
        //     System.out.println("does not exists");
        // }
        // .containsValue()
        if(map.containsValue(120)){
            System.out.println("yes it exists");
        }else{
            System.out.println("does not exists");
        }

        //to get value or particular key
        System.out.println(map.get("China")); //here key exists so value prints
        System.out.println(map.get("iran")); //here key does not exists so null prints

        //iteration in Hashmap
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.print(e.getKey()+" ");
            System.out.println(e.getValue());
        }





    }
}
