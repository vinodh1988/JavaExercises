package com.nio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioFeature {

	  public static  void main(String n[]){
		 /* Path p=Paths.get("E:\\NewCopied.pdf");
		  Path p1=Paths.get("E:\\CopiedVersion.pdf");*/
		  
		  Path p=Paths.get("D:\\wordpress\\wp-admin");
		  
		  try {
			DirectoryStream<Path> paths=Files.newDirectoryStream(p,"*");
			for(Path x:paths){
				System.out.println(x.getFileName());
				System.out.println(x);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  
		  /*try {
			Files.copy(p, p1);
			System.out.println("File is copied...!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	  }
}
