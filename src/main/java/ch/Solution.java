package ch;

public class Solution {

    public static int solution(String binaryString) {

        /**
         * Este método calcula el número mínimo de operaciones necesarias 
         * para reducir a 0, la representación binaria de un número.
         * Primero, determina si existe una primer ocurrencia de la substring "1", 
         * dentro de la variable que se le pasa por parámetro. De ser así, reemplaza
         * los "0" por strings vacías, y luego determina la longitud de la variable.
         * A continuación, le suma la longitud de la misma variable luego de haberle restado
         * el primer índice donde apareció la substring, menos 1.
         * Investigué mucho la solución porque al principio pensé que sólo se podía 
         * determinar el número mínimo de operaciones transformando la representación
         * binaria a un número, para luego determinar si era par o impar. 
         * Pero me dí cuenta de que ese de 1 repetido 400000 veces no entra en ninguno.
         * 
         */

        int operationCount = 0;

        int index = binaryString.indexOf("1");

        if (index == -1) {

            operationCount = 0;

            return operationCount;

        } else {

            operationCount = binaryString.replace("0", "").length() + binaryString.length() - index - 1;

            return operationCount;
        }

    }

    

    

}

