package com.gym.controller.algorithms;

import com.gym.model.GymModel;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Anish
 */
public class SelectionSort {

    List<GymModel> sortedMemberList;

    public SelectionSort() {
        sortedMemberList = new ArrayList<>();
    }
    /**
     * Sorts a list of StudentModel objects by their LMU ID in ascending or
     * descending order.
     *
     * @param studentList the list of StudentModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the sorted list
     */
    public List<GymModel> sortByMemberId(List<GymModel> studentList, boolean isDesc) {
        this.sortedMemberList.clear();
        this.sortedMemberList.addAll(studentList);
        if (sortedMemberList == null || sortedMemberList.isEmpty()) {
            throw new IllegalArgumentException("Student list cannot be null or empty.");
        }
        for (int i = 0; i < sortedMemberList.size() - 1; i++) {
            int extremumIndex = findExtremumIndex(sortedMemberList, i, isDesc);
            if (i != extremumIndex) {
                swap(sortedMemberList, i, extremumIndex);
            }
        }
        return sortedMemberList;
    }
    /**
     * Finds the index of the extremum value (minimum or maximum) in the list
     * from the start index.
     *
     * @param memberSortedList the list of StudentModel objects
     * @param startIndex the index to start searching from
     * @param isDesc specifies whether to find the maximum (true) or minimum
     * (false)
     * @return the index of the extremum value
     */
    private int findExtremumIndex(List<GymModel> memberSortedList, int startIndex, boolean isDesc) {
        int extremumIndex = startIndex;
        for (int j = startIndex + 1; j < memberSortedList.size(); j++) {
            if (shouldSwap(memberSortedList.get(j).getMemberId(), memberSortedList.get(extremumIndex).getMemberId(), isDesc)) {
                extremumIndex = j;
            }
        }
        return extremumIndex;
    }
    /**
     * Determines whether the current value should replace the current extremum
     * based on sort order.
     *
     * @param current the current value
     * @param extremum the current extremum value
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return true if the current value should replace the extremum; false
     * otherwise
     */
    private boolean shouldSwap(int current, int extremum, boolean isDesc) {
        return isDesc ? current > extremum : current < extremum;
    }
    /**
     * Swaps two elements in the list.
     *
     * @param sortedMemberList the list of StudentModel objects
     * @param i the index of the first element
     * @param j the index of the second element
     */
    private void swap(List<GymModel> sortedMemberList, int i, int j) {
        GymModel temp = sortedMemberList.get(i);
        sortedMemberList.set(i, sortedMemberList.get(j));
        sortedMemberList.set(j, temp);
    }
}
