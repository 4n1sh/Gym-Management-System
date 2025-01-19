package com.gym.controller.algorithms;

import com.gym.model.GymModel;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Anish
 */
public class InsertionSort {
    List<GymModel> sortedMemberList;
    public InsertionSort() {
        sortedMemberList = new ArrayList<>();
    }
    /**
     * Sorts a list of GymModel objects by their amount in ascending or
     * descending order.
     *
     * @param memberList the list of GymModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the sorted list
     */
    public List<GymModel> sortByAmount(List<GymModel> memberList, boolean isDesc) {
        this.sortedMemberList.clear();
        this.sortedMemberList.addAll(memberList);
        if (sortedMemberList == null || sortedMemberList.isEmpty()) {
            throw new IllegalArgumentException("Member list cannot be null or empty.");
        }
        for (int i = 1; i < sortedMemberList.size(); i++) {
            GymModel current = sortedMemberList.get(i);
            int j = i - 1;
            while (j >= 0 && shouldSwap(sortedMemberList.get(j).getAmount(), current.getAmount(), isDesc)) {
                sortedMemberList.set(j + 1, sortedMemberList.get(j));
                j--;
            }
            sortedMemberList.set(j + 1, current);
        }
        return sortedMemberList;
    }
    /**
     * Determines whether the two amounts should be swapped based on the sort
     * order.
     *
     * @param current the current double value
     * @param previous the previous double value
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return true if the current value should replace the previous value;
     * false otherwise
     */
    private boolean shouldSwap(double current, double previous, boolean isDesc) {
        return isDesc ? current > previous : current < previous;
    }
}
