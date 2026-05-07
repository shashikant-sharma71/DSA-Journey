package Hashing;

import java.util.*;
 
public class hashmap {
    public static void main (String[] args){
        HashMap<String ,Integer> map = new HashMap<>();


// Insert
        map.put( "Delhi",80);

        map.put("Mumbai" ,78);

        System.out.println(map);
// Search

// if (map.containsKey("Delhi")){
//     System.out.println("Key Exist");

// }else{
//     System.out.println("Not exist");

// }


// Second option for Searching in the Map;

// System.out.print(map.get("Delhi"));
// System.out.print(map.get("Maharastra"));




// For loop in HashMap

for(Map.Entry<String ,Integer> e: map.entrySet()){
    System.out.println(e.getKey());
    System.out.println(e.getValue());
    
}


// Remove 

map.remove("Delhi");

System.out.println(map);

    }
    
}
