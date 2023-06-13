//Programmer: Makealah Miller
//Class: CS &145
//Date: 05/10/2023
//Assignment: Assignment 2 manager class 
//Purpose: Allows the user to create, edit, and view a phone book style directory. 

import java.util.*;

public class PhonebookManager //start of manager class
{
   NodeObject front = null;
   String name;
   Scanner input = new Scanner(System.in);
   
   public void addContact(String[] contact) //start of addContact method
   {
      NodeObject newNode = new NodeObject(contact); 
      if(this.front == null) //start of if/else
      {
         this.front = newNode; 
      }
      else
      {
         NodeObject lastNode = traverseToEnd(); //gives me the last node in the linked list 
         lastNode.next = newNode; 
      } //end of if/else
   } //end of addContact method
   
   public NodeObject traverseToEnd() //start of traverseToEnd
   {
      NodeObject currentNode = this.front; 
      while(currentNode.next !=null)
      {
         currentNode = currentNode.next; 
      }
      return currentNode; 
   } //end of traverseToEnd
   
   public void printLinkedList() //start of printLinkedList
   {
      NodeObject currentNode = this.front; 
      System.out.println(currentNode); 
      while(currentNode.next !=null)
      {
         currentNode = currentNode.next; 
         System.out.println(currentNode); 
      }

   } //end of printLinkedList
   
   public void deleteContact(String name, String address, String pNumber) //start of deleteContact
   {
      int index=findContact(name, address, pNumber);
      if(index == 32580754) //start of if/else, this statement determines contact doesn't exist
      {
         System.out.println("Invalid entry, please check your spelling and try again.");
      }
      else if(index == 0) //if deleting the first contact
      {
         front = front.next;
      }
      else //if deleting any other contact in the list
      {
         NodeObject current = front;
         for(int i = 0; i < index - 1; i++)
         {
            current = current.next;
         }
      current.next = current.next.next;
      } //end of if/else
   }
   
   public int findContact(String name, String address, String pNumber) //start of findContact
   //a method to locate the index of a contact node by name
   {
      int index = 0;
      NodeObject current = front;
      while(current != null) //start of while loop
      {
         if(current.getName().equalsIgnoreCase(name) || current.getAddress().equalsIgnoreCase(address) 
         || current.getpNumber().equalsIgnoreCase(pNumber)) //start of if/else
         //this is used to indicate that the string being searched for matches what is being 
         //examined in the linked list
         {
            return index;
         }
         else
         {
            current = current.next;
         } //end of if/else
         index++;
      } //end of while loop
      
      if(current == null)
      {
         index = 32580754; //to indicate the contact does not exist
      }
      return index;
   } //end of findContact
   
   public void findByInput(String name, String address, String pNumber)//start findByInput
    //searches for a contact by name and prints full contact to string
   {
      int index = findContact(name, address, pNumber);
      NodeObject current = front;
      
      if(index == 32580754) //start of if/else
      {
         System.out.println("Invalid entry, please check your spelling and try again.");
      }
      else
      {
         for(int i = 0; i < index; i++) //start of for loop
         {
            current = current.next;
         }//end of for loop
         System.out.println(current.toString());
      } //end of if/else  
   } //end of findByInput
   
   public void editContact(String name, String address, String pNumber) //start of editContact
   {
      int index = findContact(name, address, pNumber);
      NodeObject current = front;
      String update;
      
      if(index == 32580754) //start of if/else
      {
         System.out.println("Invalid entry, please check your spelling and try again.");
      }
      else
      {
         for(int i = 0; i < index; i++) //start of for loop
         {
            current = current.next;
         } //end of for loop
         System.out.println("What would you like the updated version to be?");
         update = input.nextLine();
         
         if(!name.equals(null)) //start of if/else, changing info based on input
         {
            current.changeName(update);
         }
         else if(!pNumber.equals(null))
         {
            current.changeNumber(update);
         }
         else if(!address.equals(null))
         {
            current.changeAddress(update);
         }//end of if/else
      } //end of for loop  
   }//end of editContact
   
} //end of PhonebookManager class