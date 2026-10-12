package modelo;

public class GoogleCloud implements ProvedorNuvem {

    @Override
    public void enviarArquivo(String nome, byte[] dados) {
        System.out.println("Google Cloud: enviando " + nome);
    }

    @Override
    public void excluirArquivo(String nome) {
        System.out.println("Google Cloud: excluindo " + nome);
    }
}