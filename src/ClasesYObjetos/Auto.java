package ClasesYObjetos;

public class Auto {
    //ATRIBUTOS
    String color;
    String marca;
    int km;
    
    //METODO
    public static void main(String[] args){
        Auto auto1 = new Auto(); //CONSTRUCTOR
        
        auto1.color = "Blanco";
        auto1.marca = "Audi";
        auto1.km = 0;
        
        System.out.println("El color del auto 1 es: "+auto1.color);
        System.out.println("La marca del auto 1 es: "+auto1.marca);
        System.out.println("Los kilometros del auto 1 es: "+auto1.km);
        
        Auto auto2 = new Auto(); //CONSTRUCTOR
        
        auto2.color = "Rojo";
        auto2.marca = "Ferrari";
        auto2.km = 5186;
        
        System.out.println("\nEl color del auto 1 es: "+auto2.color);
        System.out.println("La marca del auto 1 es: "+auto2.marca);
        System.out.println("Los kilometros del auto 1 es: "+auto2.km);
        
        
    }
}
