//Hay varios errores pero es porque estaba probando con todos.

package Apps;
import Utilidades.*;
public  class App {
    public static void main(String[] args){
        //Creacion del asistente
        Asistente asistente1 = new Asistente("Yamir Rodas", "0816200100100", "3353-6765");
        System.out.println("\n"+asistente1.saludo());



        //Creacion de los clientes
        Cliente cliente1 = new Cliente("Juan Rodas", "0816198020021","3261-1078","Sabanagrande", true);
        System.out.println(cliente1.saludo());
        Cliente cliente2 = new Cliente("Mauricio Avila", "0816199900110", "3353-6765", "Apasinigua", false);
        System.out.println(cliente2.saludo());
        //Creando productos
        Articulo articulo1 = new Articulo("Ryzen 9", "12485", "Procesador de ultima generacion", 1, 1500.8);
        Articulo articulo2 = new Articulo("RAM 16GB", "12345", "Memorias RAM 16200Hz          ", 4, 800.1);
        Articulo articulo3 = new Articulo("Cooler", "14754", "Refrigeracion Liquida           ", 1, 750);
        Articulo articulo4 = new Articulo("MotherBoard", "14256", "Placa madre para computador", 1, 145.8);
        Articulo articulo5 = new Articulo("Mouse Ryzer", "12345", "Mouse 2400Dpi              ", 1, 100.5);
        Articulo articulo6 = new Articulo("Keyboard Ryzer", "12457", "Teclado QWERTY          ", 1, 110.8);
        //Asignacion de Articulos
        asistente1.asignar_articulo_as(articulo1);
        cliente1.asignar_articulo(articulo1);
        cliente1.asignar_articulo(articulo2);
        cliente1.asignar_articulo(articulo3);
        cliente2.asignar_articulo(articulo1);
        cliente2.asignar_articulo(articulo2);
        cliente2.asignar_articulo(articulo3);

        //Asignacion de Historial
        cliente1.asignar_articulo_historial(articulo5);
        cliente1.asignar_articulo_historial(articulo6);
        System.out.println(cliente1.nameClient+" su historial:");
        cliente1.impresion_historial();
        cliente2.asignar_articulo_historial(articulo4);
        cliente2.asignar_articulo_historial(articulo1);
        System.out.println(cliente1.nameClient+" su historial:");
        cliente1.impresion_historial();
        //Impresion de Carrito
        System.out.println("Buen dia "+cliente1.nameClient+"! su carrito tiene: ");
        cliente1.impresion_carrito();
        cliente1.verificacion();
        System.out.println("Buen dia "+cliente2.nameClient+"! su carrito tiene: ");
        cliente2.impresion_carrito();
        cliente2.verificacion();
        

        asistente1.asistencia();

        asistente1.asis();
    }
}

