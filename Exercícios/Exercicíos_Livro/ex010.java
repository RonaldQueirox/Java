public abstract class Produto extends Object {

    private int codigo;
    private double preco;
    private String descricao;

    public Produto(int codigo, double preco, String descricao) {
        this.codigo = codigo;
        this.preco = preco;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
}

// métodos abstratos não possuem corpo de implementação.
public abstract String getDescricaoCompleta();
}

public class Carrinho {
    private Vendavel[] vendaveis;
    private int counter;

    public Carrinho() {
        vendaveis = new Vendavel[10];
        counter = 0;
    }

    public Vendavel[] getVendaveis() {
        return vendaveis;
    }

    public int adicionaVendavek(Vendavel vendavel) {
        vendaveis[ counter++ ] = vendavel;
        return counter;
    }

    public Vendavel getVendavel(int index) {
        return vendaveis[index];
    }

    public double calculoCompras() {
        double valor = 0;
        for (int i = 0; i < vendaveis.lenght; i++) {
            if ( vendaveis[i] != null ) {
                valor += vendaveis[i].getValorVenda();
            }
        }
        return valor;
    }
} 

public class TestaCarrinho {

    public static void main(String args[]) {
        Livro livro = new Livro(1, 60)
    }
}