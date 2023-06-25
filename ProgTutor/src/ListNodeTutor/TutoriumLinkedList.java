package ListNodeTutor;

public class TutoriumLinkedList<T> implements TutoriumList<T>
{
	private int size;
	private ListNode<T> head;

	public TutoriumLinkedList()
	{
		this.head = null;
		this.size = 0;
	}

	@Override
	public boolean isEmpty()
	{
		return head == null;
	}

	@Override
	public void append(T elem)
	{
		size++;
		if (head == null)
		{
			head = new ListNode<T>(elem);
		} else
		{
			ListNode<T> help = head;

			while (help.next != null)
				help = help.next;
			ListNode<T> newElem = new ListNode<T>(elem);
			help.next = newElem;

			// oder help.next = new ListNode(elem);
		}
	}

	@Override
	public boolean contains(T elem)
	{
		if (head == null)
			return false;

		if (head.elem.equals(elem))
			return true;

		ListNode<T> help = head.next;

		while (help.next != null)
		{
			if (help.elem.equals(elem))
				return true;
			help = help.next;
		}
		return false;
	}

	@Override
	public void remove(T elem)
	{
		if (head == null)
			return;

		if (head.elem.equals(elem))
		{

			head = head.next;
			size--;
			return;
		}
		ListNode<T> help = head;
		while (help.next != null && !help.next.elem.equals(elem))
		{
			help = help.next;
		}

		if (help.next != null)
		{
			help.next = help.next.next;
			size--;
		}

	}

	@Override
	public T get(int index)
	{
		if (size < index || index < 0)
			throw new IndexOutOfBoundsException();

		int cnt = 0;

		ListNode<T> help = head;

		for (int i = 0; i < index; i++)
		{
			help = help.next;
		}

		return help.elem;

	}

	@Override
	public int size()
	{
		return size;
	}

}
