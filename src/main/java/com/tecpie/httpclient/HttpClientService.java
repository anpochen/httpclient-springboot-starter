package com.tecpie.httpclient;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;

/**
 * httpclient服务接口
 *
 * @author zhangzhe
 * @since 0.0.1.RELEASE
 */
@SuppressWarnings("unused")
public interface HttpClientService {
    /**
     * 发送无参数的get请求
     *
     * @param url 请求地址
     * @return 响应体字符串
     * @throws IOException        通常为各种通讯异常
     * @throws URISyntaxException url解析异常
     */
    String doGet(String url) throws IOException, URISyntaxException;

    /**
     * 发送有参数的get请求
     *
     * @param url    请求地址
     * @param params 请求参数，默认以application/x-www-form-urlencoded格式发送
     * @return 响应体字符串
     * @throws IOException        通常为各种通讯异常
     * @throws URISyntaxException url解析异常
     */
    String doGet(String url, Map<String, Object> params) throws IOException, URISyntaxException;

    /**
     * 发送有参数且有特殊请求头的get请求
     *
     * @param url     请求地址
     * @param params  请求参数，默认以application/x-www-form-urlencoded格式发送
     * @param headers 请求头信息
     * @return 响应体字符串
     * @throws IOException        通常为各种通讯异常
     * @throws URISyntaxException url解析异常
     */
    String doGet(String url, Map<String, Object> params, Map<String, String> headers) throws IOException, URISyntaxException;

    /**
     * 发送无参数的post请求
     *
     * @param url 请求地址
     * @return 响应体字符串
     * @throws IOException        通常为各种通讯异常
     * @throws URISyntaxException url解析异常
     */
    String doPost(String url) throws IOException, URISyntaxException;

    /**
     * 发送有参数的post请求
     *
     * @param url    请求地址
     * @param params 请求参数，默认以application/json格式发送
     * @return 响应体字符串
     * @throws IOException        通常为各种通讯异常
     * @throws URISyntaxException url解析异常
     */
    String doPost(String url, Map<String, Object> params) throws IOException, URISyntaxException;

    /**
     * 发送有参数且有特殊请求头的post请求
     *
     * @param url     请求地址
     * @param params  请求参数，默认以application/json格式发送
     * @param headers 请求头信息
     * @return 响应体字符串
     * @throws IOException        通常为各种通讯异常
     * @throws URISyntaxException url解析异常
     */
    String doPost(String url, Map<String, Object> params, Map<String, String> headers) throws IOException, URISyntaxException;
}
