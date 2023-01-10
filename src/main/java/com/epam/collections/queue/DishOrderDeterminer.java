package com.epam.collections.queue;

import java.util.*;
import java.util.stream.IntStream;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> eaten = new ArrayList<>();
        ArrayDeque<Integer> dishes = new ArrayDeque<>();
        IntStream.range(1,numberOfDishes + 1).forEach(dishes::offer);

        while(!dishes.isEmpty()){
            for(int dish = 1; dish < everyDishNumberToEat;dish++){
                dishes.add(dishes.poll());
            }
            eaten.add(dishes.poll());
        }
        return eaten;
    }

}
