import java.util.Scanner;
 class Main2 {
               public static void main(String[] args) {
               
               Scanner scanner= new Scanner(System.in);
               // solicitamos el nombre
               System.out.print("ingresa tu nombre:");
               String nombre= scanner.nextLine();
               
               //luego solicitamos la edad
               System.out.print("ingresa tu edad porfavor:");
                int edad = scanner.nextInt();
              scanner.nextLine(); //ahora vamos a limpiar el buffer del scanner
             
              //solicitamos el correo
              System.out.print("ingresa tu correo");
                String correo  = scanner.nextLine();
            
             System.out.println("\n---datos ingresados---");
                  System.out.println("nombre:"+ nombre);
                  System.out.println("edad:"+ edad);
               System.out.println("correo:"+ correo);
                   
                   scanner.close();
                      
                         
          }
 }
