package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class VideoService {
	
	@Autowired
	VideoRepository videorepo;

	static List<Video> videos=new ArrayList<>();
	
	static {
		videos.add(new Video("Intro","Spring boot Introduction"));
		videos.add(new Video("chapter-1","spring boot first chapter"));
	}
	
	public List<Video> getVideos()
	{
		return videorepo.findAll();
	}
	
	public Video getVideoByTitle(String title) {
		for(Video video:videos)
		{
			if(video.getTitle().equalsIgnoreCase(title))
			{
				return  video;
			}
		}
		return null;
	}
	
	public boolean addVideo(Video video)
	{
		if(isValid(video)) {
		videorepo.save(video);
		return true;
		}
		return false;
	}
	
		public boolean isValid(Video vid)
		{
			if(vid.getTitle()!=null||vid.getDescription()!=null)
			{
				return true;
			}else {
				return false;
			}
		}
	
	
	
	
	
	
}
