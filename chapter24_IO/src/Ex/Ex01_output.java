package Ex;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

//output은 작성하고 내보내기(출력)    |  input은 작성된걸 가져오기(입력)

public class Ex01_output {
	public static void main(String[] args) {

		//바이트 기반 스트림
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			// FileOutputStream(생성할 파일의 경로 및 파일 이름)
			// -경로 지정을 안 하면 현재 디렉토리에 파일 생성(상대경로)
			//= c/file/ 형식은 절대경로
			
			fos = new FileOutputStream("alphabet.txt");
			bos = new BufferedOutputStream(fos);
			
			char ch = 'A';
			while(true) {
				bos.write(ch);
				
				if(ch=='z') {
					break;
				}
				ch++;
			}
			
		bos.flush(); //buffer는 저장공간이니  다 보내고 이를 비워두는 코드	
		System.out.println("alphabet.txt 파일 생성 완료!!");
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//buffer를 사용한 클래스는 finally close를 통해 메모리 관리를 해야한다  이것도 예외처리 해줘야한다
			try {
				//닫는순서는 열린순서의 역순
				if(bos != null) {
					bos.close();
				}
				if(fos != null) {
					fos.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
