package pl.regula.ksb2aopdomowe.service;

import org.springframework.stereotype.Service;
import pl.regula.ksb2aopdomowe.aop.SendAnEmail;
import pl.regula.ksb2aopdomowe.model.Video;

import java.util.ArrayList;
import java.util.List;

@Service
public class VideoService {
    private List<Video> videos;

    public VideoService() {
        this.videos = new ArrayList<>();
        videos.add(new Video("John Wick 4", 2023, "Lionsgate"));
        videos.add(new Video("Guardians of the Galaxy: Volume 3", 2023, "Marvel"));
        videos.add(new Video("Fast & furious 10", 2023, "Universal studio"));
    }

    public List<Video> getVideos() {
        return videos;
    }

    @SendAnEmail
    public void addVideo(Video video) {
        if (!videos.contains(video)) {
            videos.add(video);
        }
    }
}
