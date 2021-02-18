package com.example.design.struct.adpter;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) {

    }

    @Override
    public void playVlc(String fileName) {
        System.out.println("vlc 播放："+ fileName);
    }
}
