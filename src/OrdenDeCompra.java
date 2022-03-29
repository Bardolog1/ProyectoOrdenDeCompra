import java.util.Date;

public class OrdenDeCompra {
    private Integer idOC;
    private static int ultimoID;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[]  productos = new Producto[4];
    private int indPro =0;

    public OrdenDeCompra(String descripcion) {
        this.idOC=++ultimoID;
        this.descripcion = descripcion;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public Date getFecha() {
        return fecha;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public Producto[] getProductos() {
        return productos;
    }

    public void addPro (Producto producto){
        if (indPro < this.productos.length) {
            this.productos[indPro++] = producto;
        }
    }
    public int granTotal (){
        int i = 0;
        int total=0;
        do {
            total += productos[i].getPrecio();
            i++;
        }while (i< productos.length);
        return total;
    }
    public String verDetalle (int total){
        String detalle;
        detalle =
                "                           Orden de compra N° "+this.idOC+"         \n"+
                "Cliente: "+this.cliente+"     "+"Descripción: "+this.descripcion+    "      Fecha: "+ fecha+"  \n"+
                "-------------------------------------------------------------------------------------------------------------\n";
        for (int j = 0; j <productos.length ; j++) {
            detalle +=
                    productos[j].getNombre()+"/"+productos[j].getFabricante() +"  ______________________   "+productos[j].getPrecio()+" \n";
        }
        detalle +="-----------------------------------------------------------------------------------------------------------\n"+
                    "                                                                           Gran total:"+total+ " COP \n \n";
        return detalle;
    }
}

