package kmeansUebung;

import java.util.ArrayList;
import java.util.List;

public class Cluster {

String name;
int means;
 static List<Integer> data = new ArrayList<>();


 public Cluster(String name, int means) {
    this.name = name;
    this.means = means;
}


public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getMeans() {
    return means;
}
public void setMeans(int means) {
    this.means = means;
}
public static List<Integer> getData() {
    return data;
}
public static void setData(List<Cluster> data) {
    data = data;
}
public void addData(int data2){

    data.add(data2);
}

@Override
public String toString() {
    return "Cluster [name=" + name + ", means=" + means + "]";
}




}
