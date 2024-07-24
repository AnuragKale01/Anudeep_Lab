package Filestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class copyfunction {
public static void main(String[] args) {
	FileInputStream fis=null;
	FileOutputStream fos=null;
	try {
		fis=new FileInputStream(new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\Anudeep/logintej.png"));
		fos=new FileOutputStream(new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\Anudeep/newImag.png"));
		int data;
		while ((data=fis.read())!-1) {
			type type = (type) en.nextElement();
			
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
e