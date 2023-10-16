package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;


public class Driver {

public static void main(String[] args) throws IntegerSetException {

ArrayList<Integer> list1= new ArrayList<>();
ArrayList<Integer> list2= new ArrayList<>();


IntegerSet set1= new IntegerSet(list1);
IntegerSet set2= new IntegerSet(list2);

System.out.println("Before Adding Elements");
System.out.println("Set 1 : "+set1.getlist());
System.out.println("Number of elements in set : "+set1.length());

System.out.println("\nBefore Adding Elements");
System.out.println("Set 2 : "+set2.getlist());
System.out.println("Number of elements in set : "+set2.length());

System.out.println("\nAdding elements...\n");


set1.addItem(1);
set1.addItem(2);
set1.addItem(3);
set1.addItem(4);
set1.addItem(5);

set2.addItem(1);
set2.addItem(2);
set2.addItem(3);
set2.addItem(4);
set2.addItem(5);
set2.addItem(6);
set2.addItem(7);
set2.addItem(9);

System.out.println("After Adding Elements\n");
System.out.println("Set 1 : "+set1.getlist());
System.out.println("Number of elements in set : "+set1.length());
System.out.println("Largest element: "+set1.largest());
System.out.println("Smallest element: "+set1.smallest()+"\n");

System.out.println("Set 2 : "+set2.getlist());
System.out.println("Number of elements in set : "+set1.length());
System.out.println("Largest element: "+set2.largest());
System.out.println("Smallest element: "+set2.smallest()+"\n");


System.out.println("Is equal : "+set1.equals(set2)+"\n");




IntegerSet setu= set1.union(set2);

System.out.println("Union : "+setu.getlist() );

IntegerSet seti= set1.intersection(set2);

System.out.println("Intersection : "+seti.getlist());

IntegerSet setdiff= set2.difference(set1);
System.out.println("Set Difference: "+setdiff.getlist()+"\n");

System.out.println("Check for value in set:");

System.out.println("Clearing both sets...");
set1.clear();
set2.clear();
System.out.println("Set 1 : "+set1.getlist());
System.out.println("Set 1 : "+set2.getlist());
System.out.println("Is equal : "+set1.equals(set2)+"\n");
}

}


