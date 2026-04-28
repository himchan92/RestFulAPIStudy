package org.zerock.ex3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing //시간 자동처리 지원 필수 셋팅
public class Ex3Application {

    public static void main(String[] args) {
        SpringApplication.run(Ex3Application.class, args);
    }

}
