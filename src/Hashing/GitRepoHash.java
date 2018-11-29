package Hashing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class GitRepoHash {

	public static void main(String args[]) throws IOException, URISyntaxException{
		
		URI uri = new URI("https://github.com/EMBL-EBI-TSI/cloud-portal-api");
		File f = new File(uri);
		FileInputStream fis = new FileInputStream(f);
		String md5 = org.apache.commons.codec.digest.DigestUtils.md5Hex(fis);
		fis.close();
		sysout
	}
	
	

}
