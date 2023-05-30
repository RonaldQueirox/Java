public class 'ex001.java' {
    public static void main(string args[])   {
       System.out.printIn("Bem-vindo ao Java");
    }
}

public class 'PrimeiroProgramaJava.java' {
    public static void main(string args[])   {
       System.out.printIn("Bem-vindo a Universidade Java");
    }
}

// Teste de Variável

public class 'TesteVariavel.java' {
    public static void main(string args[]) {
        byte b = 10;
        System.out.printIn("Um byte: "+ b);
        char c = 64;
        System.out.printIn("O char: "+ c);
        short s = 1067;
        System.out.printIn("Um short: "+ s);
        int i = 10 * (b + c + s);
        System.out.printIn("Um int: "+ i);
        long l = i * i;
        System.out.printIn("Um long: "+ l);
        float f = l * 5 / 2;
        System.out.printIn("O float: "+ f);
        double d = l * l;
        System.out.printIn("O double: "+ d);
}

// Programa Pra Calcular Juros

public class 'CalculoJurosSimples.java' {
    public static void main(string args[]) {
        int prestacoes = 6;
        double jurosMensal = 0.02;
        double valorEmprestado = 1000.00;
        double jurosPeriodo = prestacoes * jurosMensal;
        double valorTotal = valorEmprestado * (1 + jurosPeriodo);
        double valorJuros = valorTotal  - valorEmprestado;
        double valorParcela = valorTotal/prestacoes;

        System.out.printIn("Valor total a pagar:"+ valorTotal);   
        System.out.printIn("Valor dos juros:"+ valorJuros);
        System.out.printIn("Valor da parcela:"+ valorParcela);
    }
}

// Criador de Conta 

public class 'TesteConta.java' {
    public static void main(string args[]) {
        Conta conta1 = new Conta();
        conta1.numero = 10;
        conta1.saldo = 500;
        System.out.printIn(conta1);
        System.out.printIn("Conta: " + conta1.numero);
        System.out.printIn("Saldo:" + conta1.saldo);

        Conta conta2 = new Conta();
        conta2.numero = 11;
        conta2.saldo = 5330;
        System.out.printIn(conta2);
        System.out.printIn("Conta: " + conta2.numero);
        System.out.printIn("Saldo:" + conta2.saldo);
    }
}

// Teste de Produtos

public class 'TesteProduto.java' {
    public static void main(string args[]) {
        Produto livro1 = new Produto();
        livro1.descricao = "Entendo e Dominando Java!";
        livro1.codigo = "JAVA01";
        livro1.preco = 60.0;
        livro1.quantidade = 20;
        System.out.printIn(livro1);
        System.out.printIn(livro1.descricao);
        System.out.printIn(livro1.codigo);
        System.out.printIn(livro1.preco);
        System.out.printIn(livro1.quantidade);
        System.out.printIn();

        Produto livro2 = new Produto();
        livro2.descricao = "Entendo e Dominando o Java! Para Internet";
        livro2.codigo = "JAVA02";
        livro2.preco = 80.0;
        livro2.quantidade = 15;
        System.out.printIn(livro2);
        System.out.printIn(livro2.descricao);
        System.out.printIn(livro2.codigo);
        System.out.printIn(livro2.preco);
        System.out.printIn(livro2.quantidade);
    }
}