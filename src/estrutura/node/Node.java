package estrutura.node;

public class Node<T> {
	private T element;
	private Node<T> next;

	public Node(){
		
	}
	
	public Node(T element, Node<T> node){
		this.element = element;
		this.next = node;
	}
	
	public T getElement() {
		return this.element;
	}

	public void setElement(T element) {
		this.element = element;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	
}
