package edu.ho.java.wk10.hwChapter11;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Ex5 {
	
    public static void sortAndRemoveDuplicates(List<Integer> list){

        Set<Integer> temp = new TreeSet<Integer>();
        // automatically sort and remove duplicate using treeset
        temp.addAll(list);

        // clear and add
        list.clear();
        list.addAll(temp);
    }

}
