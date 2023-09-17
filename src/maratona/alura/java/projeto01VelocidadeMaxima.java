package maratona.alura.java;

public class projeto01 {
    public static void main(String[] args) {
        int velocidadeMaxima = 80;
        int velocidade = 120;
        if (velocidade == velocidadeMaxima) {
            System.out.println("parabéns!");
        }else if (velocidade < velocidadeMaxima){
            System.out.println("não levou multa");
        }else if (velocidade > velocidadeMaxima && velocidade <= velocidadeMaxima + 10){
            System.out.println("levou multa leve");
        }else if (velocidade > velocidadeMaxima + 11 && velocidade <= velocidadeMaxima ){
            System.out.println("levou multa grave");
        }else if (velocidade > velocidadeMaxima + 20){
            System.out.println("levou multa gravissima");
        }
    }
}
