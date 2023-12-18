package C1KünstlicheIntiligenz.Kmeans;

import java.util.ArrayList;

public class Kmeans {

    static ArrayList<DataObject> DataObject = new ArrayList<>();
   public static void main(String[] args) {
    
//Daten hinzufügen
AddDataObject();


   } 
public static void AddDataObject(){

DataObject.add(new DataObject(10, 15, null));
DataObject.add(new DataObject(4, 16, null));
DataObject.add(new DataObject(15, 15, null)); 
DataObject.add(new DataObject(13, 4, null));
DataObject.add(new DataObject(1, 19, null));
DataObject.add(new DataObject(12, 3, null));
DataObject.add(new DataObject(16, 12, null));
DataObject.add(new DataObject(11, 6, null));
}

}//END CLASS

