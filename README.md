Trabalho de Análise e Projeto de Sistemas feito por Bruno Domênico e Pedro Henrique para exemplificar um projeto com o padrão estrutural Bridge. Código desenvolvido por Bruno Domênico

Imagine um sistema que precisa armazenar diferentes tipos de arquivos em diferentes provedores de nuvem.

Dimensão 1 — Tipo de armazenamento:
- Armazenamento de imagens
- Armazenamento de vídeos
- Armazenamento de backups

Dimensão 2 — Provedor:
- Amazon S3
- Azure Blob Storage
- Google Cloud Storage

Sem Bridge, poderíamos acabar criando classes como ImagemS3, ImagemAzure, VideoS3, VideoAzure, BackupGoogleCloud etc. Como visto abaixo:

<img width="1009" height="447" alt="without bridge" src="https://github.com/user-attachments/assets/35a9faa3-a381-4787-974d-0ca1ffeafa32" />






Diagrama de Classes do Projeto com Bridge

<img width="915" height="392" alt="with bridge" src="https://github.com/user-attachments/assets/f58c1e8d-935b-4259-8b46-cda07732652d" />



