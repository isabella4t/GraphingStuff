import java.util.HashSet;

public class Main {
    static int pass = 0;
    static int fail = 0;
    public static void main(String[] args){
       testnum();
       testnames();
       testcities();
       System.out.println("pass: " + pass + " fail: " + fail);
    }

    public static void testnum(){
        Node fir = new Node(123);
        Node sec = new Node(234);

        //takes start and end node
        Edge egg = new Edge(fir,sec);

        //stores all the nodes and all the edges
        HashSet<Node> thenodes = new HashSet<Node>();
        HashSet<Edge> theedges = new HashSet<Edge>();

        thenodes.add(fir);
        thenodes.add(sec);
        theedges.add(egg);

        Graph tony = new Graph(thenodes,theedges);

        System.out.println("The matrix");
        System.out.print(tony.adjacencyMatrix());

        System.out.println(tony);

        pass++;
    }
    public static void testnames(){
        HashSet<Node> names = new HashSet<Node>();
        HashSet<Edge> network = new HashSet<Edge>();

        names.add(new Vnodes("Jacob"));
        names.add(new Vnodes("Laila"));
        names.add(new Vnodes("Quail"));
        names.add(new Vnodes("Zoe"));
        names.add(new Vnodes("Joe"));

        for(Node n: names){
            for(Node o: names){
                if(randomedge()){
                    network.add(new Edge(n,o));
                }
            }
        }

        Graph bob = new Graph(names,network);
        System.out.println("The matrix");
        System.out.print(bob.adjacencyMatrix());

        System.out.println(bob);

        pass++;
    }
    public static void testcities(){
        HashSet<Node> cities = new HashSet<Node>();
        HashSet<Edge> roads = new HashSet<Edge>();

        City TK =  new City("Tokyo",43);
        City NY = new City("New York",66);
        City DA = new City("Dallas",16);
        City KL = new City("Kuala Lumpur",346);

        cities.add(new Vnodes(TK));
        cities.add(new Vnodes(NY));
        cities.add(new Vnodes(DA));
        cities.add(new Vnodes(KL));

        for(Node n: cities){
            for(Node o: cities){
                if(randomedge()){
                    roads.add(new Edge(n,o));
                }
            }
        }

        Graph eli = new Graph(cities,roads);

        System.out.println(eli);

        pass++;
    }

    //determines randomly if an edge gets made
    public static boolean randomedge(){
        return Math.random() > 0.5;
    }
}
