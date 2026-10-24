public class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        // Шаг 1. Находим середину списка с помощью быдрого и медленного указателей
        ListNode prev = null, slow = head, fast = head;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null; // Разрываем список на две половины
        
        // Шаг 2. Рекурсивно сортируем обе половины
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);
        
        // Шаг 3. Сливаем отсортированные списки
        return merge(l1, l2);
    }
    
    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        
        if (l1 != null) {
            current.next = l1;
        }
        if (l2 != null) {
            current.next = l2;
        }
        
        return dummyHead.next;
    }
}
