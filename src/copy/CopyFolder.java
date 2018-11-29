package copy;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class CopyFolder {

	public static void main(String args[]){
		copyFolder("/Users/navis/Desktop/cloud-portal-api",  "/Users/navis/Downloads");
	}
	
	public static void copyFolder(String src, String destination) {

			String folderName = src.substring(src.lastIndexOf(File.separator) + 1);
			File srcFolder = new File(src);
			String srcpath  = srcFolder.getAbsolutePath();
			if(srcFolder.exists()){
				System.out.println("hello");
			}
			File destinationPath = new File(destination);
			destinationPath.mkdir();
			
			ProcessBuilder processBuilder = new ProcessBuilder("/bin/bash", "-c",
					" cp -a " + srcpath + "  " + destinationPath.getAbsolutePath());

			Process process;
			try {
				process = processBuilder.start();
				BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
				String line = null;
				while ((line = reader.readLine()) != null) {
					System.out.println(line);
				}
				System.out.println(destinationPath.listFiles().length);
			} catch (IOException e) {
				System.out.println("Failed to copy file");
			}
			
			
	}
}
