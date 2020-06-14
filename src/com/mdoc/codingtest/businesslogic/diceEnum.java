package com.mdoc.codingtest.businesslogic;

public enum diceEnum {
	
	ONE(1),TWO(2),THREE(3),FOUR(4),FIVE(5),SIX(6);
	
	private final int i ;
	
	private  diceEnum(int i) {
		this.i=i;
	}

	public int getNumber() {
		return i;
	}
}
