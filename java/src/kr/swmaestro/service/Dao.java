package kr.swmaestro.service;

import java.util.ArrayList;

public class Dao {
		
	public void open() {
		// DB ����
	}
		
	public void close() {
		// DB ���� ����
	}
	
	public boolean addInstrument(Instrument instrument) {
		// insert query�� �̿��ؼ� DB�� ����
		return true;
	}
	
	public Instrument getInstrument(String name) {
		Instrument instrument = new Instrument();
		
		// name�� �������� select query�� ���.
		
		return instrument;
	}
	
	public ArrayList<Instrument> getInstrumentList(String[] name) {
		ArrayList instList = new ArrayList<Instrument>();
		
		// name�� �������� select query�� ���.
		// �������� data�� ��ȯ�Ѵ�.
		
		return instList;
	}
	
	public boolean deleteInstrument() {
		// delete query�� �̿��ؼ� DB���� ����
		return true;
	}
}
