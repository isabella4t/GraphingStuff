public class City {

    //makes city object
    private String name;
    private int population;

    public City(String name, int pop){
        this.name = name;
        population = pop;
    }

    public String toString(){
        return name + " " + population;
    }
}
