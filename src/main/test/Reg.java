package main.test;

import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegxSolution{
    public String linkChange(String url){
        String regex = "^(https?://)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(url);

        String regex2 = "<(a\\s+href|img\\s+src)";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(url);

        boolean resultMatcher = matcher.find();  //일치하면 true
        boolean resultMatcher2 = matcher2.find(); //일치하지 않으면 false, false여야 통과 조건문에 !resultMatcher2 로 true로 바꿔준다.

        if(resultMatcher && !resultMatcher2){ //true && true 가 되어서 정상 진행
            System.out.println(resultMatcher);
            System.out.println(resultMatcher2);

            return "<a href=\"["+url+"]\">["+url+"]</a>";

        }else{
            System.out.println(resultMatcher);
            System.out.println(resultMatcher2);

            return url;
        }
    }
}

public class Reg {
    public static void main(String[] args) {

        RegxSolution reg = new RegxSolution();

        String goodUrl = "https://naver.com";
        String goodUrl2 = "http://naver.com";

        String badUrl = "<a href="+"\"http://";
        String badUrl2 = "<img src="+"\"http://";

        System.out.println("맞는 경우" + reg.linkChange(goodUrl));
        System.out.println("맞는 경우" + reg.linkChange(goodUrl2));
        System.out.println("틀린 경우" + reg.linkChange(badUrl));
        System.out.println("틀린 경우" + reg.linkChange(badUrl2));
    }
}
