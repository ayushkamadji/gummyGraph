/**
 * Created by Ayushka on 20/03/2016.
 */
public class CLDisplay extends Display {
    public void print(Node n){
        print(n,"");
    }

    public void print(Node n, String t){
        System.out.println(t + n.getText());
        if(n.getChildren() != null){
            for(Node node : n.getChildren()){
                print(node, t + "\t");
            }
        }
    }
}
