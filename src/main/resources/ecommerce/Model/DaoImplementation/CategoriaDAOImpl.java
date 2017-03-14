package ecommerce.Model.DaoImplementation;

import ecommerce.Model.Bean.Categoria;
import ecommerce.Model.Dao.CategoriaDAO;
import java.sql.SQLException;

/*  @author sibele */
public class CategoriaDAOImpl extends GenericaDAOImpl implements CategoriaDAO {

    //Insere os dados da nova categoria no banco
    public void CadastrarNovaCategoria(Categoria categoria) throws SQLException {
        String query = "INSERT INTO categoria(nome_categoria)"
                + "VALUES(?,?)";

        insert(query, categoria.getNome_categoria());

    }

    //Edita os dados da categoria no banco
    public void EditarCadastroCategoria(Categoria categoria) throws SQLException {
        String query = "UPDATE cliente "
                + "SET nome_categoria = ? "
                + "WHERE cod_categoria = ?";
        update(query, categoria.getNome_categoria());
    }
}
