package com.example.javafirstlab.Task3;

import java.util.List;

/**
 * Class that contains methods for facilitating testing
 */
class TestUtils {

    /**
     * Method for checking equality of string in two lists
     * @param firstList
     * @param secondList
     * @return boolean result of comparison
     */
    static boolean compareStringLists(List<String> firstList, List<String> secondList){
        if(firstList.size() != secondList.size())
            return false;
        if(firstList == secondList)
            return true;

        for(int i = 0; i < firstList.size(); i++){
            if(!firstList.get(i).equals(secondList.get(i))){
                return false;
            }
        }
        return true;
    }
}
