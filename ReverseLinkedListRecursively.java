package com.kabaso.mock.week11.task1;
//Write a program to reverse a linked list recursively.
class ReverseLinkedListRecursively {
    int data;
    ReverseLinkedListRecursively next;
    ReverseLinkedListRecursively(int x){
        data = x;
        next = null;
    }
}

class RLR {

     static ReverseLinkedListRecursively reverseList(ReverseLinkedListRecursively head){
        if (head == null || head.next == null)
            return head;

        // Reverse the rest of the list
        ReverseLinkedListRecursively revHead = reverseList(head.next);

        // Make the current head the last node
        head.next.next = head;

        // Update the next of current head to NULL
        head.next = null;

        // Return the new head of the reversed list
        return revHead;
    }

    static void printList(ReverseLinkedListRecursively curr){
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args){

         ReverseLinkedListRecursively head = new ReverseLinkedListRecursively(1);
        head.next = new ReverseLinkedListRecursively(2);
        head.next.next = new ReverseLinkedListRecursively(3);
        head.next.next.next = new ReverseLinkedListRecursively(4);
        head.next.next.next.next = new ReverseLinkedListRecursively(5);

        head = reverseList(head);
        printList(head);
    }
}
