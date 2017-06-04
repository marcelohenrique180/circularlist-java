package estrutura.listacircular.simples;

import estrutura.node.Node;

public interface ListaCircular<S extends Node<T>, T> {
	
	/**
	 * Adiciona um Nodo em frente ao cursor
	 * 
	 * @param node O nodo a ser inserido
	 */
	public void add(S node);
	
	/**
	 * Remove o Nodo que está em frente ao cursor
	 * 
	 * @return node O node que foi removido
	 */
	public S remove();
	
	/**
	 * Avança o cursor ao próximo Nodo
	 */
	public void advance();
	
	/**
	 * Retorna o cursor
	 * 
	 * @return node O nodo cursor
	 */
	public S getCursor();
	
	/**
	 * Retorna o tamanho da lista
	 * 
	 * @return int O tamanho da lista
	 */
	public int getSize();
	
	/**
	 * Verifica se a lista está vazia
	 * 
	 * @return boolean
	 */
	public boolean isEmpty();
}
