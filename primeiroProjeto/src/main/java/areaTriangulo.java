
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class areaTriangulo {
     public static void main(String[] args){
        
        //Scanner usado na leitura de entrada de varias fontes, usado para ler uma string.
        Scanner ler = new Scanner(System.in);
        
        double altura, base, area, areaMetros;
        
        System.out.print("Informe a altura do triângulo em cm: ");
        altura = ler.nextDouble();
        
        System.out.print("Informe a base do triângulo em cm: ");
        base = ler.nextDouble();
        
        area = ((base * altura) /2);
        
        areaMetros = (area / 100);
        
        System.out.println("A área do triângulo é " + area + "centímetros");
        System.out.println("A área do triângulo é " + areaMetros + " metros'");
        
        if (area > 10){
            System.out.println("Hello World!");
        } else {
            System.out.println("...");
        }
    }
}
