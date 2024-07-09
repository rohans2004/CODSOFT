//TASK-->STUDENT GRADE CALCULATOR

import java.util.Scanner;


class StudentGrade {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float eng,hin,phy,math,chem,ob,tot,percentage;
       
        
        //TAKEING INPUT VALUES FROM THE USER

         System.out.println("ENTER THE OBTAINED MARKS BY STUDENT:\n");

         System.out.println("\nENGLISH:");
         eng=sc.nextFloat();

         System.out.println("\nHINDI:");
         hin=sc.nextFloat();


         System.out.println("\nPHYSICS:");
         phy=sc.nextFloat();

         System.out.println("\nMATHEMATICS:");
         math=sc.nextFloat();

         System.out.println("\nCHEMESTRY:");
         chem=sc.nextFloat();

         //NOW AS PER THE TASK PRINTING THE TOTAL OBTAINED MARKS AND TOTAL MAXIMUM MARKS BY THE STUDENT

         tot=5*100;
         ob=eng+hin+math+phy+chem;
         System.out.println("MAXIMUM MARKS : "+tot);
         System.out.println("TOTAL OBTAINED MARKS:"+ob);

        //CREATING THE LOGIC FOR PERCENTAGES
        percentage=(ob/tot)*100;

        //NOW PRINTING THE RESULT
        System.out.println("PERCENTAGE : "+percentage+"%");

        //NOW FOR THE GRADES USING IF ELSE CONDITION

        if (percentage >= 95.00) {
            System.out.println("GRADE : A++ \nSTUDENT PASSED THE EXAMINATION!");
        } 
        else if (percentage >= 90.00) {
            System.out.println("GRADE :  A+ \nSTUDENT PASSED THE EXAMINATION!");
        } 
        else if (percentage >= 85.00) {
            System.out.println("GRADE : A \nSTUDENT PASSED THE EXAMINATION!");
        }
         else if (percentage >= 80.00) {
            System.out.println("GRADE : B++ \nSTUDENT PASSED THE EXAMINATION!");
        } 
        else if (percentage >= 75.00) {
            System.out.println("GRADE : B+ \nSTUDENT PASSED THE EXAMINATION!");
        } 
        else if (percentage >= 70.00) {
            System.out.println("GRADE : B \nSTUDENT PASSED THE EXAMINATION!");
        } 
        else if (percentage >= 65.00) {
            System.out.println("GRADE : C++\nSTUDENT PASSED THE EXAMINATION!");
        } 
        else if (percentage >= 60.00) {
            System.out.println("GRADE : C+ \nSTUDENT PASSED THE EXAMINATION!");
        }
        else if (percentage >= 55.00) {
            System.out.println("GRADE : C \nSTUDENT PASSED THE EXAMINATION! ");
        } 
        else if (percentage >= 50.00) {
            System.out.println("GRADE : D \nSTUDENT PASSED THE EXAMINATION!");
        }
        else {
            System.out.println("GRADE : F \nSTUDENT FAILED IN THE EXAMINATION!\n");
        }


         sc.close();



     }


    }
 