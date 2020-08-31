package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String [] args){
    /**
        int n1, n2;
        
       n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un primer numero: "));
       n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un segundo numero: "));
    
       Operacion op = new Operacion();
       
       int suma = op.sumar(n1,n2);
       int resta = op.restar(n1, n2);
       int mult = op.mult(n1,n2);
       int div = op.dividir(n1,n2);
       
       op.mostrarRes(suma, resta, mult, div);
    **/
    
        Persona p1 = new Persona("Tomas", 21);
        p1.correr();
        
        Persona p2 = new Persona(1213515);
        p2.correr(100);
        
        
    }
}
