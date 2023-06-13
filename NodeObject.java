//Name: Makealah Miller
//Date: 05/08/2023
//Assignment: Assignment 2, phone book, object class
//Class: CS&145

import java.util.*;

public class NodeObject //start of NodeObject class
{
   private String name;
   private String address;
   private String number;
   
   protected NodeObject next;
   
   public NodeObject(String[] contactInfo) //start of NodeObject
   {
      this.name = contactInfo[0];
      this.address = contactInfo[1];
      this.number = contactInfo[2]; 
      this.next = null;
   } //end of NodeObject
   
   public String toString() //start of toString
   {
      return(this.name + " " + this.address + " " + this.number);
   } //end of toString
   
   public void changeName(String newName) //start of changeName
   {
      this.name = newName; 
   } //end of changeName
   
   public void changeAddress(String newAddress) //start of changeAddress
   {
      this.address = newAddress; 
   } //end of changeAddress
   
   public void changeNumber(String newNumber) //start of changeNumber
   {
      this.number = newNumber; 
   } //end of changeNumber
   
   public String getName() //start of getName
   {
      return name;
   } //end of getName
   
   public String getAddress() //start of getAddress
   {
      return address;
   } //end of getAddress
   
   public String getpNumber() //start of getpNumber
   {
      return number;
   } //end of getpNumber
} //end of NodeObject class
