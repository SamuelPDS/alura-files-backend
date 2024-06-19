package br.com.alura.screenmatch.models.Audio;

public class Audio {
    private String title;
    private String duration;
    private int total_reprodutions;
    private int total_likes;
    private int classification;

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getTotal_reprodutions() {
        return total_reprodutions;
    }

    public void setTotal_reprodutions(int total_reprodutions) {
        this.total_reprodutions = total_reprodutions;
    }

    public int getClassification() {
        return classification;
    }

    public void setClassification(int classification) {
        this.classification = classification;
    }

    public int getTotal_likes() {
        return total_likes;
    }

    public void setTotal_likes(int total_likes) {
        this.total_likes = total_likes;
    }

    public String play(){
        return "Playing music";
    }
}
