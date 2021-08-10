package com.redbee.clase5.ejercicios;

import java.util.ArrayList;
import java.util.List;


public class NumeroRomano {

    public static Integer calcularRomanosSuma (String romano){
        return listaNumRomanos(romano)
                .stream()
                .mapToInt(Integer::intValue)
                .sum();

    }

    private static List<Integer> listaNumRomanos(String romanos){
        List<Integer> listaRomana = new ArrayList<>();
        for(int i =0 ; i < romanos.length(); i++){
            if(romanos.charAt(i) == 'I'){
                agregarElementoAlInicio(listaRomana,1);
            }
            if(romanos.charAt(i) == 'V'){
                agregarElementoAlInicio(listaRomana,5);
            }
            if(romanos.charAt(i) == 'X'){
                agregarElementoAlInicio(listaRomana,10);
            }
            if(romanos.charAt(i) == 'L'){
                agregarElementoAlInicio(listaRomana,50);}
            if(romanos.charAt(i) == 'C'){
                agregarElementoAlInicio(listaRomana,100);
            }
            if(romanos.charAt(i) == 'D'){
                agregarElementoAlInicio(listaRomana,500);}
            if(romanos.charAt(i) == 'M'){
                agregarElementoAlInicio(listaRomana,1000);
            }
        }
        return listaRomana;
    }

    public static Integer calcularCombinadoRomanos(String romanos){
        List<Integer>decimalesDeRomanos = listaNumRomanos(romanos);
        int sumatoria=0;
        if(decimalesDeRomanos == null){
            return sumatoria;
        }else {
            int index = 0;
            sumatoria = decimalesDeRomanos.get(index);
            while (index < decimalesDeRomanos.size()-2) {
                if(decimalesDeRomanos.get(index+1) < decimalesDeRomanos.get(index+2)){
                    sumatoria += (decimalesDeRomanos.get(index+2) - decimalesDeRomanos.get(index+1));
                }
                index+=2;
            }
        }

        return sumatoria;
    }

    private static List<Integer> agregarElementoAlInicio(List<Integer> listaNum,Integer numero) {
        int contador = 0;
        while (contador < listaNum.size()) {
            if (listaNum.get(contador) == null) {
                listaNum.remove(contador);
            }
            contador++;
        }
        listaNum.add(0, numero);
        return listaNum;
    }
}
