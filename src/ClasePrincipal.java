import java.util.ArrayList;

public class ClasePrincipal {

    public static final ArrayList<String> list = new ArrayList<>();


    public ClasePrincipal() throws Exception{


        while (true) {
            Cliente cliente = new Cliente(this);
            Camarero camarero = new Camarero(this);
            camarero.start();
            camarero.join();


            cliente.start();
            cliente.join();
        }

    }








}
