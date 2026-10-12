package modelo;

public abstract class Armazenamento {

    protected ProvedorNuvem provedor;

    public Armazenamento(ProvedorNuvem provedor) {
        this.provedor = provedor;
    }

    public abstract void armazenar(String nome, byte[] dados);

    public void excluir(String nome) {
        provedor.excluirArquivo(nome);
    }
}