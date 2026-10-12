package main;

import modelo.*;

public class Main {

    public static void main(String[] args) {

        ProvedorNuvem aws = new AmazonS3();
        ProvedorNuvem azure = new Azure();
        ProvedorNuvem google = new GoogleCloud();

        byte[] dados = "Conteúdo".getBytes();

        Armazenamento imagem = new ArmazenamentoImagem(aws);
        Armazenamento video = new ArmazenamentoVideo(azure);
        Armazenamento backup = new ArmazenamentoBackup(google);

        imagem.armazenar("foto.png", dados);

        System.out.println();

        video.armazenar("filme.mp4", dados);

        System.out.println();

        backup.armazenar("backup.zip", dados);

        System.out.println("\nTrocando o provedor da imagem:");

        Armazenamento outraImagem = new ArmazenamentoImagem(google);
                

        outraImagem.armazenar("foto2.png", dados);
    }
}