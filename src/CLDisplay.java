/**
 * Created by tonkytohap
 */
public class CLDisplay implements Display {
    public void print(Node n){
        print(n,"");
    }

    private void print(Node n, String t){
        System.out.println(t + n.getText());
        if(n.getChildren() != null){
            for(Node node : n.getChildren()){
                print(node, t + "\t");
            }
        }
    }
}
