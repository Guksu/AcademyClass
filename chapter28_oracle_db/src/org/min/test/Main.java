package org.min.test;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		CreateTable ct = new CreateTable();
		FileReadClass frc = new FileReadClass();
		DateInsert<String> di = new DateInsert<String>();
//		ct.createTable("naver_news_table");
		String url = "newsdata.txt";
		
		ArrayList<String> arr = frc.readFileData(url);
		di.dataInsert(arr, "naver_news_table");
	}
}
