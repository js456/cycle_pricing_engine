package org.pricecontroller.controller;

import java.util.concurrent.BlockingQueue;

public class PriceConsumer implements Runnable{
	protected BlockingQueue<Object> queue;
	 
	PriceConsumer(BlockingQueue<Object> theQueue) {
        this.queue = theQueue;
    }
 
    public void run() {
        try
        {
            while (true) 
            {
                Object obj = queue.take();
                System.out.println("Consumed resource - Queue size now = "  + queue.size());
                take(obj);
            }
        } 
        catch (InterruptedException ex) 
        {
            System.out.println("CONSUMER INTERRUPTED");
        }
    }
 
    void take(Object obj) 
    {
    	/// price calculating logic here
        
    }
}
