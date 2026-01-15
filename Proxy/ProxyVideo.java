// Proxy - ponto de acesso 
public class ProxyVideo implements YoutubeVideo{
    // Composição de classe
    private Youtube youtube;
    // variável para vídeo
    private String video;
    
    // Construtor que coleta o nome do vídeo
    public ProxyVideo(String video){
        this.video = video;
    }

    // Lógica para liberar acesso ao vídeo
    @Override
    public void assistir(){
        // Verifica a existência do vídeo
        if(youtube == null){
            // Criar a instância para o vídeo
            youtube = new Youtube(video);
        }
        // Retorna o vídeo que o usuário escolheu
        youtube.assistir();
    }   
}