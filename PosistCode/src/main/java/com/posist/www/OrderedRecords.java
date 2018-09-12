package com.posist.www;

import java.util.Arrays;

public class OrderedRecords {

    public static void main(String[] args) {


      
        Transaction transaction1 = new Transaction("Peter", "Sam", 30);
        Transaction transaction2 = new Transaction("Sam", "Ryan", 17);
        Transaction transaction3 = new Transaction("Sam", "Ryan", 10);
    
        Node genesisNode = new Node(0, Arrays.asList(transaction1),Arrays.asList(transaction1, firstNode.hashCode(),secondNode.hashCode()));
        System.out.println(firstNode.hashCode());
        Node secondNode = new Node(firstNode.hashCode(), Arrays.asList(transaction2),Arrays.asList(0));
        System.out.println(secondNode.hashCode());
        Node thirdNode = new Node(firstNode.hashCode(), Arrays.asList(transaction3),Arrays.asList(0));
        System.out.println(thirdNode.hashCode());

    }
}
