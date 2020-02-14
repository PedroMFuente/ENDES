package ejerciciopoliedificios;

public class Polideportivo implements InstalacionDeportiva, Edificio{
    private double ancho;
    private double largo;
    private int tipoInstalacion;
    private String nombre;

    public Polideportivo() {
        this(0,0,"");
        this.tipoInstalacion=0;
    }

    public Polideportivo(double ancho, double largo,String nombre) {
        this.ancho = ancho;
        this.largo = largo;
        this.tipoInstalacion = 0;
        this.nombre = nombre;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoInstalacion(int tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }
    
    @Override
    public int getTipoInstalacion() {
        return tipoInstalacion;
    }

    @Override
    public double getSuperficieEdificio() {
        return ancho*largo;
    }
    
}
