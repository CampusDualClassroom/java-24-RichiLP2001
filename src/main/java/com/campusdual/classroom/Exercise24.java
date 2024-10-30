package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {
    public static Queue<String> createQueue() {
        Queue<String> nuevaCola = new LinkedList<>();
        nuevaCola.offer("Smith");
        nuevaCola.offer("Montessori");
        nuevaCola.offer("Peralta");
        nuevaCola.offer("House");
        return nuevaCola;
    }
    public static void printAndEmptyQueue(Queue<String> queue) {
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }

    }

    public static void main(String[] args) {
        Queue<String> laCola = createQueue();
        printAndEmptyQueue(laCola);

        System.out.println(laCola.peek()+"\n");
        System.out.println("\n siguiente prueba: ");



    }

}
