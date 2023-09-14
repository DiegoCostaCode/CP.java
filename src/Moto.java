public class Moto extends Motos{
    private String tipoDeMoto;
    public Moto (){}

    public Moto(String tipoDeMoto) {
        this.tipoDeMoto = tipoDeMoto;
    }

    public Moto(String marca, String modelo, String tipodemoto, int ano, String tipoDeMoto) {
        super(marca, modelo, tipodemoto, ano);
        this.tipoDeMoto = tipoDeMoto;
    }

    public String getTipoDeMoto() {
        return tipoDeMoto;
    }

    public void setTipoDeMoto(String tipoDeMoto) {
        this.tipoDeMoto = tipoDeMoto;
    }

    @Override
    public void acelerar() {
        super.acelerar();
    }

    @Override
    public String toString() {
        return "Moto{" +
                "tipoDeMoto='" + tipoDeMoto + '\'' +
                '}' + super.toString();
    }
}
