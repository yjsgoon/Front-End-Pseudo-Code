package kr.swmaestro.service;

import java.util.ArrayList;

public class Product {
	private Dao dao;
	private File file;
	private Case aCase;
	private Accessory accessory;
	private Instrument instrument;
	
	Product() {
		dao = new Dao();
		file = new File();
	}
	
	ArrayList<Instrument> getCompre(String[] name) {
		dao.open();
		
		ArrayList compareData;
		ArrayList soundFile = new ArrayList<File>();
		
		// 비교할 데이터를 요청 후 반환
		
		compareData = dao.getInstrumentList(name);
		soundFile.add(file.loadFile("File Name"));
		
		// 데이터 비교 로직
		
		dao.close();
		return compareData;
	}
	
	void registerInstrument(Instrument instrument) {
		dao.open();
		
		dao.addInstrument(instrument);
		// 해당 상품을 등록
		
		file.storeFile("File Name");
		// 소리 파일 저장
		
		dao.close();
	}
}
