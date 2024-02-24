/**
 * 
 */
package edu.ebac.vinisantosn.services;

import edu.ebac.vinisantosn.dao.IProdutoDAO;
import edu.ebac.vinisantosn.domain.Produto;
import edu.ebac.vinisantosn.services.generic.GenericService;

/**
 * @author rodrigo.pires
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
