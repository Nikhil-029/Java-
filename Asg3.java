// public class Asg3 {

    
// }

import java.util.*; 



 class batsman { 

 

  String FirstName; 

  String LastName; 

  int runs; 

  int fours; 

  int sixes; 

  Scanner sc = new Scanner(System.in); 

 

  void initil_value(){ 

 

    System.out.println("Enter FirstName "); 

    this.FirstName = sc.next(); 

    System.out.println("Enter LastName "); 

    this.LastName = sc.next(); 

    System.out.println("Enter RunMade "); 

    this.runs = sc.nextInt(); 


    System.out.println("Enter No_of_fours "); 

    this.fours = sc.nextInt(); 

    System.out.println("Enter No_of_sixs "); 

    this.sixes = sc.nextInt(); 

  } 

 

  void update_run(){ 

    System.out.println("Enter the update run "); 

   int  run = sc.nextInt(); 
    this.runs = this.runs + run;

    System.out.println("your run update "+ this.runs); 

  } 

 

  void info(){  

    System.out.println(); 

    System.out.println("Name :- "+ this.FirstName+this.LastName); 

    System.out.println("No_of_fours & sixs  :- " + this.fours + " " + this.sixes); 

 

    System.out.println("Total Run made "+ this.runs); 

  } 

 

} 
public class Asg3{
    public static void main(String[] args) { 

        batsman virat = new batsman(); 
       virat.initil_value(); 
    
        virat.update_run(); 
    
        virat.info(); 
    
      } 


}