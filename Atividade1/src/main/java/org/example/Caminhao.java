class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, double capacidadeCarga) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double calcularAutonomia() {
        double tanque = 300;
        double consumo = 6;

        double reducao = Math.min(0.25, 0.01 * capacidadeCarga);
        consumo -= consumo * reducao;

        return tanque * consumo;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Capacidade: " + capacidadeCarga + " toneladas");
    }
}
