package com.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	@Autowired
	@Qualifier("humanHeart")
	private Heart heart;
	
	public void startPumping()
	{
		heart.pump();
	}
}
