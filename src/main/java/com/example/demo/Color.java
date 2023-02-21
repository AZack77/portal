package com.example.demo;

@RestController
public class Color {
	@GetMapping("/color")
	public String getColor()
	{
		public String favColor()
		{
			String fav = "Green";
			return "My favorite color is "+fav;
		}
	}
}
