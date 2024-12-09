package main;

import java.util.*;

class LogCount {

    public void count(List<String> log) {

        Map<String, Integer> requestCounts = new TreeMap<>(); //트리맵 선언언

        for (String entry : log) { //log는 배열이기에 향상된 for문 선언
            String[] parts = entry.split(" "); //공백을 기준으로 parts 배열에 담아서
            if (parts.length >= 4) { //part의 기링가 4이상이면
                String ipAddress = parts[parts.length - 1]; //ipAddress는 parts 배열 길이에서 -1 의 인덱스
                if (ipAddress.matches("\\d{1,3}(\\.\\d{1,3}){3}")) {//정규식
                    requestCounts.put(ipAddress, requestCounts.getOrDefault(ipAddress, 0) + 1);
                    //키가 존재하지 않는다면 0반환 존재하면 +1 해서 반환
                }
            }
        }

        for (Map.Entry<String, Integer> entry : requestCounts.entrySet()) {  //entrySet으로 모든 키, 값 반복을 합니다.
            String ipAddress = entry.getKey(); //현재 엔트리의 모든 키값들을 가져오기
            int requestCount = entry.getValue();//현재 엔트리의  모든 벨류값 가져오기
            System.out.println(ipAddress + " (" + requestCount + ")"); //출력 문
        }
    }
    /*
        Map<String, Integer> requestCounts = new HashMap<>();

        for(String entry : log) {
            int lastSpaceIndex=   entry.lastIndexOf(' ');
        }


      Map<String, Integer> requestCounts = new HashMap<>();

        for (String entry : log) {
            int lastSpaceIndex = entry.lastIndexOf(' ');
            int secondLastSpaceIndex = entry.lastIndexOf(' ', lastSpaceIndex - 1);

            if (secondLastSpaceIndex >= 0) {
                String ipAddress = entry.substring(secondLastSpaceIndex + 1, lastSpaceIndex);

                if (!requestCounts.containsKey(ipAddress)) {
                    requestCounts.put(ipAddress, 1);
                } else {
                    int count = requestCounts.get(ipAddress);
                    requestCounts.put(ipAddress, count + 1);
                }
            }
        }

        for (Map.Entry<String, Integer> entry : requestCounts.entrySet()) {
            String ipAddress = entry.getKey();
            int requestCount = entry.getValue();
            System.out.println(ipAddress + " (" + requestCount + ")");
        }
    }
     */
}

public class log {
    public static void main(String[] args) {

        List<String> log = new ArrayList<>();

        log.add("1622025201 REQUEST 10001 192.168.0.1");
        log.add("1622025202 REQUEST 10002 192.168.0.2");
        log.add("1622025203 REQUEST 10003 192.168.0.1");
        log.add("1622025211 RESPONSE 10003");
        log.add("1622025212 RESPONSE 10002");
        log.add("1622025213 RESPONSE 10001");
        log.add("1622025221 REQUEST 10004 192.168.0.2");
        log.add("1622025223 REQUEST 10005 192.168.0.2");
        log.add("1622025230 RESPONSE 10004");
        log.add("1622025231 REQUEST 10006 192.168.0.3");
        log.add("1622025236 RESPONSE 10006");

        LogCount logCount = new LogCount();

        logCount.count(log);
    }
}

