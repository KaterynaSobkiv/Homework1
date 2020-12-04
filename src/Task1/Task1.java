package Task1;

import java.util.*;

public class Task1 {

    public static void main(String args[])
    {
        List<String> cars = new ArrayList<>();

        cars.addAll(Arrays.asList("Ford", "Mazda", "BMW", "Audi", "Honda", "Volvo"));
        System.out.println("Initial ArrayList " + cars);
        List<String> head = cars. subList(0, 3);
        int x = cars.size()/2 + (cars.size()%2) - 1;
        for(int i = 0; i < x; i++){
            head.set(i, cars.get(i));
        }

        System. out. println("Half of the list" + head);
        head.set(1,"BMW");
        System.out.println("Updated ArrayList " + head);
    }
}