import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
class Sample {
    public static void main(String [] args){
        ArrayList<String> states = new ArrayList<String>();
        states.add("Andhra pradesh");
        states.add("Haryana");
        states.add("Bihar");
        states.add("Kerala");
        states.add("Rajasthan");
        System.out.println("Arraylist: "+states);

        String s = states.get(2);
        System.out.println("I got " +s);
        //for size of list
        System.out.println("Arraylist Size " +states.size());

        //for accessing elements
        for(int i = 0;i < states.size();i++){
            System.out.println(states.get(i));
        }
        //to update elements of the list
        states.set(2, "Punjab");
        System.out.println("after updating :" + states);
        //to remove elements
        String t = states.remove(1);
        System.out.println("element removed :"+ t);
        System.out.println("after deletion the list :" +states);

        //for sorting the list
        states.sort(Comparator.naturalOrder());//A-Z --> a-z
        System.out.println("Array after sorting :"+states);
        //to check element
        System.out.println("Is Telangana there? "+states.contains("Telangana"));
        //to check if list is empty
        System.out.println("is list empty "+ states.isEmpty());
        states.removeAll(states);
        System.out.println("is list empty "+ states.isEmpty());
    }
}