import java.util.HashSet;

public class HashSets {

    public static void main(String[] args){
        //creating hsh sets
    HashSet<String> cars=new HashSet <String> ();
    cars.add("volvo");
    cars.add("nissan");
    cars.add("toyota");
        System.out.println(cars);

        //to check if it exists
        System.out.println(cars.contains("ferrari"));
        //to remove an item
        cars.remove("volvo");
        System.out.println(cars);
        //to clear all elements
        cars.clear();
        System.out.println(cars);
        //loop through a hashset
        cars.add("EuroTracker");
        for (String car:cars){
            System.out.println(car);
        }

    }
}