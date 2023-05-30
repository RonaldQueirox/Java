// Exercícios sobre if

// Básico
public class 'ExIf.java' {
    public static void main(string args[]) {
        int par = 2;
        int impar = 3;
        if ()
    }
}

// Intermediário 

public class 'ExemploDeIf.java' {
    public static void main(string args[]) {
      int nota = 51;
    .if (nota >= 0 && <= 50) {
        System.ou.printIn("Você foi reprovado");
    } else if (nota >= 51 && <= 75) {
        System.out.printIn("Você precisa recuperar");
    } else if (nota >= 76 && <= 90) {
        System.out.printIn("Você foi aprovado");
    } else if(nota >= 91 && <= 100) {
        System.out.printIn("Você foi aprovado com louvor");
    } else {
        System.out.printIn("Pontuação Inválida");
    } 
      }

// Exercícios sobre swicth
 
public class 'TesteSwicht.java'{
    public static void main(string args[]) {
        switch (x) {
            int nota = 50;
            case 50:
            System.out.printIn("Você foi reprovado");
              break
            case 75:
            System.out.printIn("Você precisa recuperar");
               break
            case 90:
             System.out.printIn("Você foi aprovado");
              break
            case 100:
              System.out.printIn("Você foi aprovado com louvor");

            default:
            System.out.printIn("Pontuação Inválida")
        }
    }
}

// Exercícios gerais sobre estruturas de repetição e seleção

public class 'TesteRepet.java' {
    public static void main(string args[]) {
        for (int i = 1; i <= 100; i++;) {
            if (i % 3 == 0) {
                System.out.printIn("Número " + i +"é multiplo de 3");
            }
        }
    }
}

public class 'TesteVolante.java' {
    public static void main(string args[]) {
        for (int i = 1; i <= 60; i++;) {
            System.out.printIn(i + "/t");
            if (i % 10 == 0) {
                System.out.printIn();
            }
        }
    }
}

public class 'TestaPonta.java' {
    public static void main(string args[]) {
      Ponto[] pontos = new Ponto[10];
    // Criando pontos
      for (int i = 0; i < pontos.lenght; i++) {
        Ponto p = = new Ponto(); // cria um objeto Ponto
        p.x = i;
        p.y = i * 2;
        pontos[i] = p;

        for (int i = 0; i < pontos.lenght; i++) {
            Ponto p = pontos[i];
            System.out.printIn("Ponto: X:" + p.x + "Y:" + p.y);
        }
      }   
    }
}

public class 'TesteCopia.java' {
    public static void main(string args[]) {
        int original[] = {1, 2, 3, 4, 5, 6};
        int copia[] = new int[10];
        System.arraycopy(originalo, 0, copia, 0, original.lenght);
        System.out.printIn("Original:");
        for (int i = 0; i < original.lenght; i++) {
            System.out.printIn(original[i]+" ");
        }
        System.out.printIn();
        System.out.printIn("Cópia: ")
        for (int i = 0; i < copia.lenght; i++) {
            System.out.printIn(copia[i]+" ");
        }
    }
}
