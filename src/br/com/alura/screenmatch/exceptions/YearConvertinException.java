package br.com.alura.screenmatch.exceptions;

public class YearConvertinException extends RuntimeException{
    private final String message;
    public YearConvertinException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
