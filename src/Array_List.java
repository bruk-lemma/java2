import java.util.ArrayList;

public class Array_List {

    public static void main(String[] args){
        //initialize Array_List
        ArrayList <String> cars=new ArrayList<>();
        //adding to the array list
        cars.add("volvo");
        cars.add("nissan");
        System.out.println(cars);
        //accessing arraylist members
        System.out.println(cars.get(0));

        //modify an element
        cars.set(0,"toyota");
        System.out.println(cars);

        //removing an element
        cars.remove(1);
        System.out.println(cars);

        //dis[lay the size
        System.out.println(cars.size());

        //loop through an ArrayList

        for(int i=0;i<cars.size();i++){
            System.out.println(cars.get(i));
        }


        //sorting an arraylist
        cars.add("lexus");
        cars.add("corvvet");
        cars.add("maclaren");
        cars.add("ferrari");
        cars.add("lamborgini");
        cars.add("austen martin");
        cars.add("rolls roys");
        for(String b : cars){
            System.out.println(b);
        }

    }
}
