//Programmer: Makealah Miller
//Class: CS &145
//Date: 04/30/2023
//Assignment: Assignment 2
//Purpose: Allows the user to create, edit, and view a phone book style directory. 


import java.util.*;

public class TestClass //start of TestClass
{
   public static void main(String[] args) //start of main method
   {
      Scanner input = new Scanner(System.in);
      Scanner scan = new Scanner(System.in);
      String menuInput;
      String name = "";
      String address = "";
      String pNumber = "";
      
      PhonebookManager pBook = new PhonebookManager();
       
      System.out.println("Hello! Welcome to your new phonebook!");
       
       do //start of do/while for menu
       {
         System.out.println("Please type a command.");
         System.out.println("1 - Add a Contact");
         System.out.println("2 - Delete a Contact");
         System.out.println("3 - View Contacts");
         System.out.println("4 - Name Search");
         System.out.println("5 - Address Search");
         System.out.println("6 - Phone Number Search");
         System.out.println("7 - Edit Name");
         System.out.println("8 - Edit Address");
         System.out.println("9 - Edit Phone Number");
         System.out.println("0 - Quit");
         menuInput = input.next();
         
         if(menuInput.equals("1")) //start of if/else to add contact
         {
            System.out.println("What is the name of your Contact?");
            name = scan.nextLine(); //takes input from user
            
            System.out.println("What is the address of your Contact?");
            address = scan.nextLine(); //takes input from user
            
            System.out.println("What is the telephone number of your Contact?");
            pNumber = scan.nextLine(); //takes input from user
            
            String[] contact = {name, address, pNumber};
            pBook.addContact(contact);
            
         } //end of if/else

         else if(!name.equals("")) //start of if/else, will only allow access if a contact exists
         {
            
             if(menuInput.equals("2")) //start of if/else to delete contact
            { 
               System.out.println("What is the name of the contact you'd like to delete?");
               name = scan.nextLine(); //takes input from user
               pBook.deleteContact(name, null, null); 
            } //end of if/else
            
            else if (menuInput.equals("3")) //start of if/else to print contacts
            {
               pBook.printLinkedList();
            } //end of if/else
            
            else if (menuInput.equals("4")) //start of if/else to search for contact by name
            {
               System.out.println("What is the name of the contact you'd like to search for?");
               name = scan.nextLine(); //takes input from user  
               pBook.findByInput(name, null, null);
            } //end of if/else
             
            else if (menuInput.equals("5")) //start of if/else to search for contact by address
            {
               System.out.println("What is the address you'd like to search for?");
               address = scan.nextLine(); //takes input from user
               pBook.findByInput(null, address, null);  
            }//end of if/else
            
            else if (menuInput.equals("6")) //start of if/else to search for contact by number
            {
               System.out.println("What is the phone number you'd like to search for?");
               pNumber = scan.nextLine(); //takes input from user  
               pBook.findByInput(null, null, pNumber);           
            } //end of if/else
            
            else if (menuInput.equals("7")) //start of if/else to edit name of contact
            {
               System.out.println("What is the name of the contact you'd like to edit?");
               name = scan.nextLine(); //takes input from user 
               pBook.editContact(name, null, null); 
            } //end of if/else
            
            else if (menuInput.equals("8")) //start of if/else to edit address of contact
            {
               System.out.println("What is the address you'd like to edit?");
               address = scan.nextLine(); //takes input from user  
               pBook.editContact(null, address, null);
            }//end of if/else
            
            else if (menuInput.equals("9")) //start of if/else to edit number of contact
            {
               System.out.println("What is the phone number you'd like to edit?");
               pNumber = scan.nextLine(); //takes input from user  
               pBook.editContact(null, null, pNumber);
            } //end of if/else
         } //end of if/else for only existing contacts
         
         else if(!menuInput.equals("0"))
         {
            System.out.println("Please enter a valid response.");
         }
       } //end of do/while loop
       
       while (!menuInput.equals("0")); 
       System.out.println("Thanks for using this phone book!");           
   } //end of main method
} //end of TestClass