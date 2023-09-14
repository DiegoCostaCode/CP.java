import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("====Bem-Vindo====");
        System.out.println("Cadastro de Carro ");


       var novoCarro1 = Cadastrarcarros();
       var novoMoto1 = CadastrarMotos();

        novoCarro1.acelerar();
        novoCarro1.Abrirporta();
        novoCarro1.frear();
        novoMoto1.acelerar();
        novoMoto1.Empinando();

    }
    public static Veiculos Cadastrarcarros(){
        var scanner = new Scanner(System.in);
        var Carro = new Veiculos();

        System.out.println("Digite a marca do veiculo: ");
        Carro.setMarca(scanner.nextLine());

        System.out.println("Digite o modelo do carro: ");
        Carro.setModelo(scanner.nextLine());

        System.out.println("Digite o ano do carro: ");
        Carro.setAno(scanner.nextInt());

        return Carro;
    }
    public static Motos CadastrarMotos(){

        System.out.println("Cadastro moto ");


        var scanner = new Scanner(System.in);
        var novoMoto1 = new Motos();

        System.out.println("Digite a marca da moto: ");
        novoMoto1.setMarcamoto(scanner.nextLine());

        System.out.println("Digite o modelo da moto: ");
        novoMoto1.setModelomoto(scanner.nextLine());

        System.out.println("Digite o ano da moto: ");
        novoMoto1.setAnomoto(scanner.nextInt());

        return novoMoto1;




    }

}