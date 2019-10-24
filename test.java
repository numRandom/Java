public class test {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode insertionSortList(ListNode head) {
        ListNode cur = head.next;
        ListNode node = head;
        ListNode fake = new ListNode(-1);
        fake.next = head;
        while(cur!=null){
            if(cur.val>node.val){
                cur=cur.next;
                node=node.next;
            }else{
                node.next=cur.next;
                ListNode pre = fake;
                while(pre.next.val<cur.val){
                    pre=pre.next;
                }
                cur.next = pre.next;
                pre.next=cur;
                cur=node.next;
            }
        }
        return fake.next;
    }

    public static void main(String[] args) {
    }
}
