/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.util.List;

/**
 *
 * @author Davede faiska
 */
public class SeviceCalculo {
    
    public static <T extends Comparable<T>> T max(List<T> list){
        if(list.isEmpty()){
            throw new IllegalStateException("A lista esta vazia!");
        }
        T max = list.get(0);
        for(T l : list){
            if(l.compareTo(max) > 0){
                max = l;
            }
        }
        return max;
    }
    
}
