/*
Escriba un método que valide si una nota ingresada por teclado está entre 0 y 10, sino está
entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta. 
 */
package repasoc;

import java.util.Scanner;


public class RepasoC {

   
  /*  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int num;
        System.out.println("Ingrese una nota entre 0 y 10");
        num = leer.nextInt();
        while(num < 0 || num > 10){
            System.out.println("Ingrese la nota nuevamente");
            num = leer.nextInt();
        }
        System.out.println("La nota es correcta");
   */ 
  /* public static void main(String[] args) {
        /*
        Escriba un método en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.

        */
  
  /*  Scanner scanner = new Scanner(System.in);
    int limite, numero, suma = 0;
    
    System.out.println("Ingrese un valor límite positivo:");
    limite = scanner.nextInt();
    
    while (suma < limite) {
      System.out.println("Ingrese un número:");
      numero = scanner.nextInt();
      suma += numero;
    }
    
    System.out.println("La suma de los números ingresados superó el límite de " + limite);
  }
  */
    
    /*public static void main(String[] args) {
        /*
        Realizar un método que pida dos números enteros positivos por teclado y muestre por pantalla
el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
        El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego
volver al menú. El método deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que,
si el usuario selecciona la opción 5, en vez de salir del programa directamente, se debe mostrar el
siguiente mensaje de confirmación: ¿Está seguro que desea salir (S/N)? Si el usuario selecciona
el carácter ‘S’ termina, caso contrario se vuelve a mostrar el menú.
        */
       /* Scanner leer = new Scanner(System.in);
        int num = 0;
        int num2;
        System.out.println("Ingrese dos numeros enteros");
      do{
          System.out.println("MENU");
          System.out.println("1. Sumar");
          System.out.println("2. Restar");
          System.out.println("3. Multiplicar");
          System.out.println("4. Dividir");
          System.out.println("5. Salir");
          System.out.println("Elija opcion:");
          num = leer.nextInt();
         switch(num){
              case 1:{ System.out.println("Realice una suma:");
              num = leer.nextInt();
              num2 = leer.nextInt();
                  System.out.println("Resultado de la suma: "+ (num + num2));
                  System.out.println("¿Desea volver al menu? Si: 0 y No: 5");
                  num = leer.nextInt();
                  break;}
              case 2:{ System.out.println("Realice una resta:");
              num = leer.nextInt();
              num2 = leer.nextInt();
                  System.out.println("Resultado de la resta: "+ (num - num2));
                  System.out.println("¿Desea volver al menu? Si: 0 y No: 5");
                  num = leer.nextInt();
                  break;}
              case 3:{ System.out.println("Realice una multiplicacion:");
              num = leer.nextInt();
              num2 = leer.nextInt();
                  System.out.println("Resultado de la multiplicacion: "+ (num * num2));
                  System.out.println("¿Desea volver al menu? Si: 0 y No: 5");
                  num = leer.nextInt();
                  break;}
              case 4:{ System.out.println("Realice una division:");
              num = leer.nextInt();
              num2 = leer.nextInt();
                  System.out.println("Resultado de la division: "+ (num / num2));
                  System.out.println("¿Desea volver al menu? Si: 0 y No: 5");
                  num = leer.nextInt();
                  break;}
              default:{System.out.println("Ingrese un valor correcto");}
         }
          
      }while(num <= 4 && num >=0 ); 
      
      
      */
   /* public static void main(String[] args) {
        /*
        Escriba un método que lea 20 números. Si el número leído es igual a cero se debe sa
bucle y mostrar el mensaje "Se capturó el número cero". El método deberá calcular y mostrar ellir del
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. Nota:
recordar el uso de la sentencia break.
        */
 /*Scanner leer = new Scanner(System.in);
    int numero;
    int suma = 0;
    
    for (int i = 0; i < 20; i++) {
      System.out.println("Ingrese el número " + (i+1) + ":");
      numero = scanner.nextInt();
      
      if (numero == 0) {
        System.out.println("Se capturó el número cero");
        break;
      }
      
      if (numero > 0) {
        suma= suma + numero;
      }
    }
    
    System.out.println("La suma de los números ingresados es: " + suma);
  */
   /*public static void main(String[] args) {
        /*
        Escribir un método que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato fijo:
tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial
“&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, que
no respete el formato se considera incorrecta. Al finalizar el proceso, se imprime un informe
indicando la cantidad de lecturas correctas e incorrectas recibidas. Para resolver el ejercicio deberá
investigar cómo se utilizan los siguientes métodos de la clase String: Substring(), Length(),
equals().
        */
       /* Scanner leer = new Scanner(System.in);
        int correctas = 0, incorrectas = 0;
       
        while (true) {
            System.out.print("Ingrese una cadena (&&&&& para finalizar): ");
            String cadena = leer.nextLine();

            if (cadena.equals("&&&&&")) {
                break;
            }

            if (cadena.length() == 5 && cadena.charAt(0) == 'X' && cadena.charAt(4) == 'O') {
                //tambien se puede utilizar el siguiente contador: correctas = correctas + 1
                correctas++;
            } else {
                //tambien se puede utilizar el siguiente contador: incorrectas = incorrectas + 1
                incorrectas++;
            }
        }

        System.out.println("Informe:");
        System.out.println("Lecturas correctas: " + correctas);
        System.out.println("Lecturas incorrectas: " + incorrectas);
    */
  /*  public static void main(String[] args) {
        /*
        Crear un método que dibuje un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
        */
       /* Scanner leer = new Scanner(System.in);
        int num;
        int i, j;
        System.out.println("Ingrese un numero para un crear un cuadrado");
        num = leer.nextInt();
        for (i = 1; i <= num; i++) { // recorre las filas
        for (j = 1; j <= num; j++) { // recorre las columnas
            if (i == 1 || i == num || j == 1 || j == num) { // si está en el borde del cuadrado
                System.out.print("* "); // imprime un asterisco
            } else { // si no está en el borde
                System.out.print("  "); // imprime un espacio en blanco
            }
        }
        System.out.println(); // salto de línea al final de cada fila
    }
         
   */ 
    public static void main(String[] args) {
        /*
        Realizar un método que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
        */
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[4];
        
        // Lee los cuatro números del usuario
        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese un número entre 1 y 20: ");
            numeros[i] = scanner.nextInt();
            while (numeros[i] < 1 || numeros[i] > 20) {
                System.out.print("Número inválido. Ingrese un número entre 1 y 20: ");
                numeros[i] = scanner.nextInt();
            }
        }
        
        // Imprime los números y los asteriscos
        for (int i = 0; i < 4; i++) {
            System.out.print(numeros[i] + " ");
            for (int j = 0; j < numeros[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
    

        
    








    




