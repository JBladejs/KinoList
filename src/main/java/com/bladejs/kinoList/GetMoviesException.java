package com.bladejs.kinoList;

class GetMoviesException extends Exception {
    public GetMoviesException(){
        super("Downloading user's scores failed.");
    }
}
