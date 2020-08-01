package org.pricecontroller.controller;

import java.util.concurrent.BlockingQueue;

public class PriceProducer implements Runnable {

    protected BlockingQueue<Object> queue;
    
    PriceProducer(BlockingQueue<Object> theQueue) {
        this.queue = theQueue;
    }
 
    public void run() 
    {
        try
        {
            while (true) 
            {
                Object justProduced = getResource();
                queue.put(justProduced);
                System.out.println("Produced resource - Queue size now = "  + queue.size());
            }
        } 
        catch (InterruptedException ex) 
        {
            System.out.println("Producer INTERRUPTED");
        }
    }
 
    Object getResource() 
    { 
    	// update pricing logic here
    	return new Object();
    }
}
