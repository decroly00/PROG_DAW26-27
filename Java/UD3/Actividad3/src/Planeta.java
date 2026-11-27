public class Planeta extends Astros{

    private double distanciaSol;
    private double orbitaAlSol;
    private boolean tieneSatelites;

    public Planeta(double radioEcuatorial, double rotacion, double masa, double temperaturaMedia, double gravedad,
                   double distanciaSol, double orbitaAlSol, boolean timeSatelites) {
        super(radioEcuatorial, rotacion, masa, temperaturaMedia, gravedad);
        this.distanciaSol = distanciaSol;
        this.orbitaAlSol = orbitaAlSol;
        this.tieneSatelites = timeSatelites;
    }


    @Override
    public String muestra(){
        return super.toString() + this.toString();
    }

    public double getDistanciaSol() {
        return distanciaSol;
    }

    public double getOrbitaAlSol() {
        return orbitaAlSol;
    }

    public boolean isTieneSatelites() {
        return tieneSatelites;
    }

    @Override
    public String toString() {
        return "Planetas{" +
                "distanciaSol=" + distanciaSol +
                ", orbitaAlSol=" + orbitaAlSol +
                ", tieneSatelites=" + tieneSatelites +
                '}';
    }
}
