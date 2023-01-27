package service;

import model.Carro;

public class CarroServiceImpl implements CarroService {
    @Override
    public void acelerar(Carro carro, int velocidadeAMais) {
        if (carro.isLigado() && (carro.getVelocidadeAtual() + velocidadeAMais <= carro.getVelocidadeMaxima())) {
            carro.setVelocidadeAtual(carro.getVelocidadeAtual() + velocidadeAMais);
        }else if(carro.getVelocidadeAtual() + velocidadeAMais >= carro.getVelocidadeMaxima()){
            carro.setVelocidadeAtual(carro.getVelocidadeMaxima());
        }
    }

    @Override
    public void frear(Carro carro, int velocidadeAMenos) {
        if ((carro.getVelocidadeAtual() - velocidadeAMenos) <= 0) {
            carro.setVelocidadeAtual(0);
        } else {
            carro.setVelocidadeAtual(carro.getVelocidadeAtual() - velocidadeAMenos);
        }
    }

    @Override
    public void ligar(Carro carro) {
        carro.setLigado(true);
    }

    @Override
    public void desligar(Carro carro) {
        carro.setLigado(false);
    }

    @Override
    public String estadoAtual(Carro carro) {
        return carro.toString();
    }
}
