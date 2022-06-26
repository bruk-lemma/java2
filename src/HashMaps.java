import java.util.HashMap;

public class HashMaps {


    public static  void main(String[] args){
        //creating hashmaps
        HashMap<String, String> capitalCities=new HashMap<String,String>();
        //adding to hashmaps
        capitalCities.put("England","london");
        capitalCities.put("Germany","berlin");
        capitalCities.put("Ethiopia","addis ababa");
        System.out.println(capitalCities);

        //Accessing an item
        System.out.println(capitalCities.get("England"));
        System.out.println(capitalCities);
        //removing an item
        capitalCities.remove("Ethiopia");
        System.out.println(capitalCities);

        //identify size
        System.out.println(capitalCities.size());

        //loop through hashmap
        for(String name:capitalCities.values()){
            System.out.println(name);
        }



    }
}
