# Set Interface
Das Set-Interface in java repräsentiert eine Sammlung von eindeutigen elementen, ohne die Reihenfolge zu garantieren. ein Set erlaubt keine Duplikate und bietet grundlegende Methoden wie add, remove und contains für die elementverwaltung. Implementierungen des Set-Interfaces sind beispielsweiße HashSet, LinkedHashSet und TreeSet HashSet verwendet eine Hashtabelle für die Speicherung, LinkedHashSet behält die Einfügerreihenfolgebei und TreeSet ordnet die Elemente aufsteigend an.

Operations on the Set Interface

The set interface allows the users to perform the basic mathematical operation on the set. Let’s take two arrays to understand these basic operations. Let set1 = [1, 3, 2, 4, 8, 9, 0] and set2 = [1, 3, 7, 5, 4, 0, 7, 5]. Then the possible operations on the sets are:

```java
set1 = [1, 3, 2, 4, 8, 9, 0]
set2 = [1, 3, 7, 5, 4, 0, 7, 5]
```


1. Intersection: Diese Operation gibt alle gemeinsamen Elemente aus den beiden gegebenen Arrays zurück. Für die beiden oben genannten Tabellen wäre die Schnittpunkte:

```java
Intersection = [0, 1, 3, 4]

//Implementierung
// To find intersection 
        Set<Integer> intersection = new HashSet<Integer>(a); 
        intersection.retainAll(b); 
        System.out.print("Intersection of the two Set"); 
        System.out.println(intersection); 
```

2. Union: Diese Operation fügt alle Elemente in einem Array mit dem anderen hinzu. Für die beiden oben genannten Mengen wäre die Vereinigung:

```java
Union = [0, 1, 2, 3, 4, 5, 7, 8, 9] 

//Implementierung
// To find union 
        Set<Integer> union = new HashSet<Integer>(a); 
        union.addAll(b); 
        System.out.print("Union of the two Set"); 
        System.out.println(union); 
```

3. Difference: TDieser Vorgang entfernt alle in einem Satz vorhandenen Werte aus der anderen Tabelle. Für die beiden oben genannten Tabellen wäre der Unterschied: 

```java
Difference = [2, 8, 9]

//Implementierung
 // To find the symmetric difference 
        Set<Integer> difference = new HashSet<Integer>(a); 
        difference.removeAll(b); 
        System.out.print("Difference of the two Set"); 
        System.out.println(difference); 
```
```java
Union of the two Set[0, 1, 2, 3, 4, 5, 7, 8, 9]
Intersection of the two Set[0, 1, 3, 4]
Difference of the two Set[2, 8, 9]
```
# Operationen

## Objekte hinzufügen

```java
// Java Program Demonstrating Working of Set by 
// Adding elements using add() method  
  
// Importing all utility classes 
import java.util.*; 
  
// Main class 
class GFG { 
  
    // Main driver method 
    public static void main(String[] args) 
    { 
        // Creating an object of Set and  
        // declaring object of type String 
        Set<String> hs = new HashSet<String>(); 
  
        // Adding elements to above object 
        // using add() method 
        hs.add("B"); 
        hs.add("B"); 
        hs.add("C"); 
        hs.add("A"); 
  
        // Printing the elements inside the Set object 
        System.out.println(hs); 
    }
    OUTPUT = [A, B, C] 
}
```


## Objekte ausgeben

```java
// Java code to demonstrate Working of Set by 
// Accessing the Elements of the Set object 
  
// Importing all utility classes 
import java.util.*; 
  
// Main class 
class GFG { 
  
    // Main driver method 
    public static void main(String[] args) 
    { 
        // Creating an object of Set and  
        // declaring object of type String 
        Set<String> hs = new HashSet<String>(); 
  
        // Elements are added using add() method 
        // Later onwards we will show accessing the same 
  
        // Custom input elements 
        hs.add("A"); 
        hs.add("B"); 
        hs.add("C"); 
        hs.add("A"); 
  
        // Print the Set object elements 
        System.out.println("Set is " + hs); 
  
        // Declaring a string 
        String check = "D"; 
  
        // Check if the above string exists in 
        // the SortedSet or not 
        // using contains() method 
        System.out.println("Contains " + check + " "
                           + hs.contains(check)); 
    } 
    OUTPUT = Set is [A, B, C]
                    Contains D false
}
```

## Objekte entfernen

```java
// Java Program Demonstrating Working of Set by 
// Removing Element/s from the Set 
  
// Importing all utility classes 
import java.util.*; 
  
// Main class 
class GFG { 
  
    // Main driver method 
    public static void main(String[] args) 
    { 
        // Declaring object of Set of type String 
        Set<String> hs = new HashSet<String>(); 
  
        // Elements are added 
        // using add() method 
  
        // Custom input elements 
        hs.add("A"); 
        hs.add("B"); 
        hs.add("C"); 
        hs.add("B"); 
        hs.add("D"); 
        hs.add("E"); 
  
        // Printing initial Set elements 
        System.out.println("Initial HashSet " + hs); 
  
        // Removing custom element 
        // using remove() method 
        hs.remove("B"); 
  
        // Printing Set elements after removing an element 
        // and printing updated Set elements 
        System.out.println("After removing element " + hs); 
    } 

    OUTPUT = Initial HashSet [A, B, C, D, E]
             After removing element [A, C, D, E]
}
```

