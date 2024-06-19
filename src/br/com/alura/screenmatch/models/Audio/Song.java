package br.com.alura.screenmatch.models.Audio;

public class Song extends Audio{
    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    private String singer;

}
