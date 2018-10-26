package com.mmall.leetcode;
//TODO:超过Inter.MAX在执行String.valueOf会报错
public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = getValue(l1)+getValue(l2);
        return  generate(sum);

    }
    private int getValue(ListNode node){
        String  value="";
        while(node!=null){
            value=String.valueOf(node.val)+value;
            node=node.next;
        }
        return Integer.valueOf(value);

    }
    private ListNode generate(int val){
        String s = String.valueOf(val);
        ListNode head=null;
        ListNode cur = null;
        for (int i = s.length()-1; i>=0 ;i--) {
            char c = s.charAt(i);
            int transf = Integer.valueOf(String.valueOf(c));
            if(head==null) {
                head = new ListNode(transf);
                cur=head;
            }

            else{
               cur=cur.next=new ListNode(transf);
            }


        }
        return head;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode n1 = new ListNode(4);
        ListNode n2 = new ListNode(3);
        head.next=n1;
        n1.next=n2;

        ListNode head1 = new ListNode(5);
        ListNode n11 = new ListNode(6);
        ListNode n22 = new ListNode(4);
        head1.next=n11;
        n11.next=n22;

        Solution2 solution2 = new Solution2();
        ListNode listNode = solution2.addTwoNumbers(head, head1);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }
        //System.out.println(9999999991+9);

    }
}
