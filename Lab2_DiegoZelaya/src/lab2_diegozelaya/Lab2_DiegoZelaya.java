
package lab2_diegozelaya;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2_DiegoZelaya {
    
    static Scanner scanner=new Scanner (System.in);

    public static void main(String[] args) {
        ArrayList detectives=new ArrayList();
        ArrayList casos=new ArrayList();
        
        int opcion=0;
        while (opcion!=10){
            System.out.print("1. Agregar Detectives \n2. Eliminar Detectives \n3. Modificar Detectives \n4. Listar Detectives \n5. Registrar Casos \n6. Modificar Casos \n7. Listar Casos \n8. Listar Casos Resueltos \n9. Listar Casos Pendientes \n10. Salir \nIngrese la opcion: ");
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
                    detectives.set(m,new Detectives(no,e,na,a,ni));
                    System.out.println("Posicion "+m+" fue modificada!");
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
                System.out.println("Detectives \n"+salida);
            }//Listar Detectives
            if (opcion==5){
                System.out.print("Lugar: ");
                String l=scanner.next();
                System.out.print("Descripcion: ");
                String d=scanner.next();
                int t1=0;
                String t="";
                while (t1<1 || t1>3){
                    System.out.print("Tipo (1. Homicidio, 2. Robo, 3. Secuestro): ");
                    t1=scanner.nextInt();
                    if (t1==1){
                        t="Homicidio";
                    } else {
                        if (t1==2){
                            t="Robo";
                        } else {
                            if (t1==3){
                                t="Secuestro";
                            } else {
                                System.out.println("Debe ingresar 1, 2 o 3");
                            }//Error si no ingreso las opciones
                        }//Secuestro si ingreso 3
                    }//Robo si ingreso 2
                }//Homicidio si ingreso 1
                System.out.print("Detective a cargo: ");
                String c=scanner.next();
                int e1=0;
                String e="";
                while (e1!=1 && e1!=2){
                    System.out.print("Estado (1. En proceso, 2. Resuelto): ");
                    e1=scanner.nextInt();
                    if (e1==1){
                        e="En proceso";
                    } else {
                        if (e1==2){
                            e="Resuelto";
                        } else {
                            System.out.println("Debe ingresar 1 o 2");
                        }//Error si no ingreso las opciones
                    }//Resuelto si ingresa 2
                }//En proceso si ingresa 1
                casos.add(new Casos(l,d,t,c,e));
            }//Registrar Casos
            if (opcion==6){
                System.out.print("Ingrese la posicion a modificar: ");
                int m=scanner.nextInt();
                if (m>=0 && m<detectives.size()){
                    System.out.print("Lugar: ");
                    String l=scanner.next();
                    System.out.print("Descripcion: ");
                    String d=scanner.next();
                    int t1=0;
                    String t="";
                    while (t1<1 || t1>3){
                        System.out.print("Tipo (1. Homicidio, 2. Robo, 3. Secuestro): ");
                        t1=scanner.nextInt();
                        if (t1==1){
                            t="Homicidio";
                        } else {
                            if (t1==2){
                                t="Robo";
                            } else {
                                if (t1==3){
                                    t="Secuestro";
                                } else {
                                    System.out.println("Debe ingresar 1, 2 o 3");
                                }//Error si no ingreso las opciones
                            }//Secuestro si ingreso 3
                        }//Robo si ingreso 2
                    }//Homicidio si ingreso 1
                    System.out.print("Detective a cargo: ");
                    String c=scanner.next();
                    int e1=0;
                    String e="";
                    while (e1!=1 && e1!=2){
                        System.out.print("Estado (1. En proceso, 2. Resuelto): ");
                        e1=scanner.nextInt();
                        if (e1==1){
                            e="En proceso";
                        } else {
                            if (e1==2){
                                e="Resuelto";
                            } else {
                                System.out.println("Debe ingresar 1 o 2");
                            }//Error si no ingreso las opciones
                        }//Resuelto si ingresa 2
                    }//En proceso si ingresa 1
                    casos.set(m,new Casos(l,d,t,c,e));
                    System.out.println("Posicion "+m+" fue modificada!");
                } else {
                    System.out.println("Posicion "+m+" no existe...");
                }//Verifica que la posicion existe
            }//Modificar Casos
            if (opcion==7){
                String salida="";
                for (Object i : casos){
                    if (casos.contains("Homicidio")){
                        salida+=""+casos.indexOf(i)+". "+i+"\n";
                    }
                }
                salida+="\n";
                System.out.println("Casos: \n"+salida);
            }//Listar Casos
            System.out.println();
        }//Fin while
    }
    
}
