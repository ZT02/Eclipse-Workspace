package ListNodeTutor;

public interface TutoriumList<T>
{
	public boolean isEmpty();

	public void append(T elem);

	public boolean contains(T elem);

	public void remove(T elem);

	public T get(int index);

	public int size();
}
