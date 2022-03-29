import java.util.Date;
import java.util.Scanner;
public class EjemploOrdenDeCompra {
    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);
        System.out.println("Ingrese el numero de orden a consultar  1-3");
        int orden = scan.nextInt();

        OrdenDeCompra ordenN1 = new OrdenDeCompra("Compra de  setup Gamer");
        ordenN1.setFecha(new Date());
        ordenN1.setCliente(new Cliente("Libardo ", "Lozano"));
        ordenN1.addPro(new Producto("AMD     ","Procesador AMD Ryzen 9 5950X        ",3899900));
        ordenN1.addPro(new Producto("Gigabyte","BoardMother B450 AORUS PRO WIFI     ",808900));
        ordenN1.addPro(new Producto("Corsair ","Chasis Gaming Case Corsair Carburo  ",590000));
        ordenN1.addPro(new Producto("Samsung ","Monitor  curvo Samsung Odyssey4     ",2439900));

        OrdenDeCompra ordenN2 = new OrdenDeCompra("Compras del super");
        ordenN2.setFecha(new Date());
        ordenN2.setCliente(new Cliente("Danilo", "Gaviria"));
        ordenN2.addPro(new Producto("CocaCola  ","Bebida Gaseosa a base de cola        ",2500));
        ordenN2.addPro(new Producto("Incauca   ","Azúcar Refinada a base de caña       ",1500));
        ordenN2.addPro(new Producto("Generica  ","Arroz procesado                      ",2000));
        ordenN2.addPro(new Producto("Bimbo     ","Pan Tajado 500g                      ",5000));

        OrdenDeCompra ordenN3 = new OrdenDeCompra("Medicinas para la abue");
        ordenN3.setFecha(new Date());
        ordenN3.setCliente(new Cliente("Pedro ", "Florez"));
        ordenN3.addPro(new Producto("Bayer     ","Baycuten crema         ",25000));
        ordenN3.addPro(new Producto("LaFrancol ","Atorvastatina 20mg     ",4000));
        ordenN3.addPro(new Producto("Genfar    ","Losartan 50mg          ",5000));
        ordenN3.addPro(new Producto("Chalver   ","Descongel Gripa        ",15000));

        try {
            switch (orden) {

                case 1 -> System.out.println(ordenN1.verDetalle(ordenN1.granTotal()));
                case 2 -> System.out.println(ordenN2.verDetalle(ordenN2.granTotal()));
                case 3 -> System.out.println(ordenN3.verDetalle(ordenN2.granTotal()));
                default -> System.out.println("No hay datos");

            }
        }catch (Exception e){
            System.err.println(" Ingrese un valor correcto: "+e);
            main(args);
            System.exit(1);
        }
    }
}
