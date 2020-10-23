
package lab2_diegozelaya;

public class Casos {
    private String lugar;
    private String descripcion;
    private String tipo;
    private String cargo;
    private String estado;
    
    public Casos(){}
    
    public Casos(String l){
        lugar=l;
    }
    
    public Casos(String l, String d, String t, String c, String e){
        lugar=l;
        descripcion=d;
        tipo=t;
        cargo=c;
        estado=e;
    }
    
    public void setLugar(String l){
        lugar=l;
    }
    
    public String getLugar(){
        return lugar;
    }
    
    public void setDescripcion(String d){
        descripcion=d;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setTipo(String t){
        tipo=t;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setCargo(String c){
        cargo=c;
    }
    
    public String getCargo(){
        return cargo;
    }
    
    public void setEstado(String e){
        estado=e;
    }
    
    public String getEstado(){
        return estado;
    }
    
    @Override
    public String toString(){
        return "Lugar: "+lugar+" - Descripcion: "+descripcion+" - Tipo: "+tipo+" - Detective a Cargo: "+cargo+" - Estado: "+estado;
    }
}
