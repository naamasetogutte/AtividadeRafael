class CarroEletrico extends Carro {
    private double bateriaKWh;

    public CarroEletrico(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, String tipoCarro, double bateriaKWh) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel, tipoCarro);
        this.bateriaKWh = bateriaKWh;
    }

    @Override
    public double calcularAutonomia() {
        double consumo = 5;
        return bateriaKWh * consumo;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Bateria: " + bateriaKWh);
    }
}
