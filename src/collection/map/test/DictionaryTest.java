package collection.map.test;

import java.io.*;
import java.util.*;

public class DictionaryTest {
    public static void main(String[] args) throws Exception {
        Map<String, String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("단어 입력 단계");
        while (true) {
            System.out.print("영어 단어를 입력하세요 (종료는 'q'): ");
            String key = br.readLine();
            if ("q".equals(key)) {
                break;
            }
            System.out.print("한글 뜻을 입력하세요: ");
            String value = br.readLine();

            map.put(key, value);
        }
        System.out.println("단어 검색 단계");
        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
            String key = br.readLine();
            if ("q".equals(key)) {
                break;
            }
            if (!map.containsKey(key)) {
                System.out.println(key + "은(는) 사전에 없는 단어입니다.");
            }
            System.out.println(key + "의 뜻: " + map.get(key));
        }
    }
}
