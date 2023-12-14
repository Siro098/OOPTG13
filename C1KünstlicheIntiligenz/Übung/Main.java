package C1KünstlicheIntiligenz.Übung;

import java.util.ArrayList;

public class Main {
	
    public static int k = 5;

	public static void main(String[] args) {
        
        System.out.flush(); 
        
        ArrayList<DataObject> objs = new ArrayList<DataObject>();
		objs.add(new DataObject(72, 20, 0));
		objs.add(new DataObject(89, 12, 0));
		objs.add(new DataObject(94, 6, 0));
		objs.add(new DataObject(96, 3, 0));
		objs.add(new DataObject(97, 2, 0));

		objs.add(new DataObject(77, 7, 1));
		objs.add(new DataObject(84, 10, 1));
		objs.add(new DataObject(85, 14, 1));
		objs.add(new DataObject(87, 9, 1));
        objs.add(new DataObject(91, 2, 1));
		objs.add(new DataObject(92, 10, 1));
		objs.add(new DataObject(93, 17, 1));
		
        objs.add(new DataObject(75, 25, 2));
		objs.add(new DataObject(77, 11, 2));
		objs.add(new DataObject(80, 17, 2));
        objs.add(new DataObject(87, 15, 2));
		
        
        
        DataObject o = new DataObject(100, 0);

		System.out.println(kNN(o, objs));
	}

	public static int kNN(DataObject o, ArrayList<DataObject> objs) {
		int[] indices = new int[k];
		double[] mins = new double[k];
		for (int i = 0; i < k; i++) {
			mins[i] = Double.MAX_VALUE;
		}

		for (int i = 0; i < objs.size(); i++) {
			double dist = distance(o, objs.get(i));
			double max = Double.MIN_VALUE;
			int maxIdx = 0;
			for (int j = 0; j < k; j++) {
				if (max < mins[j]) {
					max = mins[j];
					maxIdx = j;
				}
			}
			if (mins[maxIdx] > dist) {
				mins[maxIdx] = dist;
				indices[maxIdx] = i;
			}
		}

		int a = 0;
		int b = 0;
		for (int i = 0; i < k; i++) {
			if (objs.get(indices[i]).klasse == 0) {
				a++;
			} else {
				b++;
			}
		}
		if (a > b) {
			return 0;
		} else {
			return 1;
		}
	}

	public static double distance(DataObject o, DataObject ref) {
		return (o.x - ref.x) * (o.x - ref.x) + (o.y - ref.y) * (o.y - ref.y);
	}
}