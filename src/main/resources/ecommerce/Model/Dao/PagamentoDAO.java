package ecommerce.Model.Dao;

import ecommerce.Model.Bean.Pagamento;
import java.sql.SQLException;


/**
 *
 * @author sibele.nsantos
 */
public interface PagamentoDAO {
    public Pagamento BuscarFormaPagamento(int cod_pagamento) throws SQLException ;
}
