import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Demo3 {
    public static void main(String[] args) {
        // List Interface

        // ArrayList
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        list.add("Abhay");
        list.add("Sharad");
        list.add("Chetan");
        System.out.println(list);
        list.remove("Sharad");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

        //Sorting
        // Arrays.so
        // Collection.sort()

        // LinkedList

        LinkedList<Integer> ll = new LinkedList<>();
        System.out.println(ll);
        ll.add(1);
        ll.add(12);
        ll.add(18);
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
        ll.remove(0);
        System.out.println(ll);

        // Vector

        Vector<String> vct = new Vector<>();

        System.out.println(vct);
        vct.add("Abhay");
        vct.add("Sharad");
        vct.add("Chetan");
        System.out.println(vct);
        vct.remove("Sharad");
        System.out.println(vct);
        vct.remove(0);
        System.out.println(vct);

        // Stack

        Stack<String> st = new Stack<>();
        st.push("Abhay");
        st.push("Sharad");
        st.push("Chetan");
        System.out.println(st.pop());
        st.add("Vansh");

        // Queue

        Queue<String> at = new LinkedList<>();
        at.add("Abhay");
        at.add("Sharad");
        at.add("Chetan");
        System.out.println(at.remove());

        // Deque

        Deque<String> deq = new ArrayDeque<>();
        deq.add("Nikhil");
        deq.add("Nicky");
        deq.add("Vansh");
        deq.addFirst("Tanishq");
        System.out.println(deq);
        deq.removeLast();
        System.out.println(deq);

        // Set Interface

        // HashSet
        Set<Integer> hSet = new HashSet<>();
        hSet.add(15);
        hSet.add(2);
        hSet.add(4);
        hSet.add(75);
        hSet.add(75);
        hSet.add(45);
        System.out.println(hSet);
        // hSet.remove(75);
        // System.out.println(hSet);

        // LinkedHashSet

        Set<Integer> lhSet = new LinkedHashSet<>();
        lhSet.add(55);
        lhSet.add(65);
        lhSet.add(65);
        lhSet.add(75);
        System.out.println(lhSet);
        lhSet.remove(75);
        System.out.println(lhSet);

        // Tree set
        Set<Integer> tSet = new TreeSet<>();
        tSet.add(15);
        tSet.add(2);
        tSet.add(4);
        tSet.add(75);
        tSet.add(75);
        tSet.add(45);
        System.out.println(tSet);

        // Map Interface

        //HashMap
        Map<String, Integer> map = new HashMap<>();

        map.put(null, 80);
        map.put("Vansh", 20);
        map.put("Vansh", 80);
        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println(map);

        //LinkedHashMap

        Map<String, Integer> map2 = new LinkedHashMap<>();

        map2.put("Nikhil", 80);
        map2.put("Vansh", 20);
        map2.put("Vansh", 80);
        System.out.println(map2.keySet());
        System.out.println(map2.values());

        System.out.println(map2);


        //TreeMap
        
        Map<String, Integer> tmap = new TreeMap<>();

        tmap.put("third", 3);
        tmap.put("seven", 7);
        tmap.put("one", 1);
        System.out.println(tmap.keySet());
        System.out.println(tmap.values());

        System.out.println(tmap);



         //HashTable
        
        Map<String, Integer> htable = new Hashtable<>();

        // htable.put(null, null);
        htable.put("seven", 7);
        htable.put("one", 1);
        System.out.println(htable.keySet());
        System.out.println(htable.values());

        System.out.println(htable);





    }
}