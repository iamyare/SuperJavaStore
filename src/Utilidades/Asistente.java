package Utilidades;

import Utilidades.Cliente;
import java.util.ArrayList;
import java.util.List;

public class Asistente {
   public String nameAsistent;
   public String idAsistent;
   public String phoneAsistent;
    List<Articulo> articulos;
    List<Articulo> historials;


   public Asistente(String name, String id, String phone){
        this.nameAsistent = name;
        this.idAsistent = id;
        this.phoneAsistent = phone;
       this.articulos = new ArrayList<Articulo>();
       this.historials = new ArrayList<Articulo>();

    }



    public String saludo(){
        String saludo = "Bienvenido a SuperJavaStore!. Mi nombre es "+ this.nameAsistent + "!\ny te ayudare con tu compra.\n";
        return saludo;
    }
    public void asignar_articulo_as(Articulo nuevo_articulo_as){
        nuevo_articulo_as.mi_asistencia = this;
        this.articulos.add(nuevo_articulo_as);
    }
    public void asistencia_historial(Articulo nuevo_historial_as){
        nuevo_historial_as.mi_asistencia_as = this;
        this.historials.add(nuevo_historial_as);
    }
    public void asistencia(){//Esto es lo que quiero conseguir pero solo se imprimen los  System.out.println
        short i = 1;

        System.out.println("id     Articulo       Descripcion                Cantidad     Precio por unidad       Precio total");
        System.out.println("____________________________________________________________________________________________");

        for (Articulo c: this.articulos){
            System.out.println(c.idArt+"   "+c.nameArt+"    "+c.descriptionArt+"   "+c.cantArt+"           $"+c.priceArt+"               $"+((c.cantArt)*(c.priceArt)));
            i += 1;
        }

    }

    public void asis(){ //En este caso solo se imprime 0.0, por lo que creo es que no se consigue los valores por falta del cliente, y la solucion que le veo seria crear el objeto aqui
        Cliente cliente1 = new Cliente("Juan Rodas", "0816198020021","3261-1078","Sabanagrande", true);//Estaba probando obne
    cliente1.verificacion();
        System.out.println(cliente1.Suma);

    }

}
