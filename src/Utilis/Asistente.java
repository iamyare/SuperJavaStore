package Utilis;



public class Asistente {
    public String nameAsistent;
    public String idAsistent;
    public String phoneAsistent;

    public Asistente(String name, String id, String phone){
        this.nameAsistent = name;
        this.idAsistent = id;
        this.phoneAsistent = phone;

    }
    public String saludo(){
        String saludo = "Bienvenido a SuperJavaStore!. Mi nombre es "+ this.nameAsistent + "!\ny te ayudare con tu compra.\n";
        return saludo;
    }
    //Creacion de Cliente
    public void Client(){
        Cliente cliente1 = new Cliente("Ana Ruiz", "0816198020021","3261-1078","Sabanagrande", true);
        System.out.println(cliente1.saludo());
        Cliente cliente2 = new Cliente("Juan Rodas", "0816198020021","3143-3077","Sabanagrande", true);
        System.out.println(cliente2.saludo());
        Cliente cliente3 = new Cliente("Mauricio Avila", "0816199900110", "3347-1198", "Apasinigua", false);
        System.out.println(cliente2.saludo());
        //Creando productos
        Articulo articulo1 = new Articulo("Ryzen 9", "12485", "Procesador de ultima generacion", 1, 1500.8);
        Articulo articulo2 = new Articulo("RAM 16GB", "12345", "Memorias RAM 16200Hz          ", 4, 800.1);
        Articulo articulo3 = new Articulo("Cooler", "14754", "Refrigeracion Liquida           ", 1, 750);
        Articulo articulo4 = new Articulo("MotherBoard", "14256", "Placa madre para computador", 1, 145.8);
        Articulo articulo5 = new Articulo("Mouse Ryzer", "12345", "Mouse 2400Dpi              ", 1, 100.5);
        Articulo articulo6 = new Articulo("Keyboard Ryzer", "12457", "Teclado QWERTY          ", 1, 110.8);
        //Asignaciones
        cliente1.asignar_articulo(articulo1);
        cliente1.asignar_articulo(articulo2);
        cliente1.asignar_articulo(articulo3);
        cliente1.asignar_articulo_historial(articulo5);
        cliente1.asignar_articulo_historial(articulo4);
        cliente2.asignar_articulo(articulo1);
        cliente2.asignar_articulo(articulo2);
        cliente2.asignar_articulo(articulo3);
        cliente2.asignar_articulo_historial(articulo5);
        cliente2.asignar_articulo_historial(articulo4);
        cliente2.asignar_articulo(articulo6);
        cliente3.asignar_articulo(articulo4);
        cliente3.asignar_articulo_historial(articulo1);
        cliente3.asignar_articulo_historial(articulo3);
        cliente3.asignar_articulo_historial(articulo2);
        //Carrito cliente1
        System.out.println("Buen dia "+cliente1.nameClient+"! su carrito tiene: ");
        cliente1.impresion_carrito();
        //Historial cliente1
        System.out.println("\n"+cliente1.nameClient+" su historial:");
        cliente1.impresion_historial();
        //Asistente verifica cliente1
        System.out.println("Accediendo como: "+nameAsistent);
        System.out.println("El historial de "+cliente1.nameClient+" es:");
        cliente1.impresion_historial();
        //Hacemos factura cliente1
        int numeroAle = (int)(Math.random()*5452+1);
        System.out.println("            -------FACTURA-------");
        System.out.println("Fecha: 16/04/2021                       N° Pedido:"+numeroAle);
        System.out.println("Asistente encargado: "+nameAsistent+"      con id:"+idAsistent);
        System.out.println("Cliente: "+cliente1.nameClient+"                  con id: "+cliente1.idClient);
        System.out.println("Direccion del destinatario: "+cliente1.direction);
        cliente1.impresion_carrito();
        cliente1.verificacion(); //Verifica si es VIP o no
        System.out.println("Compra efectuada con exito!. Gracias, vuelva pronto.\n\n");

        //Carrito cliente2
        System.out.println("Buen dia "+cliente2.nameClient+"! su carrito tiene: ");
        cliente2.impresion_carrito();
        //Historial cliente2
        System.out.println("\n"+cliente2.nameClient+" su historial:");
        cliente2.impresion_historial();
        //Asistente verifica cliente2
        System.out.println("Accediendo como: "+nameAsistent);
        System.out.println("El historial de "+cliente2.nameClient+" es:");
        cliente2.impresion_historial();
        //Hacemos factura cliente2
        numeroAle = (int)(Math.random()*5452+1);
        System.out.println("            -------FACTURA-------");
        System.out.println("Fecha: 16/04/2021                       N° Pedido:"+numeroAle);
        System.out.println("Asistente encargado: "+nameAsistent+"      con id:"+idAsistent);
        System.out.println("Cliente: "+cliente2.nameClient+"                  con id: "+cliente2.idClient);
        System.out.println("Direccion del destinatario: "+cliente2.direction);
        cliente2.impresion_carrito();
        cliente2.verificacion(); //Verifica si es VIP o no
        System.out.println("Compra efectuada con exito!. Gracias, vuelva pronto.\n\n");

        //Carrito cliente3
        System.out.println("Buen dia "+cliente3.nameClient+"! su carrito tiene: ");
        cliente3.impresion_carrito();
        //Historial cliente3
        System.out.println("\n"+cliente3.nameClient+" su historial:");
        cliente3.impresion_historial();
        //Asistente verifica cliente3
        System.out.println("Accediendo como: "+nameAsistent);
        System.out.println("El historial de "+cliente3.nameClient+" es:");
        cliente3.impresion_historial();
        //Hacemos factura cliente3
        numeroAle = (int)(Math.random()*5452+1);
        System.out.println("            -------FACTURA-------");
        System.out.println("Fecha: 16/04/2021                       N° Pedido:"+numeroAle);
        System.out.println("Asistente encargado: "+nameAsistent+"      con id:"+idAsistent);
        System.out.println("Cliente: "+cliente3.nameClient+"                  con id: "+cliente3.idClient);
        System.out.println("Direccion del destinatario: "+cliente3.direction);
        cliente3.impresion_carrito();
        cliente3.verificacion(); //Verifica si es VIP o no
        System.out.println("Compra efectuada con exito!. Gracias, vuelva pronto.\n\n");

        System.out.println("Su historial de asistencias es: ");
        System.out.println("Usted ayudo a "+cliente1.nameClient+" con las compra de:");
        cliente1.impresion_carrito();
        System.out.println("\nUsted ayudo a "+cliente2.nameClient+" con las compra de:");
        cliente2.impresion_carrito();
        System.out.println("\nUsted ayudo a "+cliente3.nameClient+" con las compra de:");
        cliente3.impresion_carrito();
    }

}
