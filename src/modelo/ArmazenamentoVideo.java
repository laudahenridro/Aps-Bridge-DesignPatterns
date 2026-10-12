package modelo;

public class ArmazenamentoVideo extends Armazenamento {

    public ArmazenamentoVideo(ProvedorNuvem provedor) {
        super(provedor);
    }

    @Override
    public void armazenar(String nome, byte[] dados) {
        System.out.println("Validando formato do video...");
        System.out.println("Preparando video para streaming...");

        provedor.enviarArquivo(nome, dados);
    }
}