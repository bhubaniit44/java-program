<<<<<<< HEAD
import java.util.Scanner;
public class test3 {
 public static void main(String[] args) {
    System.out.println("what is your name ");
    Scanner sc=new Scanner(System.in);
    String name=sc.next();
    System.out.println(" Hello " + name + " Have a Good Day! ");
 }  
}
=======
        // calculating percentage  cbse borad exam marks from 5 subjects  
         import java.util.Scanner;
         public class test2 {
          public static void main(String[] args) {
           Scanner sc= new Scanner(System.in);
            float total   = 500;
            System.out.println("Enter marks for 5 subject:");
            System.out.println("English");
            float a= sc.nextFloat();
            System.out.println("mathematics");
            float b=sc.nextFloat();
            System.out.println("physics");
            float c=sc.nextFloat();
            System.out.println("chemistry");
            float d=sc.nextFloat();
            System.out.println("nepali");
            float e=sc.nextFloat();
            float sum=a+b+c+d+e;
            System.out.println("Your total marks is: ");
            System.out.println(sum);
            float CGPA= (sum/total)*100;
            System.out.println("marks CGPA is :");
            System.out.println(CGPA);
        }
    }
>>>>>>> 1b09772 (java program which asks the user to enter his/her name)
