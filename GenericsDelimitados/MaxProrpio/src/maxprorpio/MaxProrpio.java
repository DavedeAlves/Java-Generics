/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maxprorpio;

import entities.Caculator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import services.SeviceCalculo;

/**
 *
 * @author Davede faiska
 */
public class MaxProrpio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        List<Caculator> list = new ArrayList<>();
        
        System.out.print("Quantos numeros voce vai comparar: ");
        int qtdnumeros = sc.nextInt();
        
        for (int i = 1; i <= qtdnumeros; i++) {
            System.out.print("Digite o #"+i+" numero: ");
            double numero = sc.nextDouble();
            
            list.add(new Caculator(numero));
        }
        
        Caculator c = SeviceCalculo.max(list);
        
        System.out.println(c);
        
        
        sc.close();
    }
    
    
    
}
