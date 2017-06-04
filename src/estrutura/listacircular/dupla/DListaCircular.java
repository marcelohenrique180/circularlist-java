package estrutura.listacircular.dupla;

import estrutura.listacircular.simples.ListaCircular;
import estrutura.node.DNode;

public interface DListaCircular<T> extends ListaCircular<DNode<T>, T>{
	
	/**
	 * Retroce o cursor ao Nodo anterior
	 * 
	 * @return void
	 */
	public void goBack();
}
