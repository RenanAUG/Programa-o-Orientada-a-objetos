/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiroprojeto;

import java.util.Scanner;

/**
 *
 * @author aluno
 */

public class PrimeiroProjeto {
    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
        
        int altura, base, area;
        
        System.out.print("Informe a altura do triângulo em cm: ");
        altura = ler.nextInt();
        
        System.out.print("Informe a base do triângulo em cm: ");
        base = ler.nextInt();
        
        area = base * altura /2;
        
        System.out.println("A área do triângulho é" + area + "centímetros");
    }
}
