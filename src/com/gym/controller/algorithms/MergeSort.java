package com.gym.controller.algorithms;

import com.gym.model.GymModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anish
 */
public class MergeSort {

    /**
     * Sorts a list of GymModel objects by their name in ascending or descending
     * order.
     *
     * @param memberList the list of GymModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the sorted list
     */
    public List<GymModel> sortByName(List<GymModel> memberList, boolean isDesc) {
        if (memberList == null || memberList.isEmpty()) {
            throw new IllegalArgumentException("Member list cannot be null or empty.");
        }

        return mergeSort(memberList, isDesc);
    }

    /**
     * Recursively divides the list and merges the sorted sublists.
     *
     * @param memberList the list to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the sorted list
     */
    private List<GymModel> mergeSort(List<GymModel> memberList, boolean isDesc) {
        if (memberList.size() <= 1) {
            return memberList;
        }

        int mid = memberList.size() / 2;

        List<GymModel> left = new ArrayList<>(memberList.subList(0, mid));
        List<GymModel> right = new ArrayList<>(memberList.subList(mid, memberList.size()));

        left = mergeSort(left, isDesc);
        right = mergeSort(right, isDesc);

        return merge(left, right, isDesc);
    }

    /**
     * Merges two sorted lists into a single sorted list.
     *
     * @param left the left sublist
     * @param right the right sublist
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the merged sorted list
     */
    private List<GymModel> merge(List<GymModel> left, List<GymModel> right, boolean isDesc) {
        List<GymModel> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (shouldSwap(left.get(i).getName(), right.get(j).getName(), isDesc)) {
                merged.add(right.get(j));
                j++;
            } else {
                merged.add(left.get(i));
                i++;
            }
        }

        // Add remaining elements from the left list
        while (i < left.size()) {
            merged.add(left.get(i));
            i++;
        }

        // Add remaining elements from the right list
        while (j < right.size()) {
            merged.add(right.get(j));
            j++;
        }

        return merged;
    }

    /**
     * Determines whether two names should be swapped based on the sort order.
     *
     * @param current the current name
     * @param next the next name
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return true if the current value should replace the next value; false
     * otherwise
     */
    private boolean shouldSwap(String current, String next, boolean isDesc) {
        return isDesc ? current.compareToIgnoreCase(next) < 0 : current.compareToIgnoreCase(next) > 0;
    }
}
