package modelo;

public class Preparacion 
{
    private int porciones;
    private int tiempoPreparacion;
    private int idPreparacion; 

    public Preparacion(int porciones, int tiempoPreparacion, int idPreparacion) {
        this.porciones = porciones;
        this.tiempoPreparacion = tiempoPreparacion;
        this.idPreparacion = idPreparacion;
    }

    public int getPorciones() {
        return porciones;
    }

    public void setPorciones(int porciones) {
        this.porciones = porciones;
    }

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(int tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public int getIdPreparacion() {
        return idPreparacion;
    }

    public void setIdPreparacion(int idPreparacion) {
        this.idPreparacion = idPreparacion;
    }
    
    public double calcularTiempoPorPorcion() {
        return tiempoPreparacion / porciones;
    }
    
    
    public String compararTiempo(Preparacion otraPreparacion) {
        if (tiempoPreparacion < otraPreparacion.getTiempoPreparacion()) {
            return "Esta preparación es más rápida.";
        } else if (tiempoPreparacion > otraPreparacion.getTiempoPreparacion()) {
            return "La otra preparación es más rápida.";
        } else {
            return "Ambas preparaciones toman el mismo tiempo.";
        }
    }


    
    
    
    
    
    
    
    
    
}
