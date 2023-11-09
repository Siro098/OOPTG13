package B2Bäume;

public class Tree {

    Node root;

    public Tree() {
        root = null;
    }

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            insert(root, value);

        }
    }

    private void insert(Node parent, int value) {

        if (parent.Wert >= value) {
            if (parent.links == null) {

                parent.links = new Node(value);
            } else {
                insert(parent.links, value);
            }
        }
        // ----------------------------------------------------
        if (parent.Wert < value) {
            if (parent.rechts == null) {

                parent.rechts = new Node(value);
            } else {
                insert(parent.rechts, value);
            }
        }

    }

public int hoehe(){

int l = 0;
int r = 0;

if(root.links != null){
r = hoehe(root.links) + 1;

}
if(root.rechts != null){
r = hoehe(root.rechts) + 1;
}
return Math.max(l, r);
}
//--------------------------------------------------
public int hoehe(Node parent){

int l = 0;
int r = 0;

if(parent.links != null){
r = hoehe(parent.links) + 1;

}
if(parent.rechts != null){
r = hoehe(parent.rechts) + 1;

}
return Math.max(l, r);

}


    public int anzahl() {

        if (root == null) {
            return 0;
        } else {

            return 1 + anzahl(root.links) + anzahl(root.rechts);

        }
    }
    public int anzahl(Node parent) {

        if (root == null) {
            return 0;
        } else {

            return 1 + anzahl(parent.links) + anzahl(parent.rechts);

        }
    }
}
