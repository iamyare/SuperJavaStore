package Apps;
import Utilis.*;
public class App {
    public static void main(String[] args){
        Asistente asistente1 = new Asistente("Yamir Rodas", "0816200100100", "3353-6765");
        System.out.println("\n"+asistente1.saludo());
        asistente1.Client();
    }
}
