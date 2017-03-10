package ecommerce.Model.Dao;

import ecommerce.Model.Accessormethod.Funcionario;
import java.sql.SQLException;

/* @author sibele */
public class FuncionarioDAO extends GenericaDAO {

    //Insere os dados do funcionario no banco
    public void CadastrarFuncionario(Funcionario funcionario) throws SQLException {
        String query = "INSERT INTO funcionario(nome_funcionario,cpf_funcionario,login_funcionario,senha_funcionario) "
                + "VALUES(?,?,?,?)";
        insert(query, funcionario.getNome_funcionario(), funcionario.getCpf_funcionario(), funcionario.getLogin_funcionario(), funcionario.getSenha_funcionario());

    }

     //Editar os dados do funcionario no banco
    public void EditarCadastroFuncionario(Funcionario funcionario) throws SQLException {

        String query = "UPDATE funcionario "
                + "SET nome_funcionario = ?,cpf_funcionario = ?,login_funcionario = ?,senha_funcionario = ?"
                + "WHERE cpf_funcionario = ?";

        update(query, funcionario.getNome_funcionario(), funcionario.getCpf_funcionario(), funcionario.getLogin_funcionario(), funcionario.getSenha_funcionario());

    }
}
