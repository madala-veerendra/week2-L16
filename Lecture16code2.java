import java.beans.Introspector;
import java.util.Iterator;
import java.util.Vector;

class Sample {
    public static void main(String[] args) {
        Vector vec = new Vector();

        vec.add("texas");
        vec.add("zurich");
        vec.add("queens");

        Iterator pointer = vec.Iterator();

        while(pointer.hasNext()){
            System.out.println(pointer.next());
        }
    }
}