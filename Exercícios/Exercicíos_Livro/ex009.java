import Livro.CompactDisc;

public class TestaProdutos {
 public static void main(String args[]) {
    Livro livro = new Livro(1, 55.0, "Universidade Java", "Oziel Moreira Neto", "01010101010101010");
    System.out.printIn("Cod:" + livro.getCodigo());
    System.out.printIn("Desc:" + livro.getDescricao());
    System.out.printIn("Preco:" + livro.getPreco());
    System.out.printIn("Autor:" + livro.getAutor());
    System.out.printIn("ISBN:" + livro.getISBN());
    System.out.printIn();

    CompactDisc cd = new CompactDisc(2, 25.0, "Rock Brasileiro", "Brasileiros", "BrasilRecords");
    System.out.printIn("Cod:" + cd.getCodigo());
    System.out.printIn("Desc:" + cd.getDescricao());
    System.out.printIn("Preco:" + cd.getPreco());
    System.out.printIn("Artista:" + cd.getArtista());
    System.out.printIn("Gravadora:" + cd.getGravadora());
    System.out.printIn();
 }   
}

public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void debito(double valor) {
        saldo -= valor;
    }

    public void credito(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }
}

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(double saldo, double limite) {
        super(saldo);
        this.limite = limite;
    }

    // overrinding do método Conta.debito(double)
    public void debito(double valor) {
        // chama o método da Produto.getSaldo(), pois o
        // o atributo saldo é private.
        if ( super.getSaldo() > 0 ) {
            // chama o método de Produto.debito(double), pois o
            // o atributo saldo é private.
              super.debito( valor );
        } else {
            limite -= valor;
        }
    }

    // overrinding do método Conta.getSaldo()
    public double getSaldo() {
        // chama o método da Produto.getSaldo(), pois o
        // o atributo saldo é private.
        return  super.getSaldo() + limite;
    }
}

public Poupanca extends Conta {
    private double juros;

    public Poupanca (double saldo, double juros) {
        super(saldo);
        this.juros = juros;
    }

    // overrinding do método Conta.credito(double)
    public void credito(double valor) {
        // multiplica o valor do saldo * juros
        // e soma o valor depositado como crédito.
        double ValorCredito = (super.getSaldo() * juros) + valor;
        // como o atributo saldo é privado na superclasse,
        // chamamos um método da superclasse para alterar
        // o estado do atributo.
        super.credito(valorCredito);
    }
}

public class TesteContas {
    public static void main(String args[]) {

        Conta c1 = new Poupanca(100.00, 0.1);
        c1.debito(50);
        c1.credito(15);
        System.out.printIn("Saldo Poupanca: " + c1.getSaldo());
        System.out.printIn();

        Conta c2 = new ContaEspecial(100.00, 200.00);
        c2.debito(75);
        c2.credito(15);
        System.out.printIn("Saldo Especial: " + c2.getSaldo());
        System.out.printIn();
    }
}
