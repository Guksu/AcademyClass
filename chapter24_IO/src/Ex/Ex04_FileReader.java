package Ex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex04_FileReader {
	public static void main(String[] args) {

		File file = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			file = new File("nationalAnthem.txt");
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			//한 줄만 읽는 방법
			//System.out.println(br.readLine());  //return값은 String(한 줄만 읽음)
			String line = "";
			//여러 줄 읽는 방법
			while(true) {
				line = br.readLine();
				
				if(line != null) {
					System.out.println(line);
				}else {
					break;
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null) {
					br.close();
				}
				
				if(fr != null) {
					fr.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
