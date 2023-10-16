package org.howard.lsp.assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class IntegerSet{
	// Hint: probably best to use an array list. 

private ArrayList<Integer> list= new ArrayList<>();

//Constructor if you want to pass in already initialized
public IntegerSet(ArrayList<Integer> list) {
this.list=list;
}

//Clears the internal representation of the set
public void clear() {
list.clear();
}

//Returns the length of the set
public int length() {
return list.size();
}

/*
 * Returns true if the 2 sets are equal, false otherwise;
* Two sets are equal if they contain all of the same values in ANY order.  This overrides
* the equal method from the Object class.
*/

public boolean equals(IntegerSet b) {

ArrayList<Integer> list2=b.list;

if(list.size()!=list2.size()) {
return false;
}

ArrayList<Integer> temp1=list;

ArrayList<Integer> temp2=list2;

Collections.sort(temp1);
Collections.sort(temp2);

for(int i=0;i<temp1.size();i++) {
if(temp1.get(i)!=temp2.get(i)) {
return false;
}
}

return true;

}


//Returns the largest item in the set; Throws a IntegerSetException if the set is empty 

public int largest() throws IntegerSetException {

if(list.size()==0) {
IntegerSetException e= new IntegerSetException();
throw e;
}

int max=0;

for(int i=0;i<list.size();i++) {
if(list.get(i)>max) {
max=list.get(i);
}
}

return max;

}

//Returns the smallest item in the set; Throws a IntegerSetException if the set is empty

public int smallest() throws IntegerSetException {

if(list.size()==0) {
IntegerSetException e= new IntegerSetException();
throw e;
}

int min=Integer.MAX_VALUE;

for(int i=0;i<list.size();i++) {
if(list.get(i)<min) {
min=list.get(i);
}
}

return min;

}

// add item if already not exist in list

public void addItem(int item ) {

boolean exist=false;

for(int i=0;i<list.size();i++) {

if(list.get(i)==item) {
exist=true;
}
}

if(exist==false) {
list.add(item);
}

}

// remove item if already not exist in list

public void removeItem(int item ) {



for(int i=0;i<list.size();i++) {

if(list.get(i)==item) {
list.remove(i);
}
}

}

// return union of of 2 sets
public IntegerSet union(IntegerSet list2) {

ArrayList<Integer> temp=list2.getlist();

Set<Integer> set = new HashSet<>();
set.addAll(list);
set.addAll(temp);

ArrayList<Integer> list3= new ArrayList<>(set);

IntegerSet list4= new IntegerSet(list3);

return list4;

}

// return intersection of of 2 sets
public IntegerSet intersection(IntegerSet list2) {

ArrayList<Integer> temp=list2.getlist();

list.retainAll(temp);

IntegerSet list4= new IntegerSet(list);

return list4;
}

// returns difference of 2 sets
public IntegerSet difference (IntegerSet list2) {

ArrayList<Integer> temp=list2.getlist();

// Remove all elements in list2 from list
list.removeAll(temp);

IntegerSet list4= new IntegerSet(list);

return list4;

}

public ArrayList<Integer> getlist(){
return list;
}


}

