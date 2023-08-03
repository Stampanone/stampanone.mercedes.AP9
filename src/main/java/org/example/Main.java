package org.example;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //ejercicio 6
        saludoDeBienvenida();

        //ejercicio 1
        Scanner myScanner = new Scanner(System.in);
/*
        System.out.println("Ingrese su nombre");
        String nombrePers = myScanner.next();
        System.out.println("Ingrese su apellido");
        String apellidoPers = myScanner.next();
        System.out.println("Ingrese su edad");
        int edadPers = myScanner.nextInt();

        saludarPersona(nombrePers, apellidoPers, edadPers);


        //ejecicio 2
        System.out.println("Ingrese numero 1");
        int num1 = myScanner.nextInt();
        System.out.println("Ingrese numero 2");
        int num2 = myScanner.nextInt();
        System.out.println("Ingrese numero 3");
        int num3 = myScanner.nextInt();

        int mayor = 0;
        if (num1 > num2 && num1 > num3) { // Si el numero uno es mayor que el dos y el tres
            mayor = num1;
        } else if (num2 > num3) { // Si el numero dos es mayor que el tres
            mayor = num2;
        } else {
            mayor = num3; // y si no se cumplen ningunda de las anteriores se mostra el numero 3 que seria mayor
        }
        System.out.println("El mayor numero ingresado fue: "+ mayor);


         //ejercicio 3
        System.out.println("Ingrese un numero");
        int num = myScanner.nextInt();

        if (num % 2 == 0){// si el resto de la divicion es 0 entonces es par
            System.out.println("El numero ingresado es Par");
        } else {
            System.out.println("El numero ingresado es Impar");
        }


        //ejercicio 4

        System.out.println("Ingrese la cadena de caracteres a comparar");
        String cadena1 = myScanner.nextLine();// nextLine se una para ingresar una oracion xej con espacios y demas
        System.out.println("Ingrese la segunda cadena de caracteres a comparar");
        String cadena2 = myScanner.nextLine();

        if (Objects.equals(cadena1, cadena2)){//compara las 2 cadenas ingresasdas
            System.out.println("Las cadenas son iguales");
        } else {
            System.out.println("Las cadenas son diferentes");
        }

        // ejercicio 5

        List<Integer> numeros = new ArrayList<>();

        System.out.println("Ingrese numeros (el 0 termina el programa)");
        int numeroIngre = myScanner.nextInt();

        while (numeroIngre != 0){//si el numero ingresado es 0 se termina el bucle
            numeros.add(numeroIngre);// va agregando los numeros a la lista
            System.out.println("Ingresar otro numero (el 0 termina el programa)");
            numeroIngre = myScanner.nextInt();
        }

        for(int i =0; i<numeros.size(); i++){// recorre la lista una vez terminado el bucle
            System.out.println("Indice "+ i + ": "+ numeros.get(i));
        }


        //ejercicio 7

        System.out.println("Ingrese un numero");
        int nume = myScanner.nextInt();
        esParOImpar(nume);

        //ejercicio 8

        System.out.println("Ingrese un numero para saber si es Primo o no");
        int numer = myScanner.nextInt();

        if (esPrimo(numer)){
            System.out.println("El numero es Primo");
        }else {
            System.out.println("El numero No es Primo");
        }

        //ejercicio 9

        List<Integer> numerosASumar = Arrays.asList(1,2,3,4,5,6,7,8,9);

        int sumaImpares = sumaNumeroImpares(numeros);
        System.out.println("La suma de los números impares es: " + sumaImpares);
*/

        //ejercicio 10

        List<Integer> numerosASumarEImprimir = Arrays.asList(1,2,3,4,5,6,7,8,9);

        imprimirNumerosParesYSumaPrimos(numerosASumarEImprimir);

        //ejercicio 11

        menuCalculadora();
        int opcion =myScanner.nextInt();

        while (opcion!=0){

            switch (opcion){
                case 1:
                    System.out.println("Sumar");
                    break;
                case 2:
                    System.out.println("Resta");
                    break;
                case 3:
                    System.out.println("dividir");
                    break;
                case 4:
                    System.out.println("Multiplicar");
                    break;
                default:
                    System.out.println("Opcion inexistente");
                    break;
            }

            menuCalculadora();
            opcion= myScanner.nextInt();
        }
        System.out.println("Usted salio de la Calculadora   ");


        //ejercicio 12
        int opcion1 =myScanner.nextInt();
        do {
            menuCalculadora();

            switch (opcion1) {
                case 1:
                    realizarSuma();
                    break;
                case 2:
                    realizarResta();
                    break;
                case 3:
                    realizarMultiplicacion();
                    break;
                case 4:
                    realizarDivision();
                    break;
                case 0:
                    System.out.println("Saliendo del menú de la calculadora...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion1 != 0);


    }
    //ejercicio 1
    public static void saludarPersona(String nombrePers, String apellidoPers, int edadPers) {
        System.out.println("Hola " + nombrePers + " " + apellidoPers + " de " + edadPers + " años. ¿Como estás?");
    }

    //ejercicio 6

    public static void saludoDeBienvenida(){System.out.println("Bienvenidos a los ejercicios de Java");}

    //ejercicio 7

    public static void esParOImpar (int nume){
        if (nume % 2 == 0){// si el resto de la divicion con dos es 0 entonces el numero es par
            System.out.println("El numero ingresado es Par");
        } else {
            System.out.println("El numero ingresado es Impar");
        }
    }

    //ejercicio 8

    public static boolean esPrimo (int numer){
        if (numer <= 1) { //si el numero es menor o igual a 1 no es primo
            return false;
        }
        // Compruebo si el numero es divisible por algun valor desde 2 hasta su mitad
        for (int i = 2; i <= numer / 2; i++) {
            if (numer % i == 0) {
                return false; // Si es divisible, no es primo
            }
        }
        return true; // Si no es divisible por ningun valor, es primo
    }

    //ejercicio9

    public static int sumaNumeroImpares(Collection<Integer>numeros){
        int sumaImpares = 0;
        for (int numero : numeros) {//recorro la coleccion
            if (numero % 2 != 0) {//si el numero es inpar se suma a sumaImpares
                sumaImpares += numero;
            }
        }
        return sumaImpares;
    }

    //ejercicio 10
    public static void imprimirNumerosParesYSumaPrimos(Collection<Integer> numeros) {
        int sumaPrimos = 0;
        System.out.println("Números pares:");
        for (int numero : numeros) { // recorre la lista y si es par los imprime
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }

            if (esPrimo(numero)) { // utilizo la funcion anterior si es primo y si lo es los suma
                sumaPrimos += numero;
            }
        }
        System.out.println("Suma de los números primos: " + sumaPrimos);
    }

    //ejercicio 11

    public static void menuCalculadora (){
        System.out.println("Calculadora:");
        System.out.println("1- Sumar");
        System.out.println("2- Restar");
        System.out.println("3- Dividir");
        System.out.println("4- Multiplicar");
        System.out.println("0- Salir");

    }

    //ejercicio 12

    public static void realizarSuma() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 + num2;
        System.out.println("Resultado: " + resultado);
    }

    public static void realizarResta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 - num2;
        System.out.println("Resultado: " + resultado);
    }

    public static void realizarMultiplicacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 * num2;
        System.out.println("Resultado: " + resultado);
    }

    public static void realizarDivision() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el dividendo: ");
        double dividendo = scanner.nextDouble();
        System.out.print("Ingrese el divisor: ");
        double divisor = scanner.nextDouble();

        if (divisor == 0) {
            System.out.println("Error: No se puede dividir por cero.");
        } else {
            double resultado = dividendo / divisor;
            System.out.println("Resultado: " + resultado);
        }
    }

}
