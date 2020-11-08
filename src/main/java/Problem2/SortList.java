package Problem2;

public class SortList {
    private static final int SENTRY = Integer.MAX_VALUE;
    // DO NOT ADD ANY NEW MEMBER VARIABLE AND MEMBER FUNCTION

    // DO NOT CHANGE ANYTHING IN THIS FUNCTION
    public static ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode mid = findMidAndBreak(head);
        return mergeLists(sortList(head), sortList(mid));
    }

    public static ListNode findMidAndBreak(ListNode head) {

        return null;
    }

    public static ListNode mergeLists(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;

        else if (list2 == null)
            return list1;

        Node result;

        // Pick either a or b, and recur
        if (list1.data <= list2.data)
        {
            result = list1;
            result.next = mergeLists(list1.next, list2);
        }
        else
        {
            result = list1;
            result.next = mergeLists(list1, list2.next);
        }

        return result;    }
}
