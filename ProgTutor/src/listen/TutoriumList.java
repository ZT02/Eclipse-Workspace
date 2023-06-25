package listen;

import java.util.ArrayList;
import java.util.List;

public interface TutoriumList
{
	public boolean isEmpty();

	public void append(Object elem);

	public boolean contains(Object elem);

	public void remove(Object elem);

	public Object get(int index);

	public int size();
}
