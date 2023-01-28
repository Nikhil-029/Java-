import java.util.LinkedList; 
  
public class ReverseLinkedList { 
  
    // Function to reverse the linked list 
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) 
    { 
        // If the linked list is empty 
        if (list.size() == 0) { 
            System.out.println("Linked List is empty."); 
            return list; 
        } 
  
        // Declaring the variables 
        int start = 0; 
        int end = list.size() - 1; 
  
        // Reversing the list 
        while (start < end) { 
  
            // Swap the variables 
            int temp = list.get(start); 
            list.set(start, list.get(end)); 
            list.set(end, temp); 
  
            // Increment start and decrement end 
            start++; 
            end--; 
        } 
  
        // Return the reversed list 
        return list; 
    } 
  
    // Main Method 
    public static void main(String[] args) 
    { 
  
        // Create a Linked List of integers 
        LinkedList<Integer> list = new LinkedList<Integer>(); 
  
        // Add elements to the list 
        list.add(7); 
        list.add(5); 
        list.add(4); 
        list.add(8); 
        list.add(2); 
        list.add(3); 
        list.add(1); 
        list.add(6); 
  
        // Print the list 
        System.out.println("The list before reversing is: " + list); 
  
        // Reverse the list 
        list = reverseLinkedList(list); 
  
        // Print the reversed list 
        System.out.println("The list after reversing is: " + list); 
    } 
}

