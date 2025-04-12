import java.util.Scanner;
public class OperacionesBasicas {
    public static void main(String[] args) {
        Scanner  entrada= new Scanner(System.in);
        
        System.out.println("porfavor ingrese el numero que quiera");
        double num1 = entrada.nextDouble();
        
        System.out.println("porfavor introduce tu segundo numero");
        double num2= entrada.nextDouble();
        
        
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double divicion = num1 / num2;
        double modulo = num1 % num2;
        
        
        System.out.println("La suma es : " + suma);
        System.out.println("La resta es :" + resta);
        System.out.println("la multiplicacion es :" + multiplicacion);
        System.out.println("la division es :" + divicion);
        System.out.println("el modulo es es :" + modulo);
    }
}
