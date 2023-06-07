package logica;
public class Dulces {
    private Categoria categoria;
    private String nombre;
    private String codigo;
    private String precio;
    
    // Constructor de la clase
    public Dulces(Categoria categoria, String nombre, String codigo, String precio) {
        this.categoria = categoria;
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }
    
    // Getters y Setters
    public Categoria getCategoria() {
        return categoria;
    }
    
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getPrecio() {
        return precio;
    }
    
    public void setPrecio(String precio) {
        this.precio = precio;
    }
}