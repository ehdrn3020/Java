package com.java.restFulEx.request;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class httprequest {
    public static String getSelectUrl(){
        String UrlAddress;
        // 서버 IP, Port 정보
        String serverIp = "156.23.10.112";
        Integer serverPort = 1300;
        String doTestUrl = "http://" + serverIp + ":" + serverPort + "/api/public_open/doTest";
        
        // 요청변수 정보
        // 클라이언트ID(공개시스템의 ID)
        String clientId = "PUBLIC_OPEN";
        // 요청일련번호(P로 시작하는 일련번호. 중복불가)
        String reqId = "P123456789";
        // 요청파일의 NAS저장 위치
        String fileDir = File.separator + "public_open" + File.separator + reqId + File.separator + "upload";       
        UrlAddress = doTestUrl + "?" + "clientId=" + clientId + "&" + "reqId=" + reqId + "&" + "fileDir=" + fileDir; 
        
        return UrlAddress;
    }
     
    public static String getJson(String urlToRead) throws Exception {      
        int resultMsg = 0;
        // 다운로드 받는 도중 데이터를 저장할 변수      
        StringBuilder result = new StringBuilder();
        
        URL url = new URL(urlToRead);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        if (conn != null) {
            conn.setRequestMethod("GET");
            resultMsg = conn.getResponseCode();
            // conn.setConnectTimeout(5000);
            // conn.setUseCaches(false);
        }
        // 정상적으로 연결에 성공하면
        if (resultMsg == HttpURLConnection.HTTP_OK) {
            // 줄 단위로 읽어오기 위한 BufferedReader 객체 생성
            InputStreamReader isr = new InputStreamReader(conn.getInputStream());
            BufferedReader rd = new BufferedReader(isr);

            String line;
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
            rd.close();
        }        
        return result.toString();
    }
        
    public static void main(String[] args) throws Exception{
       //요청
        String request = getJson(getSelectUrl());
        System.out.println(request);       
    }
}

