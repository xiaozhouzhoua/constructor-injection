package com.me.constructorinjection.controller;

import com.me.constructorinjection.repository.VideoRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/video")
public class VideoController {
    private final VideoRepository videoRepository;

    public VideoController(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    public String next() {
        return videoRepository.nextVideo();
    }
}
