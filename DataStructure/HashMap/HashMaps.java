import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class HashMaps {
    public static void main(String[] args) {
     String name = "sarthak";
     System.out.println(name.hashCode());// it will give you a random number 
 
     Integer a = 2324243;
     int code = a.hashCode();
     System.out.println(code);

     // hashmap is a set of key and value 

     // where key are the unique 
     // and value are same or different  both 

     HashMap <String, Integer> map = new HashMap<>();
     // insert 
     map.put("a", 12);
     map.put("b" , 43);
     map.put("c", 343);
     map.put("d", 33);
     // hashmap are unordered means it will not print the key and value pair sequence wisly 
     // it will print both key and value pair
     System.out.println(map);
    
     // it will print only the keys 
     System.out.println(map.keySet());

     // search
     if(map.containsKey("a")){
        System.out.println("key is prsent in the map");
     }
     else{
        System.out.println("key is nto exist");
     }
     
     // get the value of the key 
     System.out.println(map.get("a"));
     // if the key not exist then it will print null
     System.out.println(map.get("n"));
     // iteration in hashmap
     // where e contain both key and value 
     // map.entry using this we can make the entry set of key and value 
     for(Map.Entry<String,Integer> e: map.entrySet()){
        System.out.println(e.getKey());
        System.out.println(e.getValue());
     }
     Set<String> keys = map.keySet();
     for(String key : keys){
        System.out.println(key + " " + map.get(key));

        // remove
        map.remove("a");
        // it will remove value also 
        System.out.println(map);
     }
    }
}
