package modelo;

public class Recetas
{
    private String nombre;
    private String ingredientes;    
    private String tipo;
    private Preparacion unPreparacion;

    public Recetas(String nombre, String ingredientes, String tipo, Preparacion unPreparacion) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.tipo = tipo;
        this.unPreparacion = unPreparacion;
    }

    public Recetas(String string, String string0, String string1, int aInt, int aInt0, int aInt1) {
        this.nombre=string;
        this.ingredientes=string0;
        this.tipo=string1;
        this.unPreparacion=new Preparacion(aInt, aInt0, aInt1);
    }

    public String getNombre() {
        return nombre;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public String getTipo() {
        return tipo;
    }

    public Preparacion getUnPreparacion() {
        return unPreparacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setUnPreparacion(Preparacion unPreparacion) {
        this.unPreparacion = unPreparacion;
    }
        public String mostrarResumen() {
       return "Nombre :"+nombre+"\n"+
               "Preparación ID: " + unPreparacion.getIdPreparacion()+ "\n"+
           "Porciones: " + unPreparacion.getPorciones() + "\n"+
           "Tiempo: " + unPreparacion.getTiempoPreparacion() + " minutos.";
    }

    

    
}
