package ListNodeTutor;

public class ListNode<T>
{
	protected T elem;
	protected ListNode<T> next;

	public ListNode(T elem)
	{
		this.elem = elem;
		this.next = null;
	}
}