## Iterieren

```java
// Java Program to Demonstrate Working of Set by 
// Iterating through the Elements 

// Importing utility classes 
import java.util.*; 

// Main class 
class GFG { 

	// Main driver method 
	public static void main(String[] args) 
	{ 
		// Creating object of Set and declaring String type 
		Set<String> hs = new HashSet<String>(); 

		// Adding elements to Set 
		// using add() method 

		// Custom input elements 
		hs.add("A"); 
		hs.add("B"); 
		hs.add("C"); 
		hs.add("B"); 
		hs.add("D"); 
		hs.add("E"); 

		// Iterating through the Set 
		// via for-each loop 
		for (String value : hs) 

			// Printing all the values inside the object 
			System.out.print(value + ", "); 
		
		System.out.println(); 
	} 
    OUTPUT = A, B, C, D, E, 
}
```

# Hashset

```java
// Java program Demonstrating Creation of Set object 
// Using the Hashset class 

// Importing utility classes 
import java.util.*; 

// Main class 
class GFG { 

	// Main driver method 
	public static void main(String[] args) 
	{ 
		// Creating object of Set of type String 
		Set<String> h = new HashSet<String>(); 

		// Adding elements into the HashSet 
		// using add() method 

		// Custom input elements 
		h.add("India"); 
		h.add("Australia"); 
		h.add("South Africa"); 

		// Adding the duplicate element 
		h.add("India"); 

		// Displaying the HashSet 
		System.out.println(h); 

		// Removing items from HashSet 
		// using remove() method 
		h.remove("Australia"); 
		System.out.println("Set after removing "
						+ "Australia:" + h); 

		// Iterating over hash set items 
		System.out.println("Iterating over set:"); 

		// Iterating through iterators 
		Iterator<String> i = h.iterator(); 

		// It holds true till there is a single element 
		// remaining in the object 
		while (i.hasNext()) 

			System.out.println(i.next()); 
	} 

    OUTPUT = [South Africa, Australia, India]
              Set after removing Australia:[South Africa, India]
              Iterating over set:
              South Africa
              India
}
```

# EnumSet

```java
// Java program to demonstrate the 
// creation of the set object 
// using the EnumSet class 
import java.util.*; 

enum Gfg { CODE, LEARN, CONTRIBUTE, QUIZ, MCQ } 
; 

public class GFG { 

	public static void main(String[] args) 
	{ 
		// Creating a set 
		Set<Gfg> set1; 

		// Adding the elements 
		set1 = EnumSet.of(Gfg.QUIZ, Gfg.CONTRIBUTE, 
						Gfg.LEARN, Gfg.CODE); 

		System.out.println("Set 1: " + set1); 
	} 

    OUTPUT = Set 1: [CODE, LEARN, CONTRIBUTE, QUIZ]
}

```

# LinkedHashSet

```java
// Java program to demonstrate the 
// creation of Set object using 
// the LinkedHashset class 
import java.util.*; 

class GFG { 

	public static void main(String[] args) 
	{ 
		Set<String> lh = new LinkedHashSet<String>(); 

		// Adding elements into the LinkedHashSet 
		// using add() 
		lh.add("India"); 
		lh.add("Australia"); 
		lh.add("South Africa"); 

		// Adding the duplicate 
		// element 
		lh.add("India"); 

		// Displaying the LinkedHashSet 
		System.out.println(lh); 

		// Removing items from LinkedHashSet 
		// using remove() 
		lh.remove("Australia"); 
		System.out.println("Set after removing "
						+ "Australia:" + lh); 

		// Iterating over linked hash set items 
		System.out.println("Iterating over set:"); 
		Iterator<String> i = lh.iterator(); 
		while (i.hasNext()) 
			System.out.println(i.next()); 
	} 
    OUTPUT = [India, Australia, South Africa]
             Set after removing Australia:[India, South Africa]
             Iterating over set:
             India
             South Africa
}
```

# TreeSet

```java
// Java Program Demonstrating Creation of Set object 
// Using the TreeSet class 

// Importing utility classes 
import java.util.*; 

// Main class 
class GFG { 

	// Main driver method 
	public static void main(String[] args) 
	{ 
		// Creating a Set object and declaring it of String 
		// type 
		// with reference to TreeSet 
		Set<String> ts = new TreeSet<String>(); 

		// Adding elements into the TreeSet 
		// using add() 
		ts.add("India"); 
		ts.add("Australia"); 
		ts.add("South Africa"); 

		// Adding the duplicate 
		// element 
		ts.add("India"); 

		// Displaying the TreeSet 
		System.out.println(ts); 

		// Removing items from TreeSet 
		// using remove() 
		ts.remove("Australia"); 
		System.out.println("Set after removing "
						+ "Australia:" + ts); 

		// Iterating over Tree set items 
		System.out.println("Iterating over set:"); 
		Iterator<String> i = ts.iterator(); 

		while (i.hasNext()) 
			System.out.println(i.next()); 
	} 

    OUTPUT = [Australia, India, South Africa]
              Set after removing Australia:[India, South Africa]
              Iterating over set:
              India
              South Africa
}
```
