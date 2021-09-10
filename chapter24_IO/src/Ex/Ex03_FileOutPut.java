package Ex;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Ex03_FileOutPut {
	public static void main(String[] args) {

		//문자기반 스트림(파일 작성시 주로 사용)
		
		String msg = "하하하하호호호호후후후후";
		
		File file = null;			//file 전용 객체
		FileWriter fw = null;		//file 입출력 객체
		BufferedWriter bw = null;	//보조 입출력 객체
		
		//간단한 방법:	bw = new BufferedWriter(new FileWriter(new File("smile.txt")));
		try {
			file = new File("smile.txt");
			fw = new FileWriter(file, false);  //true는 이어쓰기 ,false는 덮어쓰기
			bw = new BufferedWriter(fw);
			
			bw.write(msg);
			bw.flush();
			System.out.println("smile.txt 파일 생성 완료!");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(bw != null) {
					bw.close();
				}
				
				if(fw != null) {
					fw.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
}
