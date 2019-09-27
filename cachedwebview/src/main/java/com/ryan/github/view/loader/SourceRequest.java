package com.ryan.github.view.loader;

import java.util.Map;

/**
 * Created by Ryan
 * at 2019/9/27
 */
public class SourceRequest {

    private String url;
    private boolean cacheable;
    private Map<String, String> headers;

    public SourceRequest(String url) {
        this.url = url;
    }

    public SourceRequest(String url, boolean cacheable, Map<String, String> headers) {
        this.url = url;
        this.cacheable = cacheable;
        this.headers = headers;
    }

    public String getUrl() {
        return url;
    }

    public void setCacheable(boolean cacheable) {
        this.cacheable = cacheable;
    }

    public boolean isCacheable() {
        return cacheable;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }
}
