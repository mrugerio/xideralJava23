public class Cliente {
    Articulo art;
    Publicacion pub;
    FactoryPublicacionArticulo factPubArticulo;
    
    public Cliente(String tipoArticulo, String autor, String tituloArticulo, 
                String tituloRevista,FactoryPublicacionArticulo _factPubArticulo) {
            
            this.factPubArticulo=_factPubArticulo;
            art = factPubArticulo.createArticulo();
            pub = factPubArticulo.createPublicacion();
            
            pub.setNombre(autor);
            art.setAutor(autor);
            
            art.setTitulo(tituloArticulo);
            pub.setNombre(tituloRevista);	
	}

    @Override
    public String toString() {
        return "Cliente: " + art.getAutor()+ ", " + art.getTitulo()+ ", " + pub.getNombre() + "";
    }

    public static void main(String args[]) {
        Cliente c = new Cliente("Blog de Victor","Victor Lavalle","Prueba Ejecucion","Diseño de Software",new FactoryCientifico());
        Cliente d =  new Cliente("Blog de Victor","Victor Lavalle","Prueba Ejecución","",new FactoryDivulgacion());     
        System.out.println("\n"+c+"\n"+d+"\n");
        System.out.println("Impresión del uso de las clases Factory: ");
        System.out.println(c.art.getClass()+"\n"+c.pub.getClass()+"\n"+d.art.getClass()+"\n"+d.pub.getClass() );
        }  
}
