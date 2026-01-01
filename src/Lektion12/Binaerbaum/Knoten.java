package Lektion12.Binaerbaum;

public class Knoten {
    private final String wort;
    private final String bedeutung;
    Knoten right;
    Knoten left;

    public Knoten(String wort, String bedeutung){
        this.wort = wort;
        this.bedeutung = bedeutung;
        this.left = null;
        this.right = null;
    }
    //Setter
    public void setRight(Knoten right){
        this.right = right;
    }
    public void setLeft(Knoten left){
        this.left = left;
    }

    //Getter
    public Knoten getRight(){
        return right;
    }
    public Knoten getLeft(){
        return left;
    }
    public String getWort(){
        return wort;
    }
    public String getBedeutung(){
        return bedeutung;
    }


}
