package B1Listen;
public class Arraynamen{
//------------------------------------------------------------------------
public static void main(String[] args) {
//Array erstellen---------------------------------------------------------
String [] namen = new String[3];
//Array befüllen----------------------------------------------------------
namen[0] ="Max";
namen[1] ="Florian";
namen[2] ="Simon";
//Array Inhalte entfernen-------------------------------------------------
namen[0] = null;//kein "" da sont ein leerer String die Stelle belegt
//Array ausgeben----------------------------------------------------------
for (int i = 0; i < namen.length; i++) {
    System.out.println(namen[i]);
  }
 }
}