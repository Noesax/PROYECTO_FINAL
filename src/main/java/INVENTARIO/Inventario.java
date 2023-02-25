
package INVENTARIO;

import java.util.Date;

public class Inventario {
    
     private String nombre;
     private String tipo;
     private Date fecha;
     private int codigo;
     private double precioUnidad;
     private int cantidad;

    public Inventario() {
        fecha = new Date();
    }

    public Inventario(String nombre, String tipo, Date fecha, int codigo, double precioUnidad, int cantidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.fecha = fecha;
        this.codigo = codigo;
        this.precioUnidad = precioUnidad;
        this.cantidad = cantidad;
    }
    
    public String print(){
    
        String salida = "Codigo: "+getCodigo()+"Nombre: "+getNombre()
                +"\nTipo: "+getTipo()+"Precio unitario: "
                +getPrecioUnidad()+"Cantidad: "+getCantidad()
                +"\nFecha de llegada: "+fecha;
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
                
}
