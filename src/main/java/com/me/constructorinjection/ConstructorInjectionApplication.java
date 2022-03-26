package com.me.constructorinjection;

import com.me.constructorinjection.controller.VideoController;
import com.me.constructorinjection.repository.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class ConstructorInjectionApplication {

    public static void main(String[] args) {
        // 没有使用Spring依赖管理的情况
        VideoRepository videoRepository = new VideoRepository();
        VideoController videoController = new VideoController(videoRepository);
        System.out.println(videoController.next());

        ConfigurableApplicationContext applicationContext = SpringApplication.run(ConstructorInjectionApplication.class, args);

        // 列出所有的bean
        Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> System.out.println("from commandLineRunner");
    }

}
