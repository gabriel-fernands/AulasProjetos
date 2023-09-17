package maratona.alura.java;

public class Aula05Estrutaracondicionais {
    public static void main(String[] args) {
        int age = 20;
        boolean isAutorizadoComprarBebida = age >= 18;
        //!
        if (isAutorizadoComprarBebida != false){
            System.out.println("AUTORIZADO A COMPRAR BEBIDA ALCOLICA");

        }else {
            System.out.println("nao autorizdo a comprar bebida alcolica");
        }
        if (!isAutorizadoComprarBebida){
            System.out.println("nao autorizado a comprar bebida alcolica");
        }
        boolean c = false;
        if (c == true){
            System.out.println("dentro de algo que nunca deve ser feito");
        }
        System.out.println("fora do if");
    }
}
