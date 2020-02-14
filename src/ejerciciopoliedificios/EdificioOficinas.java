package ejerciciopoliedificios;

public class EdificioOficinas implements Edificio{
    private int numerooficinas;
    private int ancho;
    private int largo;

    public EdificioOficinas(int numerooficinas, int ancho, int largo) {
        this.numerooficinas = numerooficinas;
        this.ancho = ancho;
        this.largo = largo;
    }

    public EdificioOficinas() {
        this(0,0,0);
    }
    
    public int getNumerooficinas() {
        return numerooficinas;
    }

    public void setNumerooficinas(int numerooficinas) {
        this.numerooficinas = numerooficinas;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
    
    
    @Override
    public String toString() {
        return "EdificioOficinas{" + "numero oficinas=" + numerooficinas + '}';
    }
    
    @Override
    public double getSuperficieEdificio() {
        return ancho*largo;
    }
    
}
