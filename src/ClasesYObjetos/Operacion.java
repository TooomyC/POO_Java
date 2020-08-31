package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Operacion {
    //ATRIBUTOS
    //int suma, resta, mult, div;
   
    //METODOS
    //Metodo para pedirle al usuario que ingrese los numeros.
    public void leerNumeros(){
       
    }
    //Metodo para sumar dos numeros.
    public int  sumar(int num1, int num2){
       int suma = num1 + num2;
       return suma;
    }
    
    public int restar(int num1, int num2){
       int resta = num1 - num2;
       return resta;
    }
    
    public int mult(int num1, int num2){
        int mult = num1 * num2;
        return mult;
    }
    
    public int dividir(int num1, int num2){
        int div = num1 / num2;
        return div;
    }
    
    public void mostrarRes(int suma, int resta, int mult, int div){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+mult);
        System.out.println("La division es: "+div);
    }
}
