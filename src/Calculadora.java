import operaciones.*;
import procesos.MostrarResultado;

import java.util.Scanner;

public class Calculadora {


    public static void main(String[] args) {
        double n1 = 0;
        double n2 = 0;
        double valor = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciona una operacion: \n 1.- SUMA \n 2.- RESTA \n 3.- MULTIPLICACION \n 4.- DIVISION" +
                "\n 5.- POTENCIA \n 6.- RAIZ CUADRADA\n 7.- SENO \n 8.- COSENO\n 9.- TANGENTE");
        final int operacion = sc.nextInt();
        if (operacion == 5) {
            System.out.println("Inserta el numero base \n");
            n1 = sc.nextDouble();
            System.out.println("Inserta el exponente \n");
            n2 = sc.nextDouble();
        }
        if (operacion == 6) {
            System.out.println("Inserta el numero base \n");
            valor = sc.nextDouble();
        }
        if (operacion == 7 || operacion == 8 || operacion == 9){
            System.out.println("Inserta el valor del angulo \n");
            valor = sc.nextDouble();
        }


        System.out.println(n1 + ", " + n2);
        MostrarResultado resultado = new MostrarResultado();
        switch (operacion) {
            case 1:
                Suma sum = new Suma();
                resultado = new MostrarResultado(sum.realizarOperacion(n1, n2));
                break;
            case 2:
                Resta res = new Resta();
                resultado = new MostrarResultado(res.realizarOperacion(n1, n2));
                break;
            case 3:
                Multiplicacion mul = new Multiplicacion();
                resultado = new MostrarResultado(mul.realizarOperacion(n1, n2));
                break;
            case 4:
                Division div = new Division();
                if (n2 == 0) {
                    System.out.println("El segundo numero no puede ser 0");
                    break;
                }
                resultado = new MostrarResultado(div.realizarOperacion(n1, n2));
                break;
            case 5:
                Potencia exp = new Potencia();
                resultado = new MostrarResultado(exp.realizarOperacion(n1, n2));
                break;
            case 6:
                Raiz sqrt = new Raiz();
                resultado = new MostrarResultado(sqrt.realizarOperacion(valor));
                break;
            case 7:
                Seno sen = new Seno();
                resultado = new MostrarResultado(sen.realizarOperacion(valor));
                break;
            case 8:
                Coseno cos = new Coseno();
                resultado = new MostrarResultado(cos.realizarOperacion(valor));
                break;
            case 9:
                Tangente tan = new Tangente();
                resultado = new MostrarResultado(tan.realizarOperacion(valor));
                break;

        }

    }


    }

