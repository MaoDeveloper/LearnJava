package com.maodot.mode.responsibilitychainmode;

/**
 * 领导~~
 * @author maodot
 */
public abstract class Leader {

    protected Leader superior;

    protected String name;

    protected Response response = new Response();

    protected Leader(Leader superior, String name) {
        this.superior = superior;
        this.name = name;
    }

    public abstract Response handler(Request request);
}
