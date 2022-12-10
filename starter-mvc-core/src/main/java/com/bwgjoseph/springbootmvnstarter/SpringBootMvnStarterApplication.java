package com.bwgjoseph.springbootmvnstarter;

import com.bwgjoseph.model.Profile;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SpringBootMvnStarterApplication {

    public static void main(String[] args) {
        testMyFormatter();
        SpringApplication.run(SpringBootMvnStarterApplication.class, args);
    }

    public static void testMyFormatter() {
        Profile profile = Profile.builder()
                .id("1")
                .name("Joseph")
                .gender("Male")
                .address("21 North Way Drive, 01-1092")
                .build();

        log.info("{}", profile);

        List<Profile> profiles = List.of(profile);

        profiles.stream()
                .filter(p -> p.getAddress().contains("abcdefg helaks ifa"))
                .findFirst()
                .ifPresent(value -> value.toString().trim());
    }
}
