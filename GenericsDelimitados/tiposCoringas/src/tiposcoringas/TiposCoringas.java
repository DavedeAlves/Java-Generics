/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposcoringas;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Davede faiska
 */
public class TiposCoringas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);
    }
    
    public static void printList(List<?> list){
        for(Object obj : list){
            System.out.println(obj);
        }
    }
    
}
