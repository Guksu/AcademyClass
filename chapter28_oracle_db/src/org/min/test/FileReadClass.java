package org.min.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileReadClass {

	public ArrayList<String> readFileData(String fileName) {
		
		File file = null;
		FileReader fr = null;
		BufferedReader br = null;
		List<String> dataArr = new ArrayList<>();
		
		try {
			file = new File(fileName);
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String line = "";
			while(true) {
				line = br.readLine();
				
				if(line != null) {
					dataArr.add(line);
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
		
		return (ArrayList<String>) dataArr;
		
	}
}
