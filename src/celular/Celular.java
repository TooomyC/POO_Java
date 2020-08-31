package celular;

import javax.swing.JOptionPane;

public class Celular {
    //ATRIBUTOS
    private String color, modelo, marca;
    
    //CONSTRUCTORES
    public Celular(String color, String modelo, String marca){
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
    }
    
    public Celular(){
        
    }
    
    //SETTERS   
    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    ///GETTERS
    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public String getColor(){
        return color;
    }
    
    ///METODOS
    public void llamar(String nombre){
        JOptionPane.showMessageDialog(null, "LLAMANDO A "+nombre+"...");
    }
    
    public int cortarLlamada(){
        return 0;
    }
    
    public void informarCaracteristicas(){
        JOptionPane.showMessageDialog(null, "Usted ha accedido al celular de la marca: "+marca);
        JOptionPane.showMessageDialog(null, "El respectivo modelo es: "+modelo+" en color: "+color);
    }
    
    //MAIN
    public static void main (String[] args){
        Celular celular1 = new Celular();
        Celular celular2 = new Celular("Iphone","XS Max","Negro");
        
        celular1.setColor("Gris");
        celular1.setMarca("Nokia");
        celular1.setModelo("1100");
        
        celular1.llamar("Pablo");
        celular1.cortarLlamada();
        
        System.out.println();
        
        celular1.informarCaracteristicas();
        celular2.informarCaracteristicas();
    }
    
}
