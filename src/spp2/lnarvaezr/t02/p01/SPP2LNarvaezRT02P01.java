/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.lnarvaezr.t02.p01;
import java.util.Scanner;
/**
 *
 * @author Vianey_Narváez
 */
public class SPP2LNarvaezRT02P01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int opEntrada;
    Scanner teclado = new Scanner(System.in);
    int sue, cate, he, sueldo, se;
    
    System.out.println("Sueldos");
    System.out.println("Inserte su categoria");
    System.out.println("1. Usted es un trabajador categoria 1");
    System.out.println("2. Usted es un trabajador categoria 2");
    System.out.println("3. Usted es un trabajador categoria 3");
    System.out.println("4. Usted es un trabajador categoria 4");
    System.out.println("5. Usted es un trabajador categoria 5");
    System.out.println("6. Usted es un trabajador categoria 6");
    System.out.println("7. Usted es un trabajador categoria 7");
    System.out.println("8. Usted es un trabajador categoria 8");
    opEntrada = teclado.nextInt();
    if(opEntrada>=1 && opEntrada<=8){
    switch (opEntrada){
            case 1:
                System.out.println("Usted es categoria 1");
                sueldo = pedirSueldo();
                he = horasExtra();
                se = he*30;
                System.out.println("El total de su sueldo es " +(sueldo+se));
                break;
            case 2:
                System.out.println("Usted es categoria 2");
                sueldo = pedirSueldo();
                he = horasExtra();
                se = he*38;
                System.out.println("El total de su sueldo es " +(sueldo+se));
                break;
                
            case 3:
                System.out.println("Usted es categoria 3");
                sueldo = pedirSueldo();
                he = horasExtra();
                se = he*50;
                System.out.println("El total de su sueldo es " +(sueldo+se));
                break;
                
            case 4:
                System.out.println("Usted es categoria 4");
                sueldo = pedirSueldo();
                he = horasExtra();
                se = he*70;
                System.out.println("El total de su sueldo es " +(sueldo+se));
                break;
                
            case 5:
                System.out.println("Usted es categoria 5");
                sueldo = pedirSueldo();
                he = horasExtra();
                se = he*90;
                System.out.println("El total de su sueldo es " +(sueldo+se));
                break;
                
            case 6:
                System.out.println("Usted es categoria 6");
                sueldo = pedirSueldo();
                he = horasExtra();
                se = he*120;
                System.out.println("El total de su sueldo es " +(sueldo+se));
                break;
                
            case 7:
                System.out.println("Usted es categoria 7");
                sueldo = pedirSueldo();
                he = horasExtra();
                se = he*150;
                System.out.println("El total de su sueldo es " +(sueldo+se));
                break;
                
            case 8:
                System.out.println("Usted es categoria 4");
                sueldo = pedirSueldo();
                he = horasExtra();
                se = he*70;
                System.out.println("El total de su sueldo es " +(sueldo+se));
                break;
                
    }
    }
    else{
            System.out.print("El numero no esta en el rango");
            }
    }
    
    static int pedirSueldo(){
        Scanner teclado = new Scanner(System.in);
        int sueldo;
        System.out.println("Inserte su sueldo base");
        sueldo = teclado.nextInt();
        return sueldo;
                }
    static int horasExtra(){
        Scanner teclado = new Scanner(System.in);
        int he;
        System.out.println("Inserte las horas extra que trabajó");
        he = teclado.nextInt();
        return he; 
    }
    }
                
   
    

