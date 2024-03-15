import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

class Ex1{
    public static void main(String args[]){
        
        ArrayList<Integer> arr = new ArrayList<Integer>(); 
        arr.add(21);
        arr.add(32);
        arr.add(5);
        arr.add(12);
        arr.add(41);
 
        Set<Integer> sortedSet = new TreeSet<>(arr);
 
        System.out.println("List after the use of" + 
                        " Collection.sort() :\n" + sortedSet); 
    }
}
