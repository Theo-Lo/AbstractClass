import model.Transportation;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Transportation> transport = new ArrayList<>();
        transport.add(new Transportation(400, "Train"));
        transport.add(new Transportation(300, "Bus"));
        transport.add(new Transportation(1000, "Plane"));
        transport.add(new Transportation(500, "Driving"));
        for(int counter=0; counter<transport.size();counter++){
            if(transport.get(counter).getCost()<=500){
                System.out.println(transport.get(counter).getName());
            }
        }

    }
}
