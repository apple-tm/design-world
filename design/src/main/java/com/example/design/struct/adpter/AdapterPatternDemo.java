package com.example.design.struct.adpter;

/**
 * 适配器(容易会让系统非常零乱) （不是在详细设计时添加的，而是解决正在服役的项目的问题，有动机地修改一个正常运行的系统的接口）
 * 1.添加一个需要新增功能的接口
 * 2.每一个新增功能实现一个实现类
 * 3.创建一个适配器类，实现播放接口，组装新增功能接口为属性
 * 4.将适配器组装为原接口实现类的属性
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer();
        ap.play("mp3", "beat it");
        ap.play("mp4", "fellow");
        ap.play("vlc", "yellow");

    }
}
