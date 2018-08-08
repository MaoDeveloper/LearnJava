package com.maodot.mode.dynamicproxymode;

/**
 * 明星实现类：周杰伦
 * @author maodot
 */
public class RealStar implements Star {
    @Override
    public void sing() {
        System.out.println("歌真的很好听，就是发音不标准");
    }

    @Override
    public void dance() {
        System.out.println("跳舞实在是一般，但就是爱看");
    }
}
