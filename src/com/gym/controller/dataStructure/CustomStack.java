package com.gym.controller.dataStructure;

import com.gym.model.GymModel;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

/**
 * Custom implementation of a stack data structure for managing GymModel
 * objects. This stack is implemented using a LinkedList and supports basic
 * operations like pop, push, peek, and size checks.
 *
 * @author Anish
 */
public class CustomStack {

    private LinkedList<GymModel> stackList; // Internal storage for the stack.

    /**
     * Constructs a CustomStack with no capacity limit.
     */
    public CustomStack() {
        stackList = new LinkedList<>();
    }

    /**
     * Removes and returns the top element from the stack.
     *
     * @return the top GymModel in the stack, or null if the stack is empty.
     * @throws IllegalStateException if the stack is empty.
     */
    public GymModel pop() {
        try {
            return stackList.removeLast();
        } catch (Exception ex) {
            throw new IllegalStateException("Cannot pop from an empty stack.");
        }
    }

    /**
     * Adds a new element to the top of the stack.
     *
     * @param gymModel the GymModel to be added to the stack.
     * @return the current size of the stack after the operation.
     */
    public int push(GymModel gymModel) {
        stackList.addLast(gymModel);
        return stackList.size();
    }

    /**
     * Retrieves, but does not remove, the top element of the stack.
     *
     * @return the top GymModel in the stack, or null if the stack is empty.
     * @throws IllegalStateException if the stack is empty.
     */
    public GymModel peek() {
        try {
            return stackList.getLast();
        } catch (Exception ex) {
            throw new IllegalStateException("Cannot peek into an empty stack.");
        }
    }

    /**
     * Returns the current size of the stack.
     *
     * @return the number of elements in the stack.
     */
    public int size() {
        return stackList.size();
    }

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack contains no elements, false otherwise.
     */
    public boolean isEmpty() {
        return stackList.isEmpty();
    }


}
