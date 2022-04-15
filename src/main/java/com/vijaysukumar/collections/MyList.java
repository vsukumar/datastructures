package com.vijaysukumar.collections;

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class MyList {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Hello, World!");
        strings.add("Welcome to CoderPad.");
        strings.add("This pad is running Java " + Runtime.version().feature());

        for (String string : strings) {
            System.out.println(string);
        }

        int[] numbers = {3,0,4, 2, 1, 8};
        Node head = null;
        for(int i =0; i<numbers.length; i++){
            head = sortedPush(head, numbers[i]);
            printList(head);
        }

        printList(head);
    }


    static Node push(Node head, int data){
        Node node = new Node(data);
        if(head == null){
            return node;
        } else {
            node.next = head;
            return node;
        }
    }

    /* sorted push
      1. If head is empty, create a node and return
         else
      2. If data is less than head, push head to data's next, return data.
         else
      3. store head as another pointer
         check if current's next is less than data, traverse until true
         store current next ( which is next to node that is less than node) , set it as node's next
         set current next to node
    */
    static Node sortedPush(Node head, int data){
        Node node = new Node(data);
        if(head == null){
            return node;
        } else {
            if(data < head.data){
                node.next = head;
                return node;
            } else {
                Node current = head;
                Node newHead = head;
                while(current.next!=null && current.next.data < data){
                    current = current.next;
                }
                Node nodeNext= current.next;
                current.next = node;
                node.next = nodeNext;
                return newHead;
            }
        }
    }

    static void printList(Node head){
        Node current = head;
        while(current!=null){
            System.out.print(current.data + "->");
            current= current.next;
        }
        System.out.println("null");
    }

}

class Node {
    public int data;
    public Node next;
    public Node(int data){
        this.data = data;
    }
}

