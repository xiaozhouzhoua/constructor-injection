package com.me.constructorinjection.repository;

import org.springframework.stereotype.Repository;

@Repository
public class VideoRepository {
    public String nextVideo() {
        return "Video-Next";
    }
}
