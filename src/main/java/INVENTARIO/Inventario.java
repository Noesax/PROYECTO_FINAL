
package INVENTARIO;

import java.util.Date;

public class Inventario {
    
     private String nombre;
     private String tipo;
     private Date fecha;

    public Inventario() {
        fecha = new Date();
    }

    public Inventario(String nombre, String tipo, Date fecha) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.fecha = fecha;
    }
    
    public String print(){
    
        String salida = "Nombre: "+getNombre()+"\nTipo: "+getTipo()+"\nFecha de llegada: "+fecha;
        return salida;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
                
}
