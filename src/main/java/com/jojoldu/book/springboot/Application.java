package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 스프링 부트 자동 설정, Bean읽기, 생성 설정

// 앞으로 만들 프로젝트의 메인 클래스
public class Application {
    public static void main(String[] args) {
        // 내장 WAS(Web Application Server) 실행
        // 내장 WAS란 별도로 외부에 WAS를 두지 않고 앱을 실행할 때
        // 내부에서 WAS를 실행하는 것 => 항상 서버에 tomcat설치할 필요x
        // 스프링 부트로 만들어진 Jar 파일(실행 가능한 Java 패키징 파일)로 실행하면 됨
        SpringApplication.run(Application.class, args);
    }
}
