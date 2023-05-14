package pl.regula.ksb2aopdomowe.controller;

import org.springframework.web.bind.annotation.*;
import pl.regula.ksb2aopdomowe.model.Video;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/videos")
public class VideoController {

    private List<Video> videos;

    public VideoController() {
        this.videos = new ArrayList<>();
        videos.add(new Video("John Wick 4", 2023, "Lionsgate"));
        videos.add(new Video("Strażnicy Galaktyki: Volume 3", 2023, "Marvel"));
        videos.add(new Video("Fast & furious 10", 2023, "Universal studio"));
    }

    @GetMapping
    public List<Video> getVideos(){
        return this.videos;
    }

    @PostMapping
    public void addVideo(@RequestBody Video video){
        this.videos.add(video);
    }

}
