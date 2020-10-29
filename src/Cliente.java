public class Cliente extends Thread {


    ClasePrincipal clasePrincipal;

    public Cliente(ClasePrincipal clasePrincipal) {this.clasePrincipal=clasePrincipal;}


    @Override
    public void run() {



        try {
            do{

                if (!ClasePrincipal.list.isEmpty()){
                    System.out.println("Cliente - Voy a consumir un " + ClasePrincipal.list.get(0) + " 3 segundos");
                    ClasePrincipal.list.remove(0);
                    sleep(3000);


                }

            }while(!ClasePrincipal.list.isEmpty());
            System.out.println("Cliente - Voy a esperar a que me traigan comida...");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

