package Utilis;

public class Articulo {
    public String nameArt;
    public String idArt;
    public String descriptionArt;
    public int cantArt;
    public double priceArt;
    Cliente mi_carrito;
    Cliente mi_historial;
    Asistente mi_asistencia;
    Asistente mi_asistencia_as;

    public Articulo(String name, String id, String description, int cant, double price){

        this.nameArt = name;
        this.idArt = id;
        this.descriptionArt = description;
        this.cantArt = cant;
        this.priceArt = price;
    }
}
