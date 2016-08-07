package kr.swmaestro.service;

import java.util.ArrayList;

public class Dao {
		
	public void open() {
		// DB 연결
	}
		
	public void close() {
		// DB 연결 해제
	}
	
	public boolean addInstrument(Instrument instrument) {
		// insert query를 이용해서 DB에 저장
		return true;
	}
	
	public Instrument getInstrument(String name) {
		Instrument instrument = new Instrument();
		
		// name을 조건으로 select query를 사용.
		
		return instrument;
	}
	
	public ArrayList<Instrument> getInstrumentList(String[] name) {
		ArrayList instList = new ArrayList<Instrument>();
		
		// name을 조건으로 select query를 사용.
		// 복수개의 data를 반환한다.
		
		return instList;
	}
	
	public boolean deleteInstrument() {
		// delete query를 이용해서 DB에서 삭제
		return true;
	}
}
