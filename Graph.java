import java.util.HashSet;
import java.util.Set;
public class Graph {
    private Set<Node> nodes;
    private Set<Edge> edges;

    public Graph(Set<Node> nodes ,Set<Edge> edges){
        this.nodes = new HashSet<Node>();
        this.edges = new HashSet<Edge>();

        for(Node n: nodes) this.nodes.add(n);
        for(Edge e: edges) this.edges.add(e);
    }
    public String toString(){
        String ret = "The graph: \n";
        for(Node n:nodes) {
            ret += n.toString() + " ";
        }
        ret += "\n The edges: \n";

        for(Edge e:edges) ret += e.toString() + "\n";
        return ret;
    }

}
