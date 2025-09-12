class Node {
    int val;
    Node next;

    Node(int x) {
        val = x;
        next = null;
    }
}
class q17{
    public boolean hasCycle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third;

        q17 obj = new q17();
        System.out.println("Cycle detected:" + obj.hasCycle(head));
    }
}
