package com.maodot.mode.responsibilitychainmode;

/**
 * 回复，对申请的回复
 * @author maodot
 */
public class Response {

    private StringBuilder content = new StringBuilder();

    public String getContent(){
        return content.toString();
    }

    public void addResponseContent(String append){
        content.append(append);
    }
}
