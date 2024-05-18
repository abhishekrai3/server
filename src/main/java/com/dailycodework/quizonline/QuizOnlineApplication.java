package com.dailycodework.quizonline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuizOnlineApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuizOnlineApplication.class, args);
    }
@Bean
 public WebMvcConfigurer configure() {
  return new WebMvcConfigurer() {
   @Override
   public void addCorsMappings(CorsRegistry reg) {
    reg.addMapping("/**").allowedOrigins("https://quiz-front-end-omega.vercel.app/");
   }
  };
  
 }    
}
