package com.redbee.clase5.ejercicios;

public class Calculadora {

    public static Integer calcular(String datoACalcular){
        int respuesta =0;
        if(datoACalcular == "" || datoACalcular == null){
            respuesta = 0;
        }else{
            if(datoACalcular.length() > 1) {
                var index =0;
                while (index < datoACalcular.length()-1) {
                    int valor = Character.getNumericValue(datoACalcular.charAt(index));
                    if(datoACalcular.charAt(index+1) == '+'){
                        valor+=Character.getNumericValue(datoACalcular.charAt(index+2));
                    }
                    if(datoACalcular.charAt(index+1) == '-'){
                        valor-=Character.getNumericValue(datoACalcular.charAt(index+2));
                    }
                    respuesta = valor;
                    index+=2;
                }
            }else {
                respuesta= Character.getNumericValue(datoACalcular.charAt(0));
            }
        }

        return respuesta;
    }
}
