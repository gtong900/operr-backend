public class LinkedList {
	LinkedListNode head;
	LinkedList() {
		head = null;
	}
	LinkedList(int data) {
		head = new LinkedListNode(data);
	}

	public LinkedListNode append(int data) {
		LinkedListNode node = new LinkedListNode(data);
		node.next = null;

		if (head == null) {
			head = node;
		}
		else {
			LinkedListNode last = head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = node;
		}
		return head;
	}

	public LinkedListNode removeFromTail() {
		if (head != null) {
			if (head.next == null) {
				head = null;
			}
			else {
				LinkedListNode last = head, previous = head;
				while (last.next != null) {
					previous = last;
					last = last.next;
				}
				previous.next = null;
			}
		}
		return head;
	}

	public LinkedListNode removeElement(int threshold) {
		if (head == null) return head;
		LinkedListNode currNode = head, previous = head;
		while (currNode != null) {
			if (currNode.data > threshold) {
				if (currNode == head) {
					head = currNode.next;
					currNode = head;
					previous = head;
				}
				else {
					previous.next = currNode.next;
					currNode = currNode.next;
				}
			} else {
				previous = currNode;
				currNode = currNode.next;
			}
		}
		return head;
	}

	public String printList() {
		LinkedListNode currNode = head;
		StringBuilder sb = new StringBuilder();
		while (currNode != null) {
			sb.append(currNode.data + " ");
			currNode = currNode.next;
		}
		return sb.toString();
	}


}
