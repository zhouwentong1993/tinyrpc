package com.wentong.protocol;

import lombok.Data;

/**
 * 定长的 header
 */
@Data
public class Header {
    private String version;
    private String magicCode;
    private Integer bodyLength;
    private byte serialization;
    private String requestId;

}
