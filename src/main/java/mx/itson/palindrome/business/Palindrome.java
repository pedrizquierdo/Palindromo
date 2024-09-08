/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.palindrome.business;

/**
 *
 * @author pedrizquierdo
 */
public class Palindrome {
    
    /**
     * Evalúa si una frase es un palíndromo, ignorando espacios y puntuaciones.
     * @param phrase frase a evaluar
     * @return true si la frase es un palíndromo, falso de otra forma
     */
    public boolean isPalindrome(String phrase) {
        try{
    String cleanPhrase = phrase.replace(" ", "").replace("!", "").replace("¡", "").replace(",", "").replace(".", "").replace("¿", "").replace("?", "").toLowerCase();
    String reversedPhrase = "";
    for (int i = 0; i < cleanPhrase.length(); i++) {
        reversedPhrase = cleanPhrase.charAt(i) + reversedPhrase;
    }
    return cleanPhrase.equals(reversedPhrase);
        }catch(Exception ex){
            System.err.println("Ocurrió un error inesperado: " + ex.getMessage());
            return false;
        }
    }
          
    /**
     * Suma dos números enteros.
     * @param a El primer valor a sumar.
     * @param b El segundo valor a sumar.
     * @return La suma de los dos valores.
     */
    public int sumar(int a, int b){
        try{
            return a+b;
    }catch(Exception ex){
            System.err.println("Ocurrio un error inesperado: " + ex.getMessage());
            return 0;
    }
}
}