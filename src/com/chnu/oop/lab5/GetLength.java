package com.chnu.oop.lab5;

import java.util.List;

public class GetLength {

    /*

    This method return the size of  the  integer inputList

    */

    public int size(List<Integer> inputList)
    {
        int length = 0;

        for(int i:inputList)
        {
            length++;
        }
        return length;
    }
}

