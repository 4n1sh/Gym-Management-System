package com.gym.controller.algorithms;

import com.gym.model.GymModel;
import java.util.List;

/**
 * Implements a binary search algorithm to search for a GymModel object by name.
 *
 * @author Anish Shrestha 23048634
 */
public class BinarySearch {

    /**
     * Searches for a GymModel object by name in a sorted list.
     *
     * @param searchValue the name to search for
     * @param memberList the list of GymModel objects, sorted by name
     * @param left the starting index of the search range
     * @param right the ending index of the search range
     * @return the GymModel object if found; otherwise, null
     */
    public GymModel searchByName(String searchValue, List<GymModel> memberList,
            int left, int right) {
        // If the range is invalid, return null (not found)
        if (right < left) {
            return null;
        }

        // Calculate the middle index
        int mid = (left + right) / 2;

        // Get the name at the middle index and compare with the search value
        String midName = memberList.get(mid).getName().toLowerCase();

        // Check if the middle element matches the search value
        if (searchValue.toLowerCase().equals(midName)) {
            return memberList.get(mid);
        }

        // Search the left half if the search value is smaller than the middle name
        if (searchValue.compareToIgnoreCase(midName) < 0) {
            return searchByName(searchValue, memberList, left, mid - 1);
        }

        // Otherwise, search the right half
        return searchByName(searchValue, memberList, mid + 1, right);
    }
}
