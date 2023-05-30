// Teste pessoa
public class ex007  {
    public static void main(String args[]) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Jose Antonio");
        pessoa1.setCPF("123456789-00");
        System.out.printIn("Nome: " + pessoa1.getNome());
        System.out.println("CPF: " + pessoa1.getCPF());
        System.out.println("CPF Valido: " + pessoa1.validaCPF());
        System.out.println();

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Antonio Jose")
        System.out.printIn("Nome: " + pessoa1.getNome());
        System.out.println("CPF: " + pessoa1.getCPF());
        System.out.println("CPF Valido: " + pessoa1.validaCPF());
    }
}

// Endereço.java

public class Endereco {
    public static final int COMERCIAL = 0;
    public static final int RESIDENCIAL = 1;

    private int tipo;
    private string logradouro;

    public Endereco() {
        tipo = Endereco.COMERCIAL;
    }
    public Endereco(int tipoEnd, String logradouroEnd) {
        tipo = tipoEnd;
        logradouro = logradouroEnd;
    }

    public int getTipo() {
        return tipo;
    }

    public void setLogradouro(String logradouroEnd) {
        logradouro = logradouroEnd;
    }

    public String getLogradouro() {
        String local = "";
        switch(tipo) {
            case Endereco.COMERCIAL:
                 local += "COM: ";
                 break;
            default;
                local += "RES: ";
    }
    local += logradouro;
    return local;
  }
}

// TesteEndereco.java
public class TesteEndereco {
    public static void main(string args[]) {
        Endereco end1 = new Endereco();
        end1.setLogradouro("Rua Entendo o Java, 56");
        System.out.println(end1.getTipo() +" - " + end1.getLogradouro());

        Endereco end2 = new Endereco(Endereco.COMERCIAL, "Rua entendendo o Java para Internet, 896");
        System.out.println(end2.getTipo() + " - " + end2.getLogradouro());
    }
}

public void setLogradouro(String logradouroEnd) {
    // nomes diferentes para as variáveis
    logradouro = logradouroEnd;
}

// tambem podemos usar este outro codigo

public void setLogradouro(String logradouro) {
    // this.logradouro refere-se ao atributo de instância
    // chamado logradouro.
    // o identificador refere-se ao parâmetro de método lograuro.
    this.logradouro = logradouro;
}

public int getTipo() {
    // tipo é um atributo de instância.
    // Em um método get, geralmente não use usa this.
    return tipo;
}

// Endereco.java
public class Endereco {
    // constantes
    public static final int COMERCIAL = 0;
    public static final int RESIDENCIAL = 1;

    // atributos de instância
    private int tipo;
    private String logradouro;

    // construtor
    public Endereco() {
        // procura um construtor na classe Endereco que possua 
        // parâmetros int, String. Veja o construtor abaixo: 
        this(Endereco.COMERCIAL, "");
    }

    // construtor
    public Endereco(int tipo, String logradouro) {
        this.tipo = tipo;
        // chamando o método abaixo desta instância:
        this.setLogradouro( logradouro );
    }

    // mutator (set)
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    // acessor (get)
    public int getTipo() {
        return tipo;
    }

    // acessor (get) 
    public String getLogradouro() {
        String local = "";
        swicth(this.tipo) {
            case Endereco.COMERCIAL:
                local += "COM: ";
                break;
            default
                local += "RES: ";
        }
        local += logradouro;
        return local;
    }
}