package com.techlab.articulo.model;

// CLASE ABSTRACTA ARTICULO
public abstract class Articulo extends Object {

    private int codigo;
    private String nombre;
    private double precio;
    private Categoria categoria;

    //Constructor de la clase padre.
  
    //Las clases hijas usarán super(...) para inicializar estos atributos comunes.
  
    public Articulo(int codigo, String nombre, double precio, Categoria categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    // Método abstracto.
     //Obliga a cada clase hija o subclase a decir qué tipo de artículo es.
    
     public abstract String getTipoArticulo();

    //Método abstracto.
  
     //Obliga a cada subclase a devolver su detalle específico.
     //Esto sirve para no meter toda la lógica en la clase padre.

    public abstract String getDetalleEspecifico();

    /*
     * toString()
     * --------------------------------------------------
     * Muestra un objeto de manera legible
     * Aprovecha datos comunes
     * Aprovecha datos específicos de cada subclase.
     * Eso es polimorfismo.
     * Es la capacidad de un mismo methodo (toString()) de comportarse de manera diferente según la clase que lo implemente.
     * poli muchos
     * morfismo formas
     */
    @Override
    public String toString() {
        return "Artículo {" +
                "código=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", categoría='" + categoria.getNombre() + '\'' +
                ", tipo='" + this.getTipoArticulo() + '\'' +
                ", detalle='" + this.getDetalleEspecifico() + '\'' +
                '}';
    }
}
