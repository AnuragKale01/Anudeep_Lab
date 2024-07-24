package Filestream;

import java.io.File;
import java.io.FileInputStream;

public class Readfunc {
public static void main(String[] args) {
	FileInputStream fi=null;
	try {
		
		fi = new FileInputStream(new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\Anudeep\\anudeepread.txt"));
		
	} catch (Exception e) {
		// TODO: handle exception
	} 
}
}
