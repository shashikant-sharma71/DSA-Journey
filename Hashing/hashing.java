package Hashing;

import java.util.HashSet;
public class hashing {

    public static void main(String[] args){
        // Creating a HashSet of integers
        HashSet<Integer> set = new HashSet<>();
        // INSERT 
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        // SEARCH

        if(set.contains(1)){
            System.out.println("Set Contains 1 ");


        }
        if(!set.contains(6)){
            System.out.println("Set does not contain 6");

       
        }
    }
}

    

