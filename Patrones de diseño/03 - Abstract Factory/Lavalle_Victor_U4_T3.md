##### Código Fuente

```java
public class Articulo  {
	String autor,titulo;
        
    public Articulo() {}
    public Articulo(String _autor, String _titulo) {
        this.autor = _autor;
        this.titulo = _titulo;
    }
    public String getAutor() { return autor; }
    public String getTitulo() {return titulo; } 
    
    public void setAutor(String autor) { this.autor = autor; }
    public void setTitulo(String titulo) {this.titulo = titulo;}

    @Override
    public String toString() {
        return "Articulo{" + "autor=" + autor + ", titulo=" + titulo +"}";
    }
}
```

```java
public class ArticuloCientifico extends Articulo {
    
  public ArticuloCientifico(String autor, String nombre) {
    super(autor,nombre);
}
  public ArticuloCientifico() { }      
}
```

```java
public class ArticuloDivulgacion extends Articulo {
    
	public ArticuloDivulgacion(String autor, String nombre) {
	   super(autor,nombre);
	}
	public ArticuloDivulgacion() {}
}
```

```java
public class Publicacion {
    
    String nombre;

    public Publicacion() {}
    public Publicacion(String _nombre) { this.nombre = _nombre; }
  
	  public String getNombre() { return nombre;}
		public void setNombre(String nombre) {this.nombre = nombre;}

    @Override
    public String toString() {
        return "Publicacion{" + "nombre=" + nombre +"}";
    }
}
```

```java
public class Blog extends Publicacion {

    public Blog(String _nombre) {
    super(_nombre);
    }
    public Blog() {}      
}
```

```java
public class RevistaCientifica extends Publicacion {

    public RevistaCientifica(String _nombre) {
        super(_nombre);
    }
    public RevistaCientifica() { }
}
```

```java
/**
 * @author Victor Lavalle
 */
public abstract class FactoryPublicacionArticulo {
    public abstract Articulo createArticulo();
    public abstract Publicacion createPublicacion();
}
```

```java
/**
 * @author Victor Lavalle
 */
public class FactoryDivulgacion extends FactoryPublicacionArticulo {

    @Override
    public Articulo createArticulo() {
        return new ArticuloDivulgacion();
    }

    @Override
    public Publicacion createPublicacion() {
        return new Blog();
    }
}
```

```java
/**
 * @author Victor Lavalle
 */
public class FactoryCientifico extends FactoryPublicacionArticulo {

    @Override
    public Articulo createArticulo() {
        return new ArticuloCientifico();
    }

    @Override
    public Publicacion createPublicacion() {
        return new RevistaCientifica();   
    }
}
```

```java
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
```

##### Diagrama de Clases

<img src="C:\Users\vmlc1\Desktop\Diagrama de Clases.png" alt="Diagrama de Clases" style="zoom:150%;" />



##### Diagrama de Secuencia

![Secuencia](C:\Users\vmlc1\Downloads\Secuencia.jpg)

##### Ejecución

<img src="C:\Users\vmlc1\AppData\Roaming\Typora\typora-user-images\image-20200504151513073.png" alt="image-20200504151513073" style="zoom:150%;" />