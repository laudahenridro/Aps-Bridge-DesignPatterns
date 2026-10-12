package modelo;

public class Azure implements ProvedorNuvem {

    @Override
    public void enviarArquivo(String nome, byte[] dados) {
        System.out.println("Azure: enviando " + nome);
    }

    @Override
    public void excluirArquivo(String nome) {
        System.out.println("Azure: excluindo " + nome);
    }
}