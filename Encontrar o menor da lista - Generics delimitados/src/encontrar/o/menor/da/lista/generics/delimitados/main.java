/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encontrar.o.menor.da.lista.generics.delimitados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Davede faiska
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        List<Double> list = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextDouble());
        }
        double min = menor(list);
       
        System.out.println("smallest number");
        System.out.println(String.format("%.2f", min));

        
        sc.close();
    }
    
    public static <T extends Comparable <T>> T menor(List<T> list){
        if(list.isEmpty()){
            throw new IllegalStateException("List is empty");
        }
        T min = list.get(0);
        for(T item : list){
            if(item.compareTo(min) < 0){
                min = item;
            }
        }
        return min;
    }
}
