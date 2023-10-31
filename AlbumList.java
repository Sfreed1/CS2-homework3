/**
 * AlbumList.java
 * An abstract class that lays out the different type of functions within the AlbumArrayList.java
 * Part of Homework 4, Part 1
 */

public abstract class AlbumList{

	protected int numItems;

	abstract public void add(Album newA);

	abstract public Album remove(Album targetA);

	abstract public Album remove(int idx);

	public int size(){
		return numItems;
	}

	abstract public Album get(int idx);

	abstract public void set(int idx, Album newA);

	
}

