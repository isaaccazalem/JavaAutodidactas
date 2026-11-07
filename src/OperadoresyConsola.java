import java.util.Scanner;

public class OperadoresyConsola {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            //Reto 3.1: Pide dos números y muestra suma, resta, multiplicación y división (con decimales).
            System.out.print("Dame el primer numero: ");
            double numero1 = sc.nextDouble();

            System.out.print("Dame el segundo numero: ");
            double numero2 = sc.nextDouble();

            System.out.println("Suma: " + (numero1 + numero2));
            System.out.println("Resta: " + (numero1 - numero2));
            System.out.println("Multiplicación: " + (numero1 * numero2));
            System.out.println("División: " + (numero1 / numero2));
            System.out.println("Módulo: " + (numero1 % numero2));

            //Reto 3.2: Pide un precio y aplica un 16 % de IVA. Muestra el total.
            System.out.print("Dame Precio: ");
            double precio = sc.nextDouble();

            double iva = precio * 0.16;
            System.out.println("Precio: " + (precio + iva));

            System.out.print("Dame una edad: ");
            int edad = sc.nextInt();

            boolean esMayorDeEdad = edad >= 18;
            System.out.println(esMayorDeEdad);

            System.out.print("Ingresa los grados Celsius: ");
            double celsius = sc.nextDouble();

            double fahrenheit = celsius * 9 / 5 + 32;

            System.out.println(celsius + "°C son " + fahrenheit + "°F");


            sc.close();
        }
}
