package Utilis;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public String nameClient;
    public String idClient;
    public String phoneClient;
    public String direction;
    public boolean statusCuent;
    List<Articulo> articulos;
    List<Articulo> historials;

    public Cliente(String name, String id, String phone, String dir, boolean vip) {

        this.nameClient = name;
        this.idClient = id;
        this.phoneClient = phone;
        this.direction = dir;
        this.statusCuent = vip;
        this.articulos = new ArrayList<Articulo>();
        this.historials = new ArrayList<Articulo>();
    }
    public String saludo(){
        String saludo = "Hola mi nombre es "+ this.nameClient + "! y estoy buscando un articulo.";
        return saludo;
    }
    public void asignar_articulo(Articulo nuevo_articulo){
        nuevo_articulo.mi_carrito = this;
        this.articulos.add(nuevo_articulo);
    }
    public void asignar_articulo_historial(Articulo nuevo_historial){
        nuevo_historial.mi_historial = this;
        this.historials.add(nuevo_historial);
    }
    public void impresion_carrito(){
        short i = 1;

        System.out.println("id     Articulo       Descripcion                Cantidad     Precio por unidad       Precio total");
        System.out.println("____________________________________________________________________________________________");

        for (Articulo c: this.articulos){
            System.out.println(c.idArt+"   "+c.nameArt+"    "+c.descriptionArt+"   "+c.cantArt+"           $"+c.priceArt+"               $"+((c.cantArt)*(c.priceArt)));
            i += 1;
        }

    }
    public void impresion_historial(){
        short i = 1;
        int semAle = (int)(Math.random()*5+1);
        System.out.println("--Compras de hoy: ");
        impresion_carrito();

        System.out.println("--Compras de hace "+semAle+" Semanas:");
        for (Articulo h: this.historials){
            System.out.println(h.idArt+"   "+h.nameArt+"    "+h.descriptionArt+"   "+h.cantArt+"           $"+h.priceArt+"               $"+((h.cantArt)*(h.priceArt)));

        }
        System.out.println("____________________________________________________________________________________________\n");

    }
    public void verificacion(){
        //Suma de los articulos
        short i = 1;
        double Suma = 0;
        for (Articulo c: this.articulos){
            Suma += c.priceArt;
            i += 1;
        }

        //Verificacion de cuenta VIP
        if (this.statusCuent) {
            double Desc = Suma*(0.2);
            System.out.println("--------------------------------------------------------------------------------------------");
            System.out.println("                                                                           Sub Total: $"+String.format("%.2f",Suma)); //Es VIP
            System.out.println("                                                                       Descuento VIP: $"+String.format("%.2f",Desc)+" %20 VIP"); //Es VIP
            System.out.println("                                                                 Descuento VIP Total: $"+String.format("%.2f", (Suma-Desc)));
            System.out.println("                                                                               Total: $"+String.format("%.2f", (((Suma-Desc)*0.15)+Suma))+" +15% ISV");
        }else{
            System.out.println("                                                                           Sub total: $"+String.format("%.2f",Suma)); //Es VIP
            System.out.println("                                                                               Total: $"+String.format("%.2f", (((Suma)*0.15)+Suma))+" +15% ISV");
        }

    }


}