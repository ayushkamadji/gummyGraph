/**
 * Created by Ayushka on 20/03/2016.
 */
public class Controller {
    private Display display;

    Controller(Display d){
        display = d;
    }

    public void displayGraph(Graph g){
        display.print(g.getRoot());
    }
}
