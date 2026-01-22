/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package treinandogenericsdelimitades;

import entities.MediaUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Davede faiska
 */
public class TreinandoGenericsDelimitades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        List<Number> media = new ArrayList<>();
        
        System.out.print("Quantas notas voce vai adicionar? ");
        int qtdNotas = sc.nextInt();
        
        for (int i = 1; i <= qtdNotas; i++) {
            System.out.print("Digitte a #"+i+" nota: ");
            double nota = sc.nextDouble();
            media.add(nota);
            
        }
        
        System.out.println(MediaUtil.calcularMedia(media));
        
        sc.close();
    }
    

        
    
}
