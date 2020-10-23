
package lab2_diegozelaya;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2_DiegoZelaya {
    
    static Scanner scanner=new Scanner (System.in);

    public static void main(String[] args) {
        ArrayList detectives=new ArrayList();
        
        int opcion=0;
        while (opcion!=11){
            System.out.print("1. Agregar Detectives \n2. Eliminar Detectives \n3. Modificar Detectives \n4. Listar Detectives \n5. Registrar Casos \n6. Modificar Casos \n7. Listar Casos \n8. Listar Casos \n9. Listar Casos Resueltos \n10. Listar Casos Pendientes \n11. Salir \nIngrese la opcion: ");
            opcion=scanner.nextInt();
            if (opcion==1){
                System.out.print("Nombre: ");
                String no=scanner.next();
                System.out.print("Edad: ");
                int e=scanner.nextInt();
                System.out.print("Nacionalidad: ");
                String na=scanner.next();
                System.out.print("Años Laborales: ");
                int a=scanner.nextInt();
                int ni=0;
                while (ni<1 || ni>10){
                    System.out.print("Nivel (1 a 10): ");
                    ni=scanner.nextInt();
                    if (ni<1 || ni>10){
                        System.out.println("Debe ingresar un valor entre 1 y 10");
                    }//Error si ingresa un numero menor a 1 o mayor a 10
                }//Validar que el usuario ingreso un numero de 1 al 10
                detectives.add(new Detectives(no,e,na,a,ni));
            }//Agregar Detectives
            if (opcion==2){
                System.out.print("Ingrese la posicion a eliminar: ");
                int e=scanner.nextInt();
                if (e>=0 && e<detectives.size()){
                    detectives.remove(e);
                    System.out.println("Posicion "+e+" eliminado con exito!");
                } else {
                    System.out.println("Posicion "+e+" no existe...");
                }//Verifica que la posicion existe
            }//Eliminar Detectives
            if (opcion==3){
                System.out.print("Ingrese la posicion a modificar: ");
                int m=scanner.nextInt();
                if (m>=0 && m<detectives.size()){
                    int m2=0;
                    while (m2<1 || m2>5){
                        System.out.println("Que desea modificar? \n1.Nombre \n2. Edad \n3. Nacionalidad \n4. Años Laborales \n5. Nivel");
                        m2=scanner.nextInt();
                        if (m2==1){
                            System.out.print("Nombre: ");
                            String no=scanner.next();
                        }//Modifica Nombre
                        if (m2==2){
                            System.out.print("Edad: ");
                            int e=scanner.nextInt();
                        }//Modifica Edad
                        if (m2==3){
                            System.out.print("Nacionalidad: ");
                            String na=scanner.next();
                        }//Modifica Nacionalidad
                        if (m2==4){
                            System.out.print("Años Laborales: ");
                            int a=scanner.nextInt();
                        }//Modifica Años
                        if (m2==5){
                            int ni=0;
                            while (ni<1 || ni>10){
                                System.out.print("Nivel (1 a 10): ");
                                ni=scanner.nextInt();
                                if (ni<1 || ni>10){
                                    System.out.println("Debe ingresar un valor entre 1 y 10");
                                }//Error si ingresa un numero menor a 1 o mayor a 10
                            }//Validar que el usuario ingreso un numero de 1 al 10
                        }//Modificar Nivel
                        if (m2>=1 && m2<=5){
                            System.out.println("Posicion "+m2+" modificado con exito!");
                        } else {
                            System.out.println("Posicion "+m2+" no existe...");
                        }//Envia mensaje si eligio un numero entre 1 y 10
                    }//Verifica que el usuario cambie una de las opciones
                } else {
                    System.out.println("Posicion "+m+" no existe...");
                }//Verifica que la posicion existe
            }//Modificar Detectives
            if (opcion==4){
                String salida="";
                for (Object i : detectives){
                    salida+=""+detectives.indexOf(i)+". "+i+"\n";
                }
                salida+="\n";
                System.out.println("Grano \n"+salida);
            }//Listar Detectives
            if (opcion==5){
                
            }//Registrar Casos
            System.out.println();
        }//Fin while
    }
    
}
