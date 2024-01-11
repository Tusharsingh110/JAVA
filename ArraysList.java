import java.util.*;
// Resizable-array implementation of the List interface. Implements all optional list operations, and permits all elements, including null. In addition to implementing the List interface, this class provides methods to manipulate the size of the array that is used internally to store the list. (This class is roughly equivalent to Vector, except that it is unsynchronized.)

// The size, isEmpty, get, set, iterator, and listIterator operations run in constant time. The add operation runs in amortized constant time, that is, adding n elements requires O(n) time. All of the other operations run in linear time (roughly speaking). The constant factor is low compared to that for the LinkedList implementation.

// Each ArrayList instance has a capacity. The capacity is the size of the array used to store the elements in the list. It is always at least as large as the list size. As elements are added to an ArrayList, its capacity grows automatically. The details of the growth policy are not specified beyond the fact that adding an element has constant amortized time cost.

// An application can increase the capacity of an ArrayList instance before adding a large number of elements using the ensureCapacity operation. This may reduce the amount of incremental reallocation.

// Note that this implementation is not synchronized. If multiple threads access an ArrayList instance concurrently, and at least one of the threads modifies the list structurally, it must be synchronized externally. (A structural modification is any operation that adds or deletes one or more elements, or explicitly resizes the backing array; merely setting the value of an element is not a structural modification.) This is typically accomplished by synchronizing on some object that naturally encapsulates the list. If no such object exists, the list should be "wrapped" using the Collections.synchronizedList method. This is best done at creation time, to prevent accidental unsynchronized access to the list:


public class ArraysList {
    public static void display(ArrayList<String> items) {
        int i=1;
        System.out.println();
        // for(String item:items) {
        //     System.out.println(i +((i%10==1) ? ("st") : ((i%10==2) ? ("nd") : ((i%10==3) ? ("rd") : ("th")))) + " item is: " + item);
        //     ++i;
        // }
        System.out.println(items);
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<String> foods = new ArrayList<String>();
        foods.add("Chole Bhature");
        foods.add("Nakli Shahi Paneer");
        foods.add("Soya Chaap");
        foods.add("Paani puri");
        foods.add("Bhel Puri");
        
        display(foods);

        // ARRAYLIST MEHTODS 
        // 1 set(int index, object val)
        System.out.println("changed " + foods.get(0));
        foods.set(0, "Egg Curry");
        display(foods);

        // 2 get(int index)
        // returns the element at the provided index

        ArrayList<ArrayList<String>> games = new ArrayList<>();
        ArrayList<String> mmorpg =  new ArrayList<>(Arrays.asList("Genshin Impact","Sky:COTL"));
        ArrayList<String> racing =  new ArrayList<>(Arrays.asList("Asphalt 9","Forza Horizon", "City Racing"));
        ArrayList<String> fps =  new ArrayList<>(Arrays.asList("Ghost Recon","Call of Duty", "Battlefield"));
        System.out.println(mmorpg);
        System.out.println(racing);
        System.out.println(fps);

        games.add(mmorpg);
        games.add(racing);
        games.add(fps);
        for(ArrayList<String> arr:games) {
            System.out.println(arr);
        }
    }
}
