package modelo;

public class ArmazenamentoBackup extends Armazenamento {

    public ArmazenamentoBackup(ProvedorNuvem provedor) {
        super(provedor);
    }

    @Override
    public void armazenar(String nome, byte[] dados) {
        System.out.println("Verificando integridade do backup...");
        System.out.println("Preparando backup...");

        provedor.enviarArquivo(nome, dados);
    }
}