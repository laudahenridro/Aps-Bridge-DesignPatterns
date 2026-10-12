package modelo;

public class ArmazenamentoImagem extends Armazenamento {

    public ArmazenamentoImagem(ProvedorNuvem provedor) {
        super(provedor);
    }

    @Override
    public void armazenar(String nome, byte[] dados) {
        System.out.println("Validando formato da imagem...");
        System.out.println("Otimizando imagem...");

        provedor.enviarArquivo(nome, dados);
    }
}