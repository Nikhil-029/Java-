// import java.util.*;  
// class queue{  
// public static void main(String args[]){  
// // PriorityQueue<String> q=new PriorityQueue<String>();
// Queue<String> ar = new ArrayList(); 
// q.add("Amit");  
// q.add("Vijay");  
// q.add("Karan");  
// q.add("Jai");  
// q.add("Rahul");  
// System.out.println("head:"+q.element());  
// System.out.println("head:"+q.peek());  
// System.out.println("iterating the queue elements:");  
// Iterator itr=q.iterator();  
// while(itr.hasNext()){  
// System.out.println(itr.next());  
// }  
// q.remove();  
// q.peek();
// q.offer("all offer");
// q.poll();  
// System.out.println("after removing two elements:");  
// Iterator<String> itr2= q.iterator();  
// while(itr2.hasNext()){  
// System.out.println(itr2.next());  
// }  
// }  
// }  





import java.util.Queue;
import java.util.LinkedList;

class queue i {

    public static void main(String[] args) {
       
        Queue<arrayllist> numbers = new arrayllist()<>;

        // offer elements to the Queue
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);
        System.out.println("Queue: " + numbers);

        // Access elements of the Queue
        int accessedNumber = numbers.peek();
        System.out.println("Accessed Element: " + accessedNumber);

        // Remove elements from the Queue
        int removedNumber = numbers.poll();
        System.out.println("Removed Element: " + removedNumber);

        System.out.println("Updated Queue: " + numbers);
    }
}