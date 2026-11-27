public abstract class Astros {

    private double radioEcuatorial;
    private double rotacion;
    private double masa;
    private double temperaturaMedia;
    private double gravedad;

    public Astros(double radioEcuatorial, double rotacion, double masa, double temperaturaMedia, double gravedad) {
        this.radioEcuatorial = radioEcuatorial;
        this.rotacion = rotacion;
        this.masa = masa;
        this.temperaturaMedia = temperaturaMedia;
        this.gravedad = gravedad;
    }

    public double getRadioEcuatorial() {
        return radioEcuatorial;
    }

    public double getRotacion() {
        return rotacion;
    }

    public double getMasa() {
        return masa;
    }

    public double getTemperaturaMedia() {
        return temperaturaMedia;
    }

    public double getGravedad() {
        return gravedad;
    }
    public abstract String muestra();
    @Override
    public String toString() {
        return "Astros{" +
                "radioEcuatorial=" + radioEcuatorial +
                ", rotacion=" + rotacion +
                ", masa=" + masa +
                ", temperaturaMedia=" + temperaturaMedia +
                ", gravedad=" + gravedad +
                '}';
    }
}
