class LinkedList {
    Node headNode;
    Node tailNode;
    class Node {
        int data;
        Node nextNode;

        Node(int data){
            this.data = data;
            this.nextNode = null;
        }
    }

    public LinkedList() {
        this.headNode = null;
        this.tailNode = null;
    }

    public int get(int index) {
        Node temp = this.headNode;
        int i = 0;
        while (temp != null) {
            if (i == index) {
                return temp.data;
            }
            temp = temp.nextNode;
            i++;
        }
        return -1;
    }

    public void insertHead(int val) {
        Node newNode = new Node(val);
        newNode.nextNode = headNode;
        headNode = newNode;

        if (headNode.nextNode == null) {
            tailNode = newNode;
        } 
    }

    public void insertTail(int val) {
        Node newNode = new Node(val);
        if (headNode == null) {
            headNode = newNode;
            tailNode = newNode;
            return;
        }
        tailNode.nextNode = newNode;
        tailNode = newNode;
    }

    public boolean remove(int index) {
        if (headNode == null || index < 0) {
            return false;
        }
        if (index == 0) {
            headNode = headNode.nextNode;
            if (headNode == null) {
                tailNode = null;
            }
            return true;
        }
        Node curr = headNode;
        for (int i = 0; i < index - 1; i++) {
            if (curr == null || curr.nextNode == null) {
                return false;
            }
            curr = curr.nextNode;
        }
        if (curr.nextNode == null) {
            return false;
        }
        if (curr.nextNode == tailNode) {
            tailNode = curr;
        }
        curr.nextNode = curr.nextNode.nextNode;
        return true;
    }

    public ArrayList<Integer> getValues() {
        Node temp = headNode;
        ArrayList<Integer> arr = new ArrayList<>();
        while (temp != null) {
            arr.add(temp.data);
            temp = temp.nextNode;
        }   
        return arr;
    }
}