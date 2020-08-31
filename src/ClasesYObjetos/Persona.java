package ClasesYObjetos;

public class Persona {
    //ATRIBUTOS
    String nombre;
    int edad;
    int dni;
    
    //METODOS
    public Persona(String nombre, int edad){ //METODO CONSTRUCTOR
        //nombre = _nombre;
        //edad = _edad;
        //Ó
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(int dni) {
        this.dni = dni;
    }
    
    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
        System.out.println("El DNI es: "+dni);
    }
    
    public void correr(){
        System.out.println("Soy "+nombre+", tengo "+edad+" años y estoy corriendo una maraton.");
    }
    
    public void correr(int km){
        System.out.println("He corrido "+km+" kilometros.");
    }
    
    
}
