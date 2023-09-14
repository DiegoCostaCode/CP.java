public class Veiculos {
    private String marca;
    private String modelo;
    private int ano;


    public Veiculos (){}

    public Veiculos(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void acelerar() {
        System.out.println( modelo + " está acelerando");
    }
    public void Abrirporta() {
        System.out.println( modelo + " Abrindo as portas");
    }
    public void frear() {
        System.out.println( modelo + " está freando");
    }

    @Override
    public String toString() {
        return "carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }
}