package br.com.alura.screenmatch.models.Titulo;

public class Episode extends Serie {
    private int episodeNum;
    private Serie serie;

    public Episode(){
        super();
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getEpisodeNum() {
        return episodeNum;
    }

    public void setEpisodeNum(int episodeNum) {
        this.episodeNum = episodeNum;
    }
}
