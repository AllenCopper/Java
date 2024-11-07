import java.util.Scanner; 
 
public class Exception_handling { 
  
  
 static int a,b; 
 public static void div() { 
  int c=a/b; 
  System.out.println("Answer is:"+c); 
   
 } 
 
 public static void main(String[] args) { 
 
  Scanner sc = new Scanner(System.in); 
  System.out.println("Enter value of a:"); 
           a=sc.nextInt(); 
           System.out.println("Enter value of b:"); 
  b=sc.nextInt();  
 
  try { 
   div(); 
  } catch (Exception e) { 
   System.out.println("Cannot divide by zero"); 
  } 
   
 } 
 
} 