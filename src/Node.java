import java.util.ArrayList;

/**
 * Created by Ayushka on 20/03/2016.
 */
public class Node {
    private String text;
    private Node parent;
    private ArrayList<Node> children = new ArrayList<Node>();

    public Node(){
        setText("New Node");
    }

    public Node(String t){
        setText(t);
    }

    public Node getParent(){
        return parent;
    }

    public ArrayList<Node> getChildren(){
        return children;
    }

    public Node getChild(int i){
        return children.get(i);
    }

    public String getText(){
        return text;
    }

    public void setParent(Node n){
        parent = n;
    }

    public void addChild(Node n){
        n.setParent(this);
        children.add(n);
    }

    public void setText(String t){
        text = t;
    }
}
