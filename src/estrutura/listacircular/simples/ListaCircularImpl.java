package estrutura.listacircular.simples;

import estrutura.node.Node;

public class ListaCircularImpl<T> implements ListaCircular<Node<T>, T> {
	private Node<T> cursor;
	private int size;

	@Override
	public void add(Node<T> newNode) {
		if (isEmpty()) {
			cursor = newNode;
			newNode.setNext(newNode);
		}
		else {
			newNode.setNext(cursor.getNext());
			cursor.setNext(newNode);
		}
		size++;
	}

	@Override
	public Node<T> remove() {
		Node<T> oldNode = cursor.getNext();
		cursor.setNext(oldNode.getNext());
		oldNode.setNext(null);
		size--;
		return oldNode;
	}

	@Override
	public void advance() {
		cursor = cursor.getNext();	
	}

	@Override
	public Node<T> getCursor() {
		return cursor;
	}

	@Override
	public int getSize() {
		return size;
	}
	
	@Override
	public boolean isEmpty(){
		return size == 0;
	}
	
	@Override
	public String toString(){
		String string = "[... ";
        for (int i = 0; i < size; i++) {
            string = string + cursor.getElement() + " | ";
            this.advance();
        }
        string = string + " ...]";
        return string;
	}
}
