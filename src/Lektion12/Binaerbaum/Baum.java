package Lektion12.Binaerbaum;

public class Baum {
    private Knoten root;

    public Baum() {
        root = null;
    }

    public void insert(Knoten k) {
        if (root == null) root = k;
        else insert(root, k);
    }

    private void insert(Knoten temp, Knoten k) {
        if (k.getWort().compareTo(temp.getWort()) < 0) {
            if (temp.left == null) temp.left = k;
            else insert(temp.left, k);
        } else {
            if (temp.right == null) temp.right = k;
            else insert(temp.right, k);
        }
    }

    public void print() {
        baumAusgeben(root);
    }

    private void baumAusgeben(Knoten temp) {
        if (temp == null) {
            System.out.println("Das Woerterbuch ist leer!");
            return;
        }

        if (temp.left != null) baumAusgeben(temp.left);
        System.out.println(temp.getWort() + ": " + temp.getBedeutung());
        if (temp.right != null) baumAusgeben(temp.right);
    }

    public void search(String w) {
        searchRec(root, w);
    }

    private void searchRec(Knoten temp, String w) {
        if (temp == null) {
            System.out.println("Wort nicht gefunden!");
            System.out.println();
            return;
        }

        int compare = w.compareTo(temp.getWort());

        if (compare == 0) {
            System.out.println(temp.getBedeutung());
        } else if (compare < 0) {
            searchRec(temp.left, w);
        } else {
            searchRec(temp.right, w);
        }
    }

    public void delete(Knoten k) {

    }
}
