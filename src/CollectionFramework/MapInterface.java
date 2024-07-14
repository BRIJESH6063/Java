package CollectionFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

// OR
import java.util.* ;

public class MapInterface {
    public static void main(String[] args) {
        Map<String, String> mp = new HashMap<>() ;
        mp.put("us", "United States") ;
        mp.put("in", "India") ;
        mp.put("br", "Brazil") ;
        // values can be repeated but keys cant..

        /*
        System.out.println(mp);
        mp.remove("us") ;
        System.out.println(mp);

        mp.put("in", "India2") ; // same key can modify value...
        System.out.println(mp.get("in"));

        System.out.println(mp.getOrDefault("en", "Some other Country"));
        */

        System.out.println(mp.keySet());
        System.out.println(mp.values());
        System.out.println(mp.entrySet()); // key-value pair..

        // Set<String> values = (Set<String>) mp.values() ; // error
        // Exception in thread "main" java.lang.ClassCastException: class java.util.HashMap$Values cannot be cast to class java.util.Set (java.util.HashMap$Values and java.util.Set are in module java.base of loader 'bootstrap')
        // at CollectionFramework.MapInterface.main(MapInterface.java:32)

        Collection<String> values = mp.values() ;
        System.out.println(values) ;

        Set<Map.Entry<String, String>> entries = mp.entrySet() ;

        for(Map.Entry<String, String> entry: entries) {
            System.out.println(entry.getKey() + " : "  + entry.getValue());
        }



    }
}
