
package week2inheritance;
import java.util.Scanner;


class Student{
    String name;
    int studID;
    String gender;
    int age;
    
}
class ElmStudent extends Student{
    boolean allergies;
    int emergContactNum;
    String emergContactName;
}
class HSStudent extends Student{
    String[] Extracurriculars;
    
}
class CollStudent extends Student{
    boolean Scholarship;
    
}

public class ParentalPractice {
    public static void main(String[]args){
        
       
        Scanner dataEntry = new Scanner(System.in);
        Student[] stds = new Student[5];
        for (int i=0;i<stds.length;i++){
            System.out.println("Select Level for New Student");
            int level = dataEntry.nextInt();
            switch(level){
                case 0: 
                    stds[i] = new ElmStudent();
                System.out.println("Enter Student's Fist Name: ");
                stds[i].name = dataEntry.next();
                    System.out.println("Enter Student's Gender: ");
                stds[i].gender = dataEntry.next();
                break;
                case 1: 
                    stds[i]=new HSStudent();
                    break;
                default: 
                    break;
                
                
                
            }
            
        }
        
        
      // if (pstud instanceof ElmStudent){
        //   System.out.println("pstud is a ElmStudent");
      // }
          
       
       
       
    }
}
