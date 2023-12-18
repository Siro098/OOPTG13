package C1KünstlicheIntiligenz.Kmeans;

public class DataObject {
  int x;
  int y;
  String label;
  
 public DataObject(int x, int y, String label){
    this.x = x;
    this.y = y;
    this.label = label;
} 

public void setY(int y){
    y = this.y;
}

public void setX(int x){
    x = this.x;
}

public int getY(int y){
   return y;
}

public int getX(int x){
   return x;
}

}
