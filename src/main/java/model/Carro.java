package model;

public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    //sempre que acelerar será com base na potencia
    private Integer potencia;
    private Boolean isLigado;
    private Integer velocidadeAtual;
    private Integer velocidadeMaxima;

    public Carro(String marca, String modelo, String cor, Integer potencia, Integer velocidadeMaxima) {
        //todos carros serão criados desligados a velocidade 0
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.potencia = potencia;
        this.isLigado = false;
        this.velocidadeAtual = 0;
        this.velocidadeMaxima = velocidadeMaxima;
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

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    public Boolean getLigado() {
        return isLigado;
    }

    public void setLigado(Boolean ligado) {
        isLigado = ligado;
    }

    public Integer getVelocidadeAtual() { return velocidadeAtual; }

    public void setVelocidadeAtual(Integer velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public Integer getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Integer velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    @Override
    public String toString() {
        return "Carro{" + "marca='" + marca + '\'' + ", modelo='" + modelo + '\'' + ", cor='" + cor + '\'' + ", potencia=" + potencia + ", isLigado=" + isLigado + ", velocidadeAtual=" + velocidadeAtual + ", velocidadeMaxima=" + velocidadeMaxima + '}';
    }
}
