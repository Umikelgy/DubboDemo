package com.tApi;

import java.io.Serializable;

/*
 *@description:
 *
 *@author 10068921(LgyTT)
 *@date 2018/8/31 15:17
 */
public class Params implements Serializable {
    private static final long serialVersionUID=1L;
    private String query;

    public Params(String query) {
        super();
        this.query = query;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
}
