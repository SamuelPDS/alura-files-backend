package br.com.alura.screenmatch.models.Titulo;

import br.com.alura.screenmatch.models.ObdbTitle;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    @SerializedName("Title")
    private String name;
    @SerializedName("Year")
    private int releaseDate;
    private boolean hasPlan;
    private int quantRateNum;
    private int totalRates;
    private int duration_minutes;

    public Titulo(){}

    public Titulo(String name, int releaseDate){
        this.name = name;
        this.releaseDate = releaseDate;
    }

    public Titulo(ObdbTitle mytitle) {
        this.name = mytitle.title();
        this.releaseDate = Integer.parseInt(mytitle.year());
        this.duration_minutes = Integer.parseInt(mytitle.runtime().substring(0,2));
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public boolean isHasPlan() {
        return hasPlan;
    }

    public int getQuantRateNum() {
        return quantRateNum;
    }

    public int getDuration_minutes() {
        return duration_minutes;
    }

    public int getTotalRates() {
        return totalRates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setHasPlan(boolean hasPlan) {
        this.hasPlan = hasPlan;
    }

    public void setQuantRateNum(int quantRateNum) {
        this.quantRateNum = quantRateNum;
    }

    public void setTotalRates(int totalRates) {
        this.totalRates = totalRates;
    }

    public void setDuration_minutes(int duration_minutes) {
        this.duration_minutes = duration_minutes;
    }

    public void showMovieInfo() {
        System.out.println(name);
        System.out.println(releaseDate);
        System.out.println(hasPlan);
        System.out.println(totalRates);
        System.out.println(duration_minutes);
    }

    public void toRate(double note) {
        totalRates += (int) note;
        quantRateNum++;
    }

    public double rateAverage() {
        return (double) totalRates / quantRateNum;
    }

    @Override
    public int compareTo(Titulo otherTitle) {
       return this.getName().compareTo(otherTitle.getName());
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "name='" + name + '\'' +
                ", duration_minutes=" + duration_minutes +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
