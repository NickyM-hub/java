public interface Veiculo {
    void acelerar();
    void frear();
    void exibirInfo();
}

class Carro implements Veiculo {
    private String marca;
    private String modelo;
    private int velocidade;


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

    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;


    }

    public Carro (String marca, String modelo, int velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    @Override
    public void acelerar() {
        velocidade = velocidade + 15;
        System.out.println("o carro: " + getModelo() + " está aumentando a velocidade para: " + velocidade);
    }

    @Override
    public void frear() {
        velocidade = velocidade - 9;
        System.out.println("o carro: " + getModelo() + " está diminuindo a velocidade para: " + velocidade);
    }

    @Override
    public void exibirInfo() {
        System.out.println("o carro " + getMarca() + " do modelo: " + getModelo() + "está em: " + velocidade + "km/h");
    }
}

class Moto implements Veiculo {
    private String marca;
    private double cilindrada;
    private int velocidade;

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public Moto (String marca, double cilindrada, int velocidade) {
        this.marca = marca;
        this.cilindrada = cilindrada;
        this.velocidade = velocidade;
    }

    @Override
    public void acelerar() {
        velocidade = velocidade + 10;
        System.out.println("a moto " + getMarca() + " está aumentando a velocidade para: " + velocidade);
    }

    @Override
    public void frear() {
        velocidade = velocidade - 5;
        System.out.println("a moto " + getMarca() + " está diminuindo a velocidade para: " + velocidade);
    }

    @Override
    public void exibirInfo() {
        System.out.println("a moto: " + getMarca() + " possui: " + getCilindrada() + " cilidradas e está em: " + velocidade + "km/h");
    }
}


class Bicicleta implements Veiculo {
    private String marca;
    private String tipo;
    private int velocidade;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public Bicicleta(String marca, String tipo, int velocidade) {
        this.marca = marca;
        this.tipo = tipo;
        this.velocidade = velocidade;
    }

    @Override
    public void acelerar() {
        velocidade = velocidade + 5;
        System.out.println("a " + getMarca() + " do tipo " + getTipo() + " está aumentando a velocidade para: " + velocidade);
    }

    @Override
    public void frear() {
        velocidade = velocidade - 3;
        System.out.println("a " + getMarca() + " está diminuindo a velocidade para: " + velocidade);
    }

    @Override
    public void exibirInfo() {
        System.out.println("a " + getMarca() + " do tipo: " + getTipo() + " está a: " + velocidade + "km/h");
    }
}
