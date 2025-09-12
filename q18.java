class Node{
    int val;
    Node next;
    Node(int x){
        val = x;
        next = null;
    } 
}
 class q18 {
    public static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        while(curr!=null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
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

        Node newrev = reverse(head);
        System.out.println(newrev.val);
    
}
}
