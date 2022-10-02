package com.bwgjoseph.springbootmvnstarter;

import java.util.List;
import lombok.Builder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMvnStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMvnStarterApplication.class, args);
    }

    public void testMyFormatter() {
        Profile profile = Profile.builder()
                .id("1")
                .name("Joseph")
                .gender("Male")
                .address("21 North Way Drive, 01-109")
                .build();

        List<Profile> profiles = List.of(profile);

        profiles.stream()
                .filter(p -> p.address.contains("abcdefg helaks ifa"))
                .findFirst()
                .map(p -> p.toString().trim())
                .get();
    }
}

@Builder
class Profile {
    String id;
    String name;
    String gender;
    String address;
}
