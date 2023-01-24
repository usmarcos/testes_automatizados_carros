package service;

import model.Carro;

public class CarroServiceImpl implements CarroService {

    @Override
    public void desligar(Carro carro) {
        carro.setLigado(false);
    }

    @Override
    public void ligar(Carro carro) {
        carro.setLigado(true);
    }

    /*Será a velocidade atual + potencia*/
    @Override
    public void acelerar(Carro carro) {
        if (carro.getLigado()) {
            carro.setVelocidadeAtual(carro.getVelocidadeAtual() + carro.getPotencia());
        }
    }

    @Override
    public void frear(Carro carro) {
        if (carro.getLigado() && carro.getVelocidadeAtual() > 0) {
            carro.setVelocidadeAtual(carro.getVelocidadeAtual() - carro.getPotencia());
        }
    }

    @Override
    public void mostrarEstadoAtual(Carro carro) {
        System.out.println(carro.toString());
    }
}
