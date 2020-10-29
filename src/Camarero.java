public class Camarero extends Thread {

    ClasePrincipal clasePrincipal;

    public Camarero(ClasePrincipal clasePrincipal) {this.clasePrincipal=clasePrincipal;}


    @Override
    public void run() {
        try {
            System.out.println("Camarero - Si he llegado aqui es porque el cliente ha pedido comida. Debo llevarla");
            ClasePrincipal.list.add("Zumo");
            sleep(1000);
            ClasePrincipal.list.add("Tostada");
            sleep(1000);
            ClasePrincipal.list.add("Mermelada");
            sleep(1000);
            System.out.println("Camarero - El pedido ya esta listo. Tardo 5 segundos en llevarle la comida al cliente");
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
