package listen;

public class TutoriumLinkedList implements TutoriumList {

	private int size;
	private ListNode head;

	public TutoriumLinkedList() {
		this.head = null;
		this.size = 0;
	}

	@Override
	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public void append(Object elem) {
		size++;
		if (head == null) {
			head = new ListNode(elem);
		} else {
			ListNode help = head;

			while (help.next != null)
				help = help.next;

			ListNode newElem = new ListNode(elem);
			help.next = newElem;
			// order help.next = new ListNode(elem);
		}

	}

	@Override
	public boolean contains(Object elem) {
		ListNode help = head;
		
		if(head==null)
			return false;
		
		if(head.elem.equals(elem))
			return true;
		
		while(help.next!=null) {
			if(help.elem.equals(elem))
				return true;
			help = help.next;
		}
		return false;
		
		
//		if (isEmpty())
//			return false;
//		
//		do {
//			if (help.elem.equals(elem))
//				return true;
//			help = help.next;
//		} while (help.next != null);
//
//		return false;

	}

	@Override
	public void remove(Object elem) {
		
		
		if(head.next == null)
			return;
		
			if(head.elem.equals(elem))
			{
				head=head.next;
				size--;
			}
		
		ListNode help = head;
		while(help.next != null && !help.next.elem.equals(elem))
		{
			help = help.next;
		}
		
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		return size;
	}

}
