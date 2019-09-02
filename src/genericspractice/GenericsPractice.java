/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericspractice;

import java.util.ArrayList;

/**
 * GenericsPractice.java
 * @author James Mitchell 92020474
 * Date: 2/09/19
 */
public class GenericsPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Three");
        list.add("Two");
        list.add("Five");
        
        ArrayList<String> noDups = removeDuplicates(list);
        
        System.out.println(noDups);
    }
    
    /**
     *
     * @param <E>
     * @param list
     * @return
     */
    public static <E extends Comparable<E>> ArrayList<E> removeDuplicates(ArrayList<E> list)
    {
        boolean foundDuplicate = false;
        if(list.isEmpty())
            return list;

        ArrayList<E> newList = new ArrayList<>();
        newList.add(list.get(0));

        for(int i = 1; i < list.size(); i++)
        {
            for(int j = 0; j < newList.size(); j++)
            {
                if(list.get(i).compareTo(newList.get(j))==0)
                {
                    foundDuplicate = true;
                    break;
                }
            }
            
            if(foundDuplicate != true)
            {
                newList.add(list.get(i));
            }
            
            foundDuplicate = false;   
        }
        
        return newList;
    }
    
}
