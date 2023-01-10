package com.epam.collections.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> createdQueue = new PriorityQueue<>( (o1,o2) -> o2.compareTo(o1));
        createdQueue.addAll(firstList);
        createdQueue.addAll(secondList);
        return createdQueue;
    }
}
