package BookMyShowLLD;

import java.util.*;
public class Show {
    int showId;
    Movie movie;
    Screen screen;
    List<Integer>bookedSeatIdS=new ArrayList<>();
    int showStartTime;
    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public List<Integer> getBookedSeatIdS() {
        return bookedSeatIdS;
    }

    public void setBookedSeatIdS(List<Integer> bookedSeatIdS) {
        this.bookedSeatIdS = bookedSeatIdS;
    }

    public int getShowStartTime() {
        return showStartTime;
    }

    public void setShowStartTime(int showStartTime) {
        this.showStartTime = showStartTime;
    }
//    public void setShowStartTime(int showStartTime) {
//    }

//    public List<Integer> getBookedSeatIds() {
//    }
}
