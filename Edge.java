public class Edge {
    private Node start;
    private Node end;

    public Edge(Node start,Node end){
        this.start=start;
        this.end=end;
    }

    public String toString(){
        return start.toString() + " -> " + end.toString();
    }
}
