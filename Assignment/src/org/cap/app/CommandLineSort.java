package org.cap.app;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CommandLineSort 
{

	public static void main(String[] args) 
	{
		List list=Arrays.asList(args);
		Collections.sort(list);
			for (Object object : list) {
				System.out.println(object);
			}
	}

}
