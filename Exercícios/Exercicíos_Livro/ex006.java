public class 'Conta.java' {
    private int numero;
    private double saldo;
    private double juros;
    private Date vencimento;

    // acessor methods
    public double getJuros() {
        return juros;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
     public Date getVencimento() {
        return vencimento;
     }

     //mutator methods
     public void setJuros(double juros) {
        this.juros = juros;
     }

     public void setNumero(int numero) {
        this.numero = numero;
     }

     public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
     }

     //worker methods
     public void debito(double valor) {
        this.saldo -= valor;
     }

     public void credito(double valor) {
        this.saldo += valor;
     }
}

public class 'TestaConta.java' {
    public static void main(string args[]) {
        Conta conta1 = new Conta();
        System.out.printIn("Ref. conta1:" + conta1)

        Conta conta2 = new Conta();
        System.out.printIn("Ref. conta2" + conta2)
    }
}

public class 'TestaConta2.java' {
    /**
     * @param args
     */
    public static void main(string args[]) {
        Conta conta1 = new Conta();
        System.out.printIn("Ref. conta1:" + conta1);
        conta1.setNumero(1);
        conta1.credito(1000);
        conta1.debito(20);
        System.out.printIn("conta: Numero: " + conta1.getNumero());

        public void setNome(String n) {
            nome = n;
        }

        public void setCPF(String c) {
            cpf = c;
        }

        public boolean validaCPF() {
            // variável local
            boolean validado = false;

            // este algoritmo somente verifica se o CPF não é nulo.
            if (cpf != null) {
                validado = true;
            } else {
                validado = false;
            }
            return validado;
        }
    }