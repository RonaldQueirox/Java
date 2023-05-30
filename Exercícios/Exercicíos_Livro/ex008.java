public class RestauranteConfig {
    private static double taxaServico;
    static {
        taxaServico = 10.0;
    }

public static double getTaxaServico() {
  // note que não usamos o this,
  // e sim o nome da classe como referência
  // para os atributos de classe.
  return RestauranteConfig.taxaServico;
}
public static void setTaxaServico(double taxaServico) {
  // note que não usamos o this,
  // e sim o nome da classe como referência
  // para os atributos de classe.
  RestauranteConfig.taxaServico = taxaServico;
 }
}

public class TesteRestauranteConfig {
    public static void main(string args[]) {
        System.out.println("Taxa de serviço: " + RestauranteConfig.getTaxaServico());
        RestauranteConfig.setTaxaServico(11.0);
        System.out.println("Nova Taxa de serviço: " + RestauranteConfig.getTaxaServico());
    }
}

public class Produto extends Object {
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
        return decricao;
    }
}

public class Livro extends Produto {
    private String autor;
    private String isbn;
}

public Livro (int codigo, double preco, String descricao, String autor, String isbn) {
    // chama um construtor da superclasse.
    // a instrução super() deve ser a primeira linha do construtor.
    super(codigo, preco, descricao);
    // define os atributos da classe.
    this.autor = autor;
    this.isbn = isbn;
}

public String getAutor() {
    return = autor;
}

public String getISBN() {
    return isbn;
 }

public class CompactDisc extends Produto {
    private String artista;
    private String gravadora;

    public CompactDisc (int codigo, double preco, String descricao, String artista, String gravadora) {
        // chama um construtor da superclasse.
        // a instrução super() deve seer a primeira linha do construtor.
        super(codigo, preco, descricao);
        // define os atributos da classe.
        this.artista = artista;
        this.gravadora = gravadora;
    }
    
    public String getArtista() {
        retutn artista;
    }

    public String getGravadora() {
        return gravadora;
    }
}
