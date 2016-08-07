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
		
		// ���� �����͸� ��û �� ��ȯ
		
		compareData = dao.getInstrumentList(name);
		soundFile.add(file.loadFile("File Name"));
		
		// ������ �� ����
		
		dao.close();
		return compareData;
	}
	
	void registerInstrument(Instrument instrument) {
		dao.open();
		
		dao.addInstrument(instrument);
		// �ش� ��ǰ�� ���
		
		file.storeFile("File Name");
		// �Ҹ� ���� ����
		
		dao.close();
	}
}
