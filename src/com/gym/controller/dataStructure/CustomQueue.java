package com.gym.controller.datastructure;

import com.gym.model.GymModel;
import java.util.LinkedList;

/**
 * <b>Custom implementation of a queue data structure for managing GymModel
 * objects. This queue is implemented using a LinkedList and supports basic
 * operations like enqueue, dequeue, peek, and size checks</b>
 *
 * <p>Features include:</p>
 * <ul>
 * <li>Capacity limit for the queue.</li>
 * <li>Ability to check if the queue is empty or full.</li>
 * </ul>
 *
 * <p>Note: This implementation assumes that the queue operations are not accessed
 * concurrently.</p>
 *
 * @author Anish Shrestha 23048634
 */
public class CustomQueue {

    private LinkedList<GymModel> gymQueue; // Internal storage for the queue.
    private int capacity; // Maximum number of elements the queue can hold.

    /**
     * Constructs a CustomQueue with the specified capacity.
     *
     * @param capacity the maximum number of elements the queue can hold.
     * @throws IllegalArgumentException if the specified capacity is negative.
     */
    public CustomQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than zero.");
        }
        gymQueue = new LinkedList<>();
        this.capacity = capacity;
    }

    /**
     * Removes and returns the first element from the queue.
     *
     * @return the first GymModel in the queue, or null if the queue is empty.
     * @throws IllegalStateException if the queue is empty.
     */
    public GymModel deQueue() {
        try {
            return gymQueue.removeFirst();
        } catch (Exception ex) {
            throw new IllegalStateException("Cannot remove from empty queue."); // Indicates the queue is empty.
        }
    }

    /**
     * Adds a new element to the end of the queue if it is not full.
     *
     * @param gymModel the GymModel to be added to the queue.
     * @return the current size of the queue after the operation, or -1 if the
     * queue is full.
     */
    public int enQueue(GymModel gymModel) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full, cannot add new element.");
        }
        gymQueue.addLast(gymModel);
        return gymQueue.size();
    }

    /**
     * Returns the current size of the queue.
     *
     * @return the number of elements in the queue.
     */
    public int poll() {
        return gymQueue.size();
    }

    /**
     * Retrieves, but does not remove, the first element of the queue.
     *
     * @return the first GymModel in the queue, or null if the queue is empty.
     * @throws IllegalStateException if the queue is empty.
     */
    public GymModel peek() {
        try {
            return gymQueue.getFirst();
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
        return gymQueue.isEmpty();
    }

    /**
     * Checks if the queue is full.
     *
     * @return true if the queue has reached its capacity, false otherwise.
     */
    public boolean isFull() {
        return gymQueue.size() == capacity;
    }
}
