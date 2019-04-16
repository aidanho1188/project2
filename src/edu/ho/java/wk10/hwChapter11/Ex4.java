package edu.ho.java.wk10.hwChapter11;

import java.util.LinkedList;

public class Ex4 {
    public void partition(LinkedList<Integer> list, int E){

    	// create two new list
        LinkedList<Integer> lowerThanE = new LinkedList<>();
        LinkedList<Integer> biggerThanE = new LinkedList<>();

        int count = 0;
        while (list.size() > count){

            if (list.get(count) < E){
                lowerThanE.add(list.get(count));
                count++;
            } else {
                biggerThanE.add(list.get(count));
                count++;
            }
        }

        lowerThanE.addAll(biggerThanE);

        // clear and add
        list.clear();
        list.addAll(lowerThanE);
    }
}
