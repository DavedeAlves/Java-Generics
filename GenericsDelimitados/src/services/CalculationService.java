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
public class CalculationService{
    
    public static <T extends Comparable<T>> T max(List<T> list){
        if(list.isEmpty()){
            throw new IllegalStateException("List can't be empty");
        }
        T max = list.get(0);
        for(T item : list){
            if(item.compareTo(max) > 0){
                max = item;
            }
        }
        return max;
    }
            
}
