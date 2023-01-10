package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> cardsCombined = new ArrayDeque<>();
        cardsCombined.add(  firstQueue.poll());
        cardsCombined.add(  firstQueue.poll());
        cardsCombined.add(  secondQueue.poll());
        cardsCombined.add(  secondQueue.poll());

        while(!firstQueue.isEmpty()){

            firstQueue.add(cardsCombined.pollLast());
            cardsCombined.add(  firstQueue.poll());
            cardsCombined.add(  firstQueue.poll());
            secondQueue.add(cardsCombined.pollLast());
            cardsCombined.add(  secondQueue.poll());
            cardsCombined.add(  secondQueue.poll());
        }
        return cardsCombined;
    }
}
