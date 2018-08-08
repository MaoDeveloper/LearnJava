package com.maodot.annotation.learn1;

/**
 * 接口：人
 * @author maodot
 */
public interface People {
    /**
     * 名字
     */
    void  name();

    /**
     * 性别
     */
    void  gender();

    /**
     * 让不合理的方法过时
     */
    @Deprecated
    void work();
}
