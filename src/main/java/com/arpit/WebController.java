package com.arpit;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletResponse;

@Controller
public class WebController
{



	@RequestMapping(value = "/audio", method = RequestMethod.GET)
	public void printURL(HttpServletResponse response,
			@RequestParam(value="text",required=true)String text) throws Exception
	{
		response.setHeader("Content-Disposition","attachment;filename=audio.wav");
		response.setContentType("audio/wave");
		
		Audio.getStream(response.getOutputStream(),text);

		
	}

	
}
