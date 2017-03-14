package ecommerce.Model.Dao;

import ecommerce.Model.Bean.Produto;
import java.sql.SQLException;


/*@author sibele.nsantos*/
public interface ProdutoDAO {

    public void CadastrarProduto(Produto produto) throws SQLException;

    public void ExclusaoDeCadastroProduto(Produto produto, String codigo_produto) throws SQLException;

    public void EditarCadastroProduto(Produto produto) throws SQLException;

    public Produto BuscarProdutoPorCategoria(String codigo_categoria) throws SQLException;
}
