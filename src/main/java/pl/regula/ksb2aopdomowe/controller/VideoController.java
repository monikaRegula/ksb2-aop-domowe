package pl.regula.ksb2aopdomowe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.regula.ksb2aopdomowe.model.Video;
import pl.regula.ksb2aopdomowe.service.VideoService;

import java.util.List;

@RestController
@RequestMapping("/videos")
public class VideoController {

    private VideoService videoService;

    @Autowired
    public VideoController(VideoService videoService) {
        this.videoService = videoService;
    }

    @GetMapping
    public List<Video> getVideos(){
        return videoService.getVideos();
    }

    @PostMapping
    public void addVideo(@RequestBody Video video){
        this.videoService.addVideo(video);
    }

}
