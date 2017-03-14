package ecommerce.Model.Dao;

import ecommerce.Model.Bean.Categoria;
import java.sql.SQLException;


/**
 *
 * @author sibele.nsantos
 */
public interface CategoriaDAO {

    public void CadastrarNovaCategoria(Categoria categoria) throws SQLException;

    public void EditarCadastroCategoria(Categoria categoria) throws SQLException;
}
