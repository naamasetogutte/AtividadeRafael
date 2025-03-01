class Onibus extends Veiculo {
    private int quantidadeEixos;

    public Onibus(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, int quantidadeEixos) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);

        if (quantidadeEixos < 6 || quantidadeEixos > 8) {
            throw new IllegalArgumentException("O");
        }
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double calcularAutonomia() {
        double tanque = 200;
        double consumo = 5;
        return tanque * consumo;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Quantidade de Eixos: " + quantidadeEixos);
    }
}
