import javax.swing.*;
import java.awt.*;

/**
 * Created by tonkytohap on 20/03/2016.
 */
public class SJSDisplay extends JFrame implements Display {
    private String strGraph;

    public SJSDisplay(){
        setLayout(new FlowLayout());
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(600,300);
    }

    public void print(Node n){
        print(n,"");
    }

    private void print(Node n, String t){
        generateStringGraph(n,t);
        this.add(new JTextArea(strGraph, 10,50));
        this.setVisible(true);
    }

    public void generateStringGraph(Node n, String t){
        //Add the node text + formatting characters to the graph string
        if (strGraph!=null)
            strGraph = strGraph + t + n.getText() + "\n";
        else
            strGraph = t + n.getText() + "\n";

        //Recursive add the child nodes
        if(n.getChildren() != null){
            for(Node node : n.getChildren()){
                generateStringGraph(node, t + "\t");
            }
        }
    }

}
