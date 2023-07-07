package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoController {
	
	
	@Autowired
	VideoService vidService;
	//-----------------------------------------------
	@GetMapping("/videos")
	public ResponseEntity<List<Video>> getVideoByTitle(@RequestParam(required = false) String title)throws RuntimeException
	{
//		if(title==null)
//		{
			return ResponseEntity.ok(vidService.getVideos());
			//return new ResponseEntity<>(vidService.getVideos(),HttpStatus.OK);
//		}
//		List<Video> arr=new ArrayList<>();
//		Video video= vidService.getVideoByTitle(title);
//		
//		if(video!=null) {
//			arr.add(video);
//		}
//		if(arr.isEmpty())
//		{
//			throw new VideoNotFoundException("The video not Found");
//		}
//		
//		return ResponseEntity.ok(arr);
	}
	//----------------------------------------------
	@PostMapping("/videos")
	public ResponseEntity<String>save(@RequestBody Video video)
	{
		boolean res=vidService.addVideo(video);
		if(res)
		{
			return ResponseEntity.ok("video is saved");
		}
		else {
			return ResponseEntity.badRequest().build();
		}
	}

}
