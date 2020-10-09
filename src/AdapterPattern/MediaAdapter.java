package AdapterPattern;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPlayer;
    public MediaAdapter(String audio){
        if(audio.equalsIgnoreCase("vlc")){
            advancedMusicPlayer=new VlcPlayer();
        }
        else if(audio.equalsIgnoreCase("mp4")){
            advancedMusicPlayer=new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);

        }else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
