package easy;
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){val = x;}
}


public class _2 {
    public static void main(String[] args) {
        ListNode node= new ListNode(1);
    }
    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
