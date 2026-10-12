package modelo;

public interface ProvedorNuvem {
    void enviarArquivo(String nome, byte[] dados);
    void excluirArquivo(String nome);
}