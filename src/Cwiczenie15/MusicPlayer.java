package Cwiczenie15;

public class MusicPlayer {

    String ustawienie;

    public MusicPlayer (String ustawienie){
    this.ustawienie = "status";
    }
    String odtwarzaj () {
        return  "Play";
    }
    String pauza_stop(){
        return  "Pause";
    }
    String nastepny_utwór(){
        return "Next";
    }
    String poprzedni_utwór(){
        return  "prev";
    }

}
