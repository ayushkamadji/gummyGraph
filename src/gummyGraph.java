/**
 * Created by tonkytohap
 */
public class gummyGraph {

    public static void main(String[] args){
        //Sample Graph Start
        Node node1 = new Node("Hello node!");
        Node subnode1 = new Node("Subnode 1");
        Node subnode11 = new Node("Subnode 1.1");
        Node subnode2 = new Node("Subnode 2");
        Node subnode21 = new Node("Subnode 2.1");
        Graph graph = new Graph(node1);

        node1.addChild(subnode1);
        node1.addChild(subnode2);
        subnode2.addChild(subnode21);
        subnode1.addChild(subnode11);
        //Sample Graph End

        Controller controller = new Controller(new SJSDisplay());

        controller.displayGraph(graph);

    }

}
