import model.Carro;
import service.CarroService;
import service.CarroServiceImpl;

public class Main {
    /**
     * Cenários básicos
     */
    public static void main(String[] args) {
        /**Cenário 01: Acelerar corretamente*/
        //Dado
        CarroService carroService1 = new CarroServiceImpl();
        Carro carro01 = new Carro("Marca 01", "Modelo01", "Cor01", 10, 100);
        //Quando
        carroService1.ligar(carro01);
        carroService1.acelerar(carro01);
        //Então
        System.out.println("Resultado do cenário 01: "+ (carro01.getVelocidadeAtual() == 10));

        /**Cenário 02: Frear corretamente*/
        //Dado
        CarroService carroService2 = new CarroServiceImpl();
        Carro carro02 = new Carro("Marca 02", "Modelo02", "Cor02", 10, 100);
        //Quando
        carroService2.ligar(carro02);
        carroService2.acelerar(carro02);
        carroService2.acelerar(carro02);
        carroService2.frear(carro02);
        //Então
        System.out.println("Resultado do cenário 02: "+ (carro02.getVelocidadeAtual() == 10));

        /**Cenário 03: Deve iniciar desligado*/
        //Dado
        CarroService carroService3 = new CarroServiceImpl();
        Carro carro03 = new Carro("Marca 03", "Modelo03", "Cor03", 10, 100);
        //Quando
        //Então
        System.out.println("Resultado do cenário 03: "+ (carro03.getLigado() == false));

        /**Cenário 04: Não deve acelerar desligado*/
        //Dado
        CarroService carroService4 = new CarroServiceImpl();
        Carro carro04 = new Carro("Marca 04", "Modelo04", "Cor04", 10, 100);
        //Quando
        carroService4.acelerar(carro04);
        //Então
        System.out.println("Resultado do cenário 04: "+ (carro04.getVelocidadeAtual() == 0));

        /**Cenário 05: Não deve ser possível uma velocidade negativa*/
        //Dado
        CarroService carroService5 = new CarroServiceImpl();
        Carro carro05 = new Carro("Marca 05", "Modelo05", "Cor05", 10, 100);
        //Quando
        carroService5.ligar(carro05);
        carroService5.frear(carro05);
        //Então
        System.out.println("Resultado do cenário 05: "+ (carro05.getVelocidadeAtual() == 0));






    }
}
