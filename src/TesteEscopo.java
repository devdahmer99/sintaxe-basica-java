public class TesteEscopo {
    public static void main(String[] args) {
        int idade = 18;
        quantidadePessoas = 2;
        boolean acompanhado = true;

        if (quantidadePessoas >= 2) {
            acompanhado = true;
        } else {
            acompanhado = false;
        }
        System.out.println("valor de acompanhado = " + acompanhado);

        if (idade >=18 && acompanhado) {
            System.out.println("Você tem mais de 18 anos");
            System.out.println("Seja bem vindo!");

        } else {
            System.out.println("infelizmente você não pode entrar"
                    + " pois é menor de idade");
        }
    }
}