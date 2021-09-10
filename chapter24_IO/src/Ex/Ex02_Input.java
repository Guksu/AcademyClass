package Ex;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Ex02_Input {
	public static void main(String[] args) {

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			fis = new FileInputStream("alphabet.txt");
			bis = new BufferedInputStream(fis);
			
			int ch = 0;
			while(true) {
				ch = bis.read();   //read()메소드의 리턴 타입은 int이다
				
				if(ch == -1) {		//read()메소드는 파일이 끝나면 -1을 리턴한다
					break;
				}
				
				System.out.println((char)ch);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}	finally {
			try {
				
				if (bis != null) {
					bis.close();
				}
				if (fis != null) {
					fis.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			} 
		}
	}
}
