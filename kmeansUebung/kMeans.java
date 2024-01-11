package kmeansUebung;

import java.util.ArrayList;
import java.util.List;

public class kMeans {
    static int[] data = { 9, 4, 13, 13, 10, 2, 10, 5, 4, 7, 8, 12, 16, 4, 8, 4, 10, 13, 8, 5 };
    static List<Cluster> cluster = new ArrayList<>();

    static boolean isReady = false;

    public static void main(String[] args) {
        initClusters();

        do {
            addDataToCluster();
            System.out.println(cluster);

            calculateNewMeans();
            clearClusters();
        } while (!isReady);
        {
            System.out.println(cluster);

        }
    }
    // ------------------------------------------------------------------------------------------------------------------------------------------

    private static void clearClusters() {
    }

    private static void calculateNewMeans() {
    }

    private static void addDataToCluster() {
        for (int i = 0; i <= data.length; i++) {
            double DistancenextCluster = 100;
            Cluster nextCluster;
            double calc;
            for (int j = 0; j <= 2; j++) {
                calc = calculateDistance(data[i], cluster.get(j).getMeans());

                if (calc < DistancenextCluster) {
                    nextCluster = cluster.get(j);
                    DistancenextCluster = calc;
                }//END IF

            }

            nextCluster.addData(data[i]);
        
        }

    }

    // -----------------------------------------------------------------------------------------------
    public static double calculateDistance(int data, int means) {

        return Math.abs(data - means);

    }

    // -------------------------------------------------------------------------------------------
    private static void initClusters() {

        Cluster A = new Cluster("A", 5);
        Cluster B = new Cluster("B", 10);
        Cluster C = new Cluster("C", 15);

        cluster.add(A);
        cluster.add(B);
        cluster.add(C);
    }
}
