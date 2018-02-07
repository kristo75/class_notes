import java.util.Collection;
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
//        HashMap<String, String> favouriteFruits = new HashMap();
//        favouriteFruits.put("Robert", "Banana");
//        favouriteFruits.put("Ross", "Apple");
//        favouriteFruits.put("Colin", "Steak");
//
//        System.out.println(favouriteFruits.get("Colin"));
//    }
//
//        HashMap<String, Integer> ages = new HashMap<String, Integer>();
//        ages.put("Colin", 34);
//        ages.put("Zsolt", 46);
//
//        Integer colinAge = ages.get("Colin");
//
//        String output = "Colin's age is " + colinAge.toString();
//        System.out.println(output);
//        ages.get("Zsolt");
//        ages.size();
//        ages.clear();
//        ages.containsValue(46);

            HashMap<String, String> country = new HashMap<>();
            country.put("UK", "64,100,000");
            country.put("Germany", "80,620,000");
            country.put("France", "66,030,000");
            country.put("Japan", "127,300,000");

            System.out.println(country.get("UK"));

            System.out.println(country.values());

        System.out.println(country.keySet());





//        Output some values from the HashMap using .get(key) and system.out.println().
//                Investigate the use of the .values() and .keySet() methods on HashMap.
    }
}
