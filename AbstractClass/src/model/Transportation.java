package model;

public class Transportation {
    int cost;
    String transport;

    public int getCost() {return cost;}
    public void setCost(int cost) {this.cost = cost;}
    public String getName() {return transport;}
    public void setName(String transport) {this.transport = transport;}

    public Transportation(int cost, String transport){
        this.cost = cost;
        this.transport = transport;
    }
}
