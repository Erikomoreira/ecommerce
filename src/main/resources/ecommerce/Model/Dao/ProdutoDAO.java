package ecommerce.Model.Dao;

import ecommerce.Model.Accessormethod.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/* @author sibele */
public class ProdutoDAO extends GenericaDAO {

    //Insere os dados do produto no banco
    public void CadastrarProduto(Produto produto) throws SQLException {
        String query = "INSERT INTO Produto(cod_categoria,nome_produto,valor_produto,descricao_produto,caracteristica_produto,data_inclusao,quantidade_produto) "
                + "VALUES(?,?,?,?,?,?,?)";
        insert(query, produto.getCod_categoria(), produto.getNome_produto(), produto.getValor_produto(), produto.getDescricao_produto(), produto.getData_inclusao(), produto.getQtde_produto());
// Ver questão da inclusão de quantidade.       
    }

    // Exclui o produto
    public void ExclusaoDeCadastroProduto(Produto produto, String codigo_produto) throws SQLException {
        String query = "DELETE * FROM PRODUTO WHERE COD_PRODUTO = " + codigo_produto;
        delete(query, produto.getCod_categoria(), produto.getNome_produto(), produto.getValor_produto(), produto.getDescricao_produto(), produto.getData_inclusao(), produto.getQtde_produto());
    }

    //Editar os dados do produto no banco
    public void EditarCadastroProduto(Produto produto) throws SQLException {

        String query = "UPDATE produto "
                + "SET cod_categoria = ?,nome_produto = ?,valor_produto = ?,descricao_produto = ?,caracteristica_produto = ?,  "
                + "WHERE VERIFICAR QUAL SERA A CONDIÇÃO = ?";

        //Verificar a condição e o problema da quantidade
        update(query, produto.getCod_categoria(), produto.getNome_produto(), produto.getValor_produto(), produto.getDescricao_produto());

    }

    //Localiza todos os produtos de uma determinada categoria
    public Produto BuscarProdutoPorCategoria(String codigo_categoria) throws SQLException {

        String sql = "SELECT COD_PRODUTO,COD_CATEGORIA,NOME_PRODUTO,VALOR_PRODUTO,CARACTERISTICA_PRODUTO,DESCRICAO_PRODUTO FROM PRODUTO WHERE COD_CATEGORIA =" + codigo_categoria;

        Produto produto = new Produto();

        PreparedStatement stmt
                = getConnection().prepareStatement(sql);

        stmt.setString(1, codigo_categoria);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            produto.setCod_produto(rs.getInt("COD_PRODUTO"));
            produto.setCod_categoria(rs.getInt("COD_CATEGORIA"));
            produto.setNome_produto(rs.getString("NOME_PRODUTO"));
            produto.setValor_produto(rs.getFloat("VALOR_PRODUTO"));
            produto.setNome_produto(rs.getString("CARACTERISTICA_PRODUTO"));
            produto.setNome_produto(rs.getString("DESCRICAO_PRODUTO"));

        }

        rs.close();
        stmt.close();
        return produto;
    }
}
