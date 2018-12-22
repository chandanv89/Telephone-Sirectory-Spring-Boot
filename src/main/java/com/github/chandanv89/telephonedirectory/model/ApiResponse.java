package com.github.chandanv89.telephonedirectory.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.http.HttpStatus;

/**
 * The type Api response.
 */
public class ApiResponse {
    @JsonProperty("status")
    private HttpStatus status;

    @JsonProperty("body")
    private Object body;

    /**
     * Instantiates a new Api response.
     */
    public ApiResponse() {
        // default
    }

    /**
     * Instantiates a new Api response.
     *
     * @param status the status
     * @param body   the body
     */
    public ApiResponse(HttpStatus status, Object body) {
        this.status = status;
        this.body = body;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public HttpStatus getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    /**
     * Gets body.
     *
     * @return the body
     */
    public Object getBody() {
        return body;
    }

    /**
     * Sets body.
     *
     * @param body the body
     */
    public void setBody(Object body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "{\"status\":" + status + ",\"body\":" + body + '}';
    }
}
