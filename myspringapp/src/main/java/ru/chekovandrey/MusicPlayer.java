package ru.chekovandrey;

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }



    // IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer(){}

    public void setMusic(Music music){ //Spring из конфигурац. файла ищет метод set"name"
        this.music=music;              //name=music, поэтому он ищет setMusic и выполняет
    }

    public void playMusic(){
        System.out.println("Playing: "+music.getSong());
    }
}
