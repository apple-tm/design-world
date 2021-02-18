package com.example.design.struct.adpter;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String type) {
        if ("mp4".equalsIgnoreCase(type)) {
            advancedMediaPlayer = new Mp4Player();
        } else if ("vlc".equalsIgnoreCase(type)) {
            advancedMediaPlayer = new VlcPlayer();
        }
    }

    @Override
    public void play(String type, String fileName) {
        if ("mp4".equalsIgnoreCase(type)) {
            advancedMediaPlayer.playMp4(fileName);
        } else if ("vlc".equalsIgnoreCase(type)) {
            advancedMediaPlayer.playVlc(fileName);
        }
    }
}
