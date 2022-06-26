import java.util.ArrayList;

public class Iterator {

    public void main(String[] args){
        //making a collection

        ArrayList<String> names=new ArrayList<String>();
        names.add("john");
        names.add("mathew");
        names.add("mark");

        //creating an iterator
        java.util.Iterator<String> name= names.iterator();
        System.out.println(name.next());

       //looping through an Iterator

        while (name.hasNext()){
            System.out.println(name.next());
        }

        //removing an item

        name.remove();

    }
}
