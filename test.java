//author: Saul Garza
//tester code

import java.util.*;
public class test {
 public static void main(String args[]) {
  Scanner kb = new Scanner(System.in);
  String command;
  System.out.println("Thank you for choosing my program. Would you like to continue? (yes/no)");
  command = kb.next();
  while (command.equalsIgnoreCase("yes")) //starts program as long as you type yes
  {
   System.out.println("How many people do you want to enter?");
   int numPerson = kb.nextInt();
   person[] Person = new person[numPerson];
   System.out.println("Enter " + numPerson + " last names and age");
   for (int i = 0; i < numPerson; i++) //reads in last name and age of x people
   {
    System.out.println("What is the last name of the person?");
    String last = kb.next();
    String temp = (last.substring(0, 1)).toUpperCase(); //Turns first letter of name to upper case b/c of ASCII values
    String tempLast = temp + last.substring(1, last.length());
    System.out.println("What is the age of the person?");
    int age = kb.nextInt();
    Person[i] = new person(tempLast, age);
    //System.out.println(Person[i].getName());
   }
   if (numPerson > 0) //Sorts people
   {
    System.out.println("Here are the people sorted");
    QS.QuickSort(Person, 0, numPerson - 1);
   } else //exception if nothing was entered
   {
    System.out.println("The list is Empty. Nothing to delete.");
    System.exit(0);
   }
   for (int i = 0; i < numPerson; i++) //Displays Sorted list
   {
    System.out.println("Name: " + Person[i].getName() + "    Age: " + Person[i].getAge());
   }
   System.out.println("Would you like to add another name (yes/no)"); //runs again from scratch
   command = kb.next();
  }
  System.out.println("Thanks for trying. Have a nice day fam.");
 }
}
