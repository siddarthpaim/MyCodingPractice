public class HasCycle {

        public boolean hasCycle(ListNode head) {
            Set<ListNode> nodesSeen = new HashSet<>();
            while (head != null) {
                if (nodesSeen.contains(head)) {
                    return true;
                }
                nodesSeen.add(head);
                head = head.next;
            }
            return false;
        }
    
    
}
