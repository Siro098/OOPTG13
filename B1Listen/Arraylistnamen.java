package B1Listen;

import java.util.ArrayList;
import java.util.List;

public class Arraylistnamen{


public static void main(String[] args){
//Liste erstellen---------------------------------------------
ArrayList<String> namen = new ArrayList<>();
//Objekte hinzufügen------------------------------------------
namen.add("Florian");
namen.add("Max");
namen.add("Simon");
;
//Liste Ausgeben----------------------------------------------
System.out.println(namen);

//Objekte entfernen--------------------------------------------
namen.remove(2);
//Über Liste iterieren-----------------------------------------
for (int i = 0; i < namen.size(); i++) {
    System.out.println(namen.get(i));
//Überprüfen ob Werte in Liste sind-----------------------------
System.out.println(namen.contains("max"));
  }
 }
}