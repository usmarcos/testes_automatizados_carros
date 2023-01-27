package service;

import model.Carro;
import org.junit.Assert;
import org.junit.Test;

public class CarroServiceImplTest {
    CarroService carroService = new CarroServiceImpl();

    @Test
    public void deveAcelerarCorretamente() {
        // Given
        Carro carro = new Carro("Azul", "Fiat", "Uno", 2015, 150);

        // When
        carroService.ligar(carro);
        carroService.acelerar(carro, 10);

        // Then
        Assert.assertEquals(carro.getVelocidadeAtual(), 10);
    }

    @Test
    public void deveFreiarCorretamente() {
        // Given
        Carro carro = new Carro("Azul", "Fiat", "Uno", 2015, 150);

        // When
        carroService.ligar(carro);
        carroService.acelerar(carro, 10);
        carroService.frear(carro, 5);

        // Then
        Assert.assertEquals(carro.getVelocidadeAtual(), 5);
    }

    @Test
    public void deveLigarCorretamente() {
        //Dado
        Carro carro = new Carro("Marca 03", "Modelo03", "Cor03", 10, 100);
        //Quando
        carroService.ligar(carro);
        //Então
        Assert.assertTrue(carro.isLigado());
    }

    @Test
    public void deveIniciarDesligado() {
        Carro carro = new Carro("Marca 04", "Modelo04", "Cor04", 10, 100);
        //Quando
        carroService.acelerar(carro, 10);
        //Então
        Assert.assertFalse(carro.isLigado());
    }

    @Test
    public void naoDeveAcelerarDesligado() {
        Carro carro = new Carro("Marca 04", "Modelo04", "Cor04", 10, 100);
        //Quando
        carroService.acelerar(carro, 10);
        //Então
        Assert.assertEquals(carro.getVelocidadeAtual(), 0);
    }

    @Test
    public void naoDeveTerVelocidadeMenorQueZero() {
        //Dado
        Carro carro = new Carro("Marca 05", "Modelo05", "Cor05", 10, 100);
        //Quando
        carroService.ligar(carro);
        carroService.frear(carro, 20);
        //Então
        Assert.assertEquals(carro.getVelocidadeAtual(), 0);
    }

    @Test
    public void naoDeveAcelerarMaisQueVelocidadeMaxima() {
        //Given
        Carro carro = new Carro("Marca 05", "Modelo05", "Cor05", 10, 100);
        //When
        carroService.ligar(carro);
        carroService.acelerar(carro, 90);
        carroService.acelerar(carro, 150);
        //Then
        Assert.assertEquals(carro.getVelocidadeAtual(), carro.getVelocidadeMaxima());
    }
}
