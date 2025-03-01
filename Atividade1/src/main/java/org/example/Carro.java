class Carro extends Veiculo {
    private String tipoCarro;

    public Carro(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, String tipoCarro) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        this.tipoCarro = tipoCarro;
    }

    @Override
    public double calcularAutonomia() {
        double tanque = 50;
        double consumo = 12;
        return tanque * consumo;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo de Carro: " + tipoCarro);
    }
}
