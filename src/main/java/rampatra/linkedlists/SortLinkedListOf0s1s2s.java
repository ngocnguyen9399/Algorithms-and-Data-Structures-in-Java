package rampatra.linkedlists;

import com.rampatra.common.SingleLinkedList;
import com.rampatra.common.SingleLinkedNode;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: ramswaroop
 * @date: 7/5/15
 * @time: 1:47 PM
 */
public class SortLinkedListOf0s1s2s {

    /**
     * Sorts {@param list} consisting of only 0s, 1s and 2s as their node values.
     * <p/>
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param list
     */
    public static void sort(SingleLinkedList<Integer> list) {
        int[] count = new int[3];
        SingleLinkedNode<Integer> curr = list.head;

        // keep count of 0s, 1s and 2s
        while (curr != null) {
            count[curr.item]++;
            curr = curr.next;
        }

        // make a linked list of that many 0s, 1s and 2s
        list.clear();
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                list.add(i);
            }
        }
    }

    public static void main(String a[]) {
        SingleLinkedList<Integer> linkedList = new SingleLinkedList<>();
        linkedList.add(0);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(0);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(1);
        linkedList.printList();
        sort(linkedList);
        linkedList.printList();
    }
}
