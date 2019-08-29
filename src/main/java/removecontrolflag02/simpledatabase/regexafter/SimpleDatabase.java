package removecontrolflag02.simpledatabase.regexafter;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SimpleDatabase {
    private Map<String, String> map = new HashMap<String, String>();
    /**
     * 정규 표현식 패키지 사용
     *  (       ->  group(1)로 캡처할 문자열 시작
     *  [^=]+   ->  이외의 문자로 구성된 문자 클래스 1개 이상 반복
     *  )       ->  group(1) 범위 끝
     *  =       ->  문자
     *  (       ->  group(2)로 캡처할 문자열 시작
     *  .*      ->  임의의 문자 0개 이상 반복
     *  )       ->  group(2) 범위 끝
     */
    private static Pattern pattern = Pattern.compile("([^=]+)=(.*)");


    public SimpleDatabase(Reader r) throws IOException {
        BufferedReader reader = new BufferedReader(r);

        while (true) {
            String line = reader.readLine();

            if (line == null) {
                break;
            }

            /**
             * 패턴이 일치하는지 확인
             */
            Matcher matcher = pattern.matcher(line);

            if (matcher.matches()) {
                String key = matcher.group(1);
                String value = matcher.group(2);
                map.put(key, value);
            }
        }
    }


    public void putValue(String key, String value) {
        map.put(key,value);
    }

    public String getValue(String key) {
        return map.get(key);
    }

    public Iterator<String> iterator() {
        return map.keySet().iterator();
    }

}
