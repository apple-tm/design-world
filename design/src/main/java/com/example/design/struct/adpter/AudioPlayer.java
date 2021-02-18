package com.example.design.struct.adpter;

public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String type, String fileName) {
        if ("mp3".equalsIgnoreCase(type)) {
            System.out.println("播放 MP3：" + fileName);
        } else if ("mp4".equalsIgnoreCase(type)
        || "vlc".equalsIgnoreCase(type)) {
            mediaAdapter = new MediaAdapter(type);
            mediaAdapter.play(type, fileName);
        }
    }
}
