/**
 * @author Victor Lavalle
 */
public class Client {

    public static void main(String[] args) {
 Group MenuCena = new Group("MenuCena");
 Group BebidasCena = new Group("Bebidas");
 Group PaquetesCena = new Group("Paquetes");
 menuItem m1 = new menuItem("Horchata","Rica",false,200);
 menuItem m2 = new menuItem("Coca","Rica",false,10);
 menuItem m3 = new menuItem("Manzanita","Podrida",true,130);
 menuItem m4 = new menuItem("HotCake","buena",false,80);
 menuItem m5 = new menuItem("Huevo","Maso",false,50);

 BebidasCena.addCompMenu(m1);
 BebidasCena.addCompMenu(m2);
 BebidasCena.addCompMenu(m3);
 PaquetesCena.addCompMenu(m4);
 PaquetesCena.addCompMenu(m5);
 MenuCena.addCompMenu(BebidasCena);
 MenuCena.addCompMenu(PaquetesCena);
 MenuCena.showDescription();

    }

}
