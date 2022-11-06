import com.sun.xml.internal.fastinfoset.util.StringArray;
import java.util.*;

import java.util.HashSet;
import java.util.Set;
public class Graph {
    private Set<Node> nodes;
    private Set<Edge> edges;

    // Sets of nodes and edges
    public Graph(Set<Node> nodes ,Set<Edge> edges){
        this.nodes = new HashSet<Node>();
        this.edges = new HashSet<Edge>();

        for(Node n: nodes) this.nodes.add(n);
        for(Edge e: edges) this.edges.add(e);
    }
    // Displays the edges in a table along the indexes where its nodes are
    public String adjacencyMatrix(){
        List<Node> NodeList = new ArrayList(nodes);

        int[][] matrix = new int[nodes.size()][nodes.size()];

        for(int start = 0; start < nodes.size();start++){
            for(int end = 0; end <nodes.size();end++){
                boolean filled = false;
                for(Edge e: edges){
                    System.out.println(NodeList.get(start) + " " + e.getStart());
                    if((NodeList.get(start)==e.getStart())&&NodeList.get(end)==e.getEnd()) matrix[start][end] =1;
                    filled = true;
                }
                if(!filled) matrix[start][end] = 0;

            }
        }
        String ret = "";
        for(int i = 0; i < nodes.size();i++) {
            for (int k = 0; k < nodes.size(); k++) {
                ret += matrix[i][k] + " ";
            }
            ret += "\n";
        }
        return ret;
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
