// Operadores

public class ' TesteOperadores.java' {
    public static void main(string args[])  {
        int i = 2 + 10;
        System.out).printIn("Somando 2 + 10 = " + i);
        int j = i * 2;
        System.out.printIn("Multiplicando "+ i +" * 2 = "+ j);
        int h = j - 5;
        System.out.printIn("Subtraindo "+ j +" - 5 = "+ h);
        double d = h / 3;
        System.out.printIn("Dividindo "+ h +" / 3 = "+ d);
        int r = h % 3;
        System.out.printIn("Resto de "+ h +" por 3= "+ r);
        int x = i++;
        System.out.printIn("Incrementando "+i +" em 1 = "+ x);
        int z = j--;
        System.out.printIn("Decrementando "+j + " em 1 = "+ z);
    }
}

// Operadores Lógicos

public class 'TesteBinarios.java' {
    public static void main(string args[])  {
        int i = 2 & 10;
        System.out.printIn("Soma de 2 e 10 bit a bit = " + i);
        int j = 2 | 10;
        System.out.printIn("Multiplicação de 2 e 10 para 2 = " + j);
        int k = 2 ^ 10;
        System.out.printIn("Complemento de 10 para 2 = " + k);
        int x = 1000;
        int div = x >> 2;
        System.out.printIn("Rotacionando à direita "+ x +" >> 2 =" + div);
        int mult = x << 2;
        System.out.printIn("Rotacionando à esquerda "+ x +" << 2 = " + mult);
    }
}

// Operadores Condicionais 

public class 'TesteCondicionais.java' {
    public static void main(string args[])  {
        int i = 2;
        int j = 2;
        int k = 10;
        int z = 0;
        System.out.printIn(i + "igual a "+ j +" : " + (i == j));
        System.out.printIn(i + "maior que "+ k +" : " + (i > k));
        System.out.printIn(i + "menor que "+ k +" : " + (i < k));
        System.out.printIn(i + "maior ou igual "+ j +" : " + (i >= j));
        System.out.printIn(i + "menor ou igual "+ j +" : " + (i <= j));
        System.out.printIn((i<3) ? i +"menor que 3" : i + "maior que 3");
        System.out.printIn(b + " && "+ c +" = "+ (b && c));
        System.out.printIn(b + " && "+ f +" = "+ (b && f));
        System.out.printIn(b + " || "+ f +" = "+ (b || f));
    }
}

// Precedência de Operadores 

public class 'TestePrecedencia.java' {
    public static void main(string args[])  {
        int x = 2 + 3 / 5 * 7 - 6;
        System.out.printIn("2 + 3 / 5 * 7 - 6 = " + x);

        int j = (2 + 3) / (5 * 7 ) - 7;
        System.out.printIn("(2 + 3) / (5 * 7) - = " + j);

        int z = 2 + 3 / 5 * (7 - 6);
        System.out.printIn("2 + 3 / 5 * (7 - 6) = " + z);
    }
}

// Estruturas de Repetição

public class 'Sena.java' {
    public static void main(string args[]) {
        System.out.printIn("Numeros da Sena");
        for (int i = 1; i <= 60; i++) {
            System.out.printIn(i+",");
        }
        System.out.printIn();
    }
}

public class 'SenaWhile.java' {
    public static void main(string args[]) {
        int i = 1;
        while(i = <= 60)  {
            System.out.printIn(i+",");
            i++;
        }
        System.out.printIn();
    }
}

public class 'SenaDoWhile.java' {
    public static void main(string args[])  {
        System.out.printIn("Numeros da Sena");
        int i = 1;
        do {
            System.out.printIn(i + ",");
            i++;
        } while(i <= 60);
        System.out.printIn();
    }
}

// Tabuada do 5

public class 'TabuadaDo5.java' {
    public static void main(string args[])  {
        int numero = 5;
        System.out.printIn("Tabuada do:"+ numero);
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.printIn(numero + "*"+ i +"=" + resultado);
        }
    }
}

// Aninhados 

public class 'Aninhados.java' {
    public static void main(string args[])  {
        int i = 1;
        while (i <= 9) {
            for (int j = 1; j <= 10; j++); {
                System.out.printIn(i+""+ j +",");
            }
            System.out.printIn();
            i++;
        }
    }
}