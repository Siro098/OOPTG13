package B1Listen;


import java.util.LinkedList;

import java.util.Scanner;

public class LinkedListnamen {
    public static void main(String[]args){

        System.out.flush();;
        //Liste erstellen

LinkedList<String> Einkaufsliste = new LinkedList();

Einkaufsliste.add("Äpfel");
Einkaufsliste.add("Paulaner Spezi");
Einkaufsliste.add("Birnen");

Scanner sc = new Scanner(System.in);

System.out.println("Wollen sie weitere Artikel hinzufügen?(y/n)");
String hinzufügen = sc.next();

while(true){

if(hinzufügen.equals("y")){
    System.out.println("Was wollen sie hinzufügen?"); 
    String Artikel = sc.next();
    Einkaufsliste.add(Artikel);

    System.out.println("noch etwas?"); 
    hinzufügen = sc.next();
}else{
    System.out.println("Wollen sie noch Artikel entfernen?(y/n)");
    String entfernen = sc.next();
if(entfernen.equals("y")){
    System.out.println("Was wollen sie entfernen?"); 
    String Artikel = sc.next();
    Einkaufsliste.remove(Artikel);

    System.out.println("noch etwas?"); 
    entfernen = sc.next();


}else{
System.out.println(Einkaufsliste);
sc.close();
    
    }
   }
  }
 }
}
