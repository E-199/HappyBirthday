/**
 * 
 */
package WeekOne;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 * @author E-199
 *
 */
public class FunnyAlgorithms {

	/**
	 * @param args
	 */
		
	public static void main(String[] args) {
		String name;
		int dayofbirth;
		Month monthofbirth; 
		
		 Scanner in = new Scanner(System.in);  
         System.out.print("Enter Your name: ");  
         name = in.nextLine();  
         System.out.println("Thank you, your name is: " + name +" ...");             
         System.out.print("Please continue..");     
         System.out.println ("Enter month of Birth: ");
         int monthNumber;

         monthNumber = in.nextInt();

         if (monthNumber == 1)

               System.out.println("January");

         else if (monthNumber == 2)

               System.out.println("February");

         else if (monthNumber == 3)

               System.out.println("March");

         else if (monthNumber == 4)

               System.out.println("April");

         else if (monthNumber == 5)

               System.out.println("May");

         else if (monthNumber == 6)

               System.out.println("June");

         else if (monthNumber == 7)

               System.out.println("July");

         else if (monthNumber == 8)

               System.out.println("August");

         else if (monthNumber == 9)

               System.out.println("September");

         else if (monthNumber == 10)

               System.out.println("October");

         else if (monthNumber == 11)

               System.out.println("November");

         else if (monthNumber == 12)

               System.out.println("December");

         else

               System.out.println("Invalid month.");
         
         
         System.out.println ("Enter day of Birth: ");
         dayofbirth = in.nextInt();
         System.out.println("dayofbirth is: " + dayofbirth); 
         
         LocalDate currentDate = LocalDate.now();
         System.out.println("Todays Date: " + currentDate);
         
         int date = currentDate.getDayOfMonth();
         Month month = currentDate.getMonth();

         if(date == dayofbirth && month == month)
         {
           System.out.println("HAPPY BIRTHDAY TO YOU !! AND GOD BLESS YOU ... XOXO");
         }
         else {
           System.out.println("I am sorry today is not your birthday, Thank You.");
         }
      
       

	}

}
