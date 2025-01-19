package com.gym.controller.datastructure;

import com.gym.model.RequestModel;
import java.util.LinkedList;
/**
 * <b>Custom implementation of a queue data structure for managing RequestModel
 * objects. This queue is implemented using a LinkedList and supports basic
 * operations like enqueue, dequeue, and peek.</b>
 *
 * <p>Features include:</p>
 * <ul>
 * <li>Ability to check if the queue is empty.</li>
 * </ul>
 *
 * <p>Note: This implementation assumes that the queue operations are not accessed
 * concurrently.</p>
 *
 * @author Anish Shrestha 23048634
 */
public class CustomQueue {

    private LinkedList<RequestModel> requestQueue; // Internal storage for the queue.
    /**
     * Constructs a CustomQueue.
     */
    public CustomQueue() {
        requestQueue = new LinkedList<>();
    }
    /**
     * Removes and returns the first element from the queue.
     *
     * @return the first RequestModel in the queue.
     * @throws IllegalStateException if the queue is empty.
     */
    public RequestModel deQueue() {
        try {
            return requestQueue.removeFirst();
        } catch (Exception ex) {
            throw new IllegalStateException("Cannot remove from an empty queue.");
        }
    }
    /**
     * Adds a new element to the end of the queue.
     *
     * @param requestModel the RequestModel to be added to the queue.
     */
    public void enQueue(RequestModel requestModel) {
        requestQueue.addLast(requestModel);
    }
    /**
     * Retrieves, but does not remove, the first element of the queue.
     *
     * @return the first RequestModel in the queue.
     * @throws IllegalStateException if the queue is empty.
     */
    public RequestModel peek() {
        try {
            return requestQueue.getFirst();
        } catch (Exception ex) {
            throw new IllegalStateException("Cannot peek into an empty queue.");
        }
    }
    /**
     * Checks if the queue is empty.
     *
     * @return true if the queue contains no elements, false otherwise.
     */
    public boolean isEmpty() {
        return requestQueue.isEmpty();
    }
}
