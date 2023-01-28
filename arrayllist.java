import java.util.*;  
public class arrayllist {
public static void main(String args[]){  
ArrayList<Integer> list=new ArrayList<Integer>();
ArrayList<Integer> list1=new ArrayList<Integer>();
ArrayList<Integer> list2=new ArrayList<Integer>();//Creating arraylist  
list.add(3);//Adding object in arraylist  
list.add(5);  
list.add(6);  
list.add(8);  
list.add(3, 88);
// list.remove(2);
list1.add(9);//Adding object in arraylist  
list1.add(55);  
list1.add(4);  
list1.add(3);  
list1.add(3, 82);

list.sort(null);
list1.sort(null);
list.addAll(list1);
//Traversing list through Iterator  
Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}