package estrutura.node;

public class DNode<T> extends Node<T> {
	private DNode<T> next, previous;
	
	public DNode(T element, DNode<T> node, DNode<T> previous){
		this.setElement(element);
		this.next = node;
		this.previous = previous;
	}

	public DNode<T> getNext() {
		return next;
	}

	public void setNext(DNode<T> next) {
		this.next = next;
	}

	public DNode<T> getPrevious() {
		return previous;
	}

	public void setPrevious(DNode<T> previous) {
		this.previous = previous;
	}
	
	
}
