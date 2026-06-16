package myjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
  This program demonstrates how to build a custom immutable class in Java from scratch. The class MyImmutableClass models a
  Fixed Deposit with four fields — name, amount, isActive, and nominee (a list). The primitive fields String, double, and boolean 
  are naturally immutable, so marking them private final and providing no setters is enough to protect them. 
  The List<String> nominee field is mutable, so it needs extra protection — a defensive copy IN (new ArrayList<>(nominee)) 
  is done inside the constructor so the caller's original list and the object's internal list become two separate heap 
  objects; modifying one never affects the other. The one missing piece is a defensive copy OUT in the getter — without 
  Collections.unmodifiableList(), the caller can still reach inside and corrupt the internal list directly. The main method 
  proves immutability by modifying the original list after object creation and confirming the object's nominee stays unchanged. 
  It also shows that reassigning the reference variable to a new object does not modify the old object — it simply creates a 
  fresh heap object and points the variable there, leaving the original frozen in memory untouched.
  Key takeaway — final and private protect the reference. Defensive copy protects the contents. Both together make a class truly immutable.
**/
final public class MyImmutableClass {
    /// this is fd class
    private final String name;
    private final double amount;
    private final boolean isActive;
    private  final List<String> nominee;


    MyImmutableClass(String name, double amount, boolean isActive, List<String> nominee){
        this.name = name;
        this.amount = amount;
        this.isActive = isActive;
        /**
         * this is defensive copy in
         */
        this.nominee = new ArrayList<>(nominee);
    }


    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isActive() {
        return isActive;
    }

    public List<String> getNominee() {

        // this list will not lwt to add the itiem to the list for current except,
        // we will get the UsuportedException
        // this is @defensive copu out

        return Collections.unmodifiableList(nominee);
    }

    public static void main(String[] args) {
        List<String>  list = new ArrayList<>(List.of("maa, paa, daa"));
        MyImmutableClass myImmutableClass = new MyImmutableClass("Shivansh", 500.00, true, list);
        list.add("main hoo");
        System.out.println("Nominee from object " + myImmutableClass.getNominee()); // here no chage happen when we chage th origianl lsit
        System.out.println("Nominee from lsit " + list); /// hereit will print the list modified
        myImmutableClass.getNominee().add("Hacker");
        System.out.println("after hacker modification  from lsit from class" + myImmutableClass.getNominee()); /// hereit will print the list modified
        System.out.println(myImmutableClass);
        myImmutableClass = new MyImmutableClass("Shivansh", 500.00, true, list);
        System.out.println(myImmutableClass);

        //bith is new object this happpen due to imutabliut

    }
}
