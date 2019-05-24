package com.company;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        //
    }
    
    public static void findPairs(int[] arr, int X){
        Set<Integer> set = new TreeSet<>();
        ArrayList <ArrayList<Integer>> outerList = new ArrayList <ArrayList<Integer>>();
        for (int i=0; i<arr.length; i++){
            if (set.contains(X-arr[i]) && (X-arr[i] == arr[i])){
                ArrayList <Integer> innerList = new ArrayList <>();
                innerList.add(arr[i]);
                innerList.add(X-arr[i]);
                outerList.add(innerList);
                set.remove(arr[i]);
            }
            set.add(arr[i]);
            if (set.contains(X-arr[i]) && (X-arr[i] != arr[i])){
                ArrayList <Integer> innerList = new ArrayList <>();
                innerList.add(arr[i]);
                innerList.add(X-arr[i]);
                outerList.add(innerList);
                set.add(X-arr[i]);
                set.add(arr[i]);
            }
        }
        for (int i=0; i<outerList.size(); i++) {
            for (int j=0; j<outerList.get(i).size(); j++) {
                System.out.print(outerList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}