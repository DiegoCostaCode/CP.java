public class Carro extends Veiculos
{
    private int quantidadeDePortas;

    public Carro (){}

    public Carro(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public Carro(String marca, String modelo, int ano, int quantidadeDePortas) {
        super(marca, modelo, ano);
        this.quantidadeDePortas = quantidadeDePortas;
    }

    @Override
    public void acelerar() {
        super.acelerar();
    }


    @Override
    public String toString() {
        return "Carro{" +
                "quantidadeDePortas=" + quantidadeDePortas +
                '}' +super.toString();
    }
}