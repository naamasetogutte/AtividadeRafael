public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Fiat", "Uno", 2020, 5, "Gasolina", "Hatch");
        Caminhao caminhao = new Caminhao("Mercedes", "Actros", 2021, 2, "Diesel", 10);
        Onibus onibus = new Onibus("Volvo", "B8R", 2019, 50, "Diesel", 7);
        CarroEletrico carroEletrico = new CarroEletrico("Tesla", "Model 3", 2022, 5, "Eletrico", "Sedan", 75);
        CaminhaoRefrigerado caminhaoRefrigerado = new CaminhaoRefrigerado("Scania", "R 500", 2021, 2, "Diesel", 15, -10);
        
        Veiculo[] veiculos = {carro, caminhao, onibus, carroEletrico, caminhaoRefrigerado};

        for (Veiculo veiculo : veiculos) {
            veiculo.exibirDetalhes();
            System.out.println("Autonomia: " + veiculo.calcularAutonomia() + " km\n");
        }
    }
}
