
package lab2_diegozelaya;

public class Detectives {
    private String nombre;
    private int edad;
    private String nacionalidad;
    private int años;
    private int nivel;
    
    public Detectives(){}
    
    public Detectives(String no){
        nombre=no;
    }
    
    public Detectives(String no, int e, String na, int a, int ni){
        nombre=no;
        edad=e;
        nacionalidad=na;
        años=a;
        nivel=ni;
    }
    
    public void setNombre(String no){
        nombre=no;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setEdad(int e){
        edad=e;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setNacionalidad(String na){
        nacionalidad=na;
    }
    
    public String getNacionalidad(){
        return nacionalidad;
    }
    
    public void setAños(int a){
        años=a;
    }
    
    public int getAños(){
        return años;
    }
    
    public void setNivel(int ni){
        nivel=ni;
    }
    
    public int getNivel(){
        return nivel;
    }
}
