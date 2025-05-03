package com.practice.leetcode;

public class AddTwoNumbers {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(9, 
							new ListNode(9, 
									new ListNode(9,
											new ListNode(9,
													new ListNode(9,
															new ListNode(9, 
																	new ListNode(9)))))));
		ListNode l2 = new ListNode(9, 
				new ListNode(9, 
						new ListNode(9,
								new ListNode(9))));
		ListNode result = addTwoNumbers(l1, l2);
		System.out.println(result);
	}
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode headNode = new ListNode();
        ListNode tempNode = headNode;
        int carry = 0;
        while(l1 != null || l2 != null) {
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;

            int sum = l1Val + l2Val + carry;
            System.out.println("l1Val = "+l1Val+" , l2Val = "+l2Val + " : sum = "+sum);
            System.out.println(" Unit to add = "+sum % 10 + " : carry = "+(sum / 10));
            tempNode.next = new ListNode( sum % 10);
            carry = sum / 10;
            tempNode = tempNode.next;
           
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        if(carry != 0) {
            tempNode.next = new ListNode(carry);
        }
        return headNode.next;
	}

}
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      
      public String toString() {
    	  String returnStr = this.val + " -> ";
    	  ListNode nextNode = this.next;
    	  while(nextNode != null) {
    		  returnStr += nextNode.val + " -> ";
    		  nextNode = nextNode.next;
    	  }
    	  return returnStr;
      }
  }
