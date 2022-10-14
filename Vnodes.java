public class Vnodes extends Node{

    //makes nodes with different types other than int
    private Object val;
    public Vnodes(Object v){
        super(v.hashCode());
        val = v;
    }
    public String toString(){
        return val.toString();
    }
}
