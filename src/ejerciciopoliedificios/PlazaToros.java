package ejerciciopoliedificios;

public class PlazaToros implements InstalacionDeportiva, Edificio{
    private int radio;
    private String ciudad;
    private int tipodeinstalacion;

    public PlazaToros(int radio, String ciudad) {
        this.radio = radio;
        this.ciudad = ciudad;
        this.tipodeinstalacion = 1;
    }

    public PlazaToros() {
        this(0,"");
        this.tipodeinstalacion=1;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setTipoinstalacion(int tipodeinstalacion) {
        this.tipodeinstalacion = tipodeinstalacion;
    }
    
    @Override
    public int getTipoInstalacion() {
        return tipodeinstalacion;
    }

    @Override
    public double getSuperficieEdificio() {
        return (Math.PI*(radio*radio));
    }

    @Override
    public String toString() {
        return "PlazaToros{" + "radio=" + radio + ", ciudad=" + ciudad + ", tipodeinstalacion=" + tipodeinstalacion + '}';
    }
    
}
