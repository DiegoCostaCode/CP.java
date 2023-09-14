public class Motos {
    private String marcamoto;
    private String modelomoto;
    private String tipodemotomoto;
    private int anomoto;

    public Motos(){}

    public Motos(String marcamoto, String modelomoto, String tipodemotomoto, int anomoto) {
        this.marcamoto = marcamoto;
        this.modelomoto = modelomoto;
        this.tipodemotomoto = tipodemotomoto;
        this.anomoto = anomoto;
    }

    public String getMarcamoto() {
        return marcamoto;
    }

    public void setMarcamoto(String marcamoto) {
        this.marcamoto = marcamoto;
    }

    public String getModelomoto() {
        return modelomoto;
    }

    public void setModelomoto(String modelomoto) {
        this.modelomoto = modelomoto;
    }

    public String getTipodemotomoto() {
        return tipodemotomoto;
    }

    public void setTipodemotomoto(String tipodemotomoto) {
        this.tipodemotomoto = tipodemotomoto;
    }

    public int getAnomoto() {
        return anomoto;
    }

    public void setAnomoto(int anomoto) {
        this.anomoto = anomoto;
    }

    public void acelerar() {
        System.out.println( modelomoto + " está acelerando");
    }

    @Override
    public String toString() {
        return "Motos{" +
                "marca='" + marcamoto + '\'' +
                ", modelo='" + modelomoto + '\'' +
                ", tipodemoto='" + tipodemotomoto + '\'' +
                ", ano=" + anomoto +
                '}';
    }

    public void Empinando() {
        System.out.println( modelomoto + " Está empinando");


}
}