package Esempi;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class ListOperations<T> {
	private List<T> list;
	public ListOperations() {
		this.list=new LinkedList<>();
	}
	public void add(T e) {
		list.add(e);
	}
	public void remove(T e) {
		list.remove(e);
	}
	public void forEach(Consumer<? super T> action) {
		list.forEach(action);
	}
	public String toString() {
		return list.toString();
	}
	public T get(int i) {
		return list.get(i);
	}
	

}
