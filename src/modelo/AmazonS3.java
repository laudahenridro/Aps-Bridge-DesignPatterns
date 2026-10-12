package modelo;

public class AmazonS3 implements ProvedorNuvem {

    @Override
    public void enviarArquivo(String nome, byte[] dados) {
        System.out.println("Amazon S3: enviando " + nome);
    }

    @Override
    public void excluirArquivo(String nome) {
        System.out.println("Amazon S3: excluindo " + nome);
    }
}