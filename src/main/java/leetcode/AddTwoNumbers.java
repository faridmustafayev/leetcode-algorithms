package leetcode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Test test = new Test();

        test.addTwoNumbers(
                new ListNode(5, new ListNode(4, new ListNode(3))),
                new ListNode(2, new ListNode(4, new ListNode(5)))
        );
    }
}

class Test {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> l1Node = recursiveMethod(l1);
        List<Integer> l2Node = recursiveMethod(l2);

        BigInteger l1Number = returnNumber(l1Node);
        BigInteger l2Number = returnNumber(l2Node);

        BigInteger sum = l1Number.add(l2Number);

        String sumStr = sum.toString();
        StringBuilder sb = new StringBuilder(sumStr);
        String reverseString = sb.reverse().toString();

        System.out.println(reverseString);

        ListNode listNode = null;
        ListNode current = null;
        for (int i = 0; i < reverseString.length(); i++) {
            int digit = reverseString.charAt(i) - '0';
            ListNode newNode = new ListNode(digit);

            if (listNode == null) {
                listNode = newNode;
                current = newNode;
            } else {
                current.next = newNode;
                current = newNode;
            }

        }

        System.out.println(listNode);
        return listNode;

    }

    public BigInteger returnNumber(List<Integer> integers) {
        StringBuilder sb = new StringBuilder();
        for (Integer integer : integers) {
            sb.append(integer);
        }
        return new BigInteger(sb.reverse().toString());
    }

    public List<Integer> recursiveMethod(ListNode node) {
        List<Integer> result = new ArrayList<>();
        result.add(node.val);

        if (node.next != null) {
            result.addAll(recursiveMethod(node.next));
        }
        return result;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
