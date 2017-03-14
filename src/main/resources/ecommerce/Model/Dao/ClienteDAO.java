package ecommerce.Model.Dao;

import ecommerce.Model.Bean.Cliente;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sibele.nsantos
 */
public interface ClienteDAO {

    public void CadastrarCliente(Cliente cliente) throws SQLException;

    public void EditarCadastroCliente(Cliente cliente) throws SQLException;

    public void ExclusaoDeCadastroCliente(Cliente cliente, String cpf_cliente, String senha) throws SQLException;
}
