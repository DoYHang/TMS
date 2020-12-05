package com.buct.image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
 
import javax.imageio.ImageIO;
 
public class WriteImage {
	public static void changeImage(String imageName, String resultImageName) throws IOException {
		BufferedImage image = null;
		File file = new File(imageName);
		image = ImageIO.read(file);

		ImageIO.write(image, "jpg", new File(resultImageName));
	}
	public static void main(String[] args) {
		BufferedImage image = null;
		try {
 
			URL url = new URL("http://www.google.com/logos/classicplus.png");
			File file = new File("D:\\javawork\\TMS\\Uniform_level.jpg");
			image = ImageIO.read(file);
 
			ImageIO.write(image, "jpg", new File("D:\\javawork\\TMS\\config\\5.jpg"));
			
 
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Done");
	}
}