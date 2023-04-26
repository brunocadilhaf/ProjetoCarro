package Pacote2;

import Pacote3.Carro;

public class App {
    public static void main(String[] args) throws Exception {
        /* Limpa o terminal */
        System.out.print("\033[H\033[2J");
        System.out.flush();
        /* Limpa o terminal */
        Carro carro = new Carro("ABC1234", 123456789);
        System.out.println("Velocidade do carro: " + carro.getVelocidadeAtual());
        System.out.println("ACELERANDO O CARRO...");
        for (int i = 0; i < 10; i++) {
            carro.acelerar();
        }
        System.out.println("Velocidade do carro: " + carro.getVelocidadeAtual());

        System.out.println("ACELERANDO ATÉ 50 KM/H");
        carro.acelerar(50);
        System.out.println("Velocidade do carro: " + carro.getVelocidadeAtual());
    }
}
