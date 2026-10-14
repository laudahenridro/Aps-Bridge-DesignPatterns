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

<img width="1009" height="447" alt="{627CBABC-D0C8-4E80-8828-5329A01C3F50}" src="https://github.com/user-attachments/assets/35a9faa3-a381-4787-974d-0ca1ffeafa32" />






Diagrama de Classes do Projeto com Bridge

<img width="915" height="392" alt="image" src="https://github.com/user-attachments/assets/861ee5cf-9d8c-43a0-a6ce-13a8efb20d3c" />

