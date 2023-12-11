package ProdutosCabelo_nicolas_covre;

import java.util.List;

public class SetorBeleza {

	private List <ProdutoCabelo> proCa;
	
	public SetorBeleza() {
	
	}
	

	
	
	
	public SetorBeleza(List<ProdutoCabelo> proCa) {
		super();
		this.proCa = proCa;
	}




	public List<ProdutoCabelo> getProCa() {
		return proCa;
	}
	
	public void setProCa(List<ProdutoCabelo> proCa) {
		this.proCa = proCa;
	}
}
