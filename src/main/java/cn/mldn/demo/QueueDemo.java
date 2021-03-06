package cn.mldn.demo;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo
{
    public static void main(String[] args)
    {
        System.out.println("Lesson 5.147.Queue队列：先进先出：");
        
        System.out.println("普通队列：");
        Queue<String> queue = new LinkedList<String>();        
        
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        
        
        System.out.println("\n优先级队列：");
        Queue<String> pQ = new PriorityQueue<String>();
        
        pQ.offer("X");
        pQ.offer("B");
        pQ.offer("H");
        
        System.out.println(pQ.poll());
        System.out.println(pQ.poll());
        System.out.println(pQ.poll());     
        
    }
}
