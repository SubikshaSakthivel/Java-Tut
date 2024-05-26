import java.util.ArrayList;
 import java.util.LinkedList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        // Demonstration using ArrayList
        System.out.println("ArrayList Demo:");
        List<String> arrayList = new ArrayList<>();
        
        // Add elements
        arrayList.add("Element1");
        arrayList.add("Element2");
        arrayList.add("Element3");
        System.out.println(arrayList);
        // Add element at specific index
        arrayList.add(3, "Element4");
        
        // Get element at index
        System.out.println("Element at index 1: " + arrayList.get(1));
        
        // Set element at index
        arrayList.set(2, "Element5");
        System.out.println(arrayList);
        // Remove element by index
        arrayList.remove(1);
        System.out.println(arrayList);
        // Remove element by object
        arrayList.remove("Element5");
        
        // Size of ArrayList
        System.out.println("Size of ArrayList: " + arrayList.size());
        
        // Check if ArrayList is empty
        System.out.println("Is ArrayList empty? " + arrayList.isEmpty());
        
        // Check if ArrayList contains an element
        System.out.println("Does ArrayList contain 'Element1'? " + arrayList.contains("Element1"));
        
        // Clear ArrayList
        arrayList.clear();
        
        // Check size after clearing
        System.out.println("Size of ArrayList after clear: " + arrayList.size());
    
//================ARRAY LIST OUTPUT=====================//
// ArrayList Demo:
// [Element1, Element2, Element3]
// Element at index 1: Element2
// [Element1, Element2, Element5, Element4]
// [Element1, Element5, Element4]
// Size of ArrayList: 2
// Is ArrayList empty? false
// Does ArrayList contain 'Element1'? true
// Size of ArrayList after clear: 0
LinkedList<String> linkedList = new LinkedList<>();
        
        // Add elements
        linkedList.add("ElementA");                                                 
        linkedList.add("ElementB");
        linkedList.add("ElementC");
        
        // Add element at specific index
        linkedList.add(1, "ElementD");
        
        // Display the list after adding
        System.out.println("LinkedList after adding elements: " + linkedList);
        
        // Get element at index
        System.out.println("Element at index 1: " + linkedList.get(1));
        
        // Set element at index
        linkedList.set(2, "ElementE");
        System.out.println("LinkedList after setting element at index 2: " + linkedList);
        
        // Remove element by index
        linkedList.remove(1);
        System.out.println("LinkedList after removing element at index 1: " + linkedList);
        
        // Remove element by object
        linkedList.remove("ElementE");
        System.out.println("LinkedList after removing 'ElementE': " + linkedList);
        
        // Size of LinkedList
        System.out.println("Size of LinkedList: " + linkedList.size());
        
        // Check if LinkedList is empty
        System.out.println("Is LinkedList empty? " + linkedList.isEmpty());
        
        // Check if LinkedList contains an element
        System.out.println("Does LinkedList contain 'ElementA'? " + linkedList.contains("ElementA"));
        
        // Add elements at the beginning and end
        linkedList.addFirst("Start");
        linkedList.addLast("End");
        System.out.println("LinkedList after adding elements at the beginning and end: " + linkedList);
        
        // Get first and last elements
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());
        
        // Remove first and last elements
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("LinkedList after removing first and last elements: " + linkedList);
        
        // Clear LinkedList
        linkedList.clear();
        
        // Check size after clearing
        System.out.println("Size of LinkedList after clear: " + linkedList.size());
    }
}