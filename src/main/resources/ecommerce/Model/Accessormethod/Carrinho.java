package ecommerce.Model.Accessormethod;


/*  @author sibele */
public class Carrinho {
    private Integer cod_carrinho; 
    private Integer cod_produto;
    private Integer quantidade_por_produto;
    private float subtotal;

    public Integer getCod_carrinho() {
        return cod_carrinho;
    }

    public void setCod_carrinho(Integer cod_carrinho) {
        this.cod_carrinho = cod_carrinho;
    }

    public Integer getCod_produto() {
        return cod_produto;
    }

    public void setCod_produto(Integer cod_produto) {
        this.cod_produto = cod_produto;
    }

    public Integer getQuantidade_por_produto() {
        return quantidade_por_produto;
    }

    public void setQuantidade_por_produto(Integer quantidade_por_produto) {
        this.quantidade_por_produto = quantidade_por_produto;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }
    
    
    
}
