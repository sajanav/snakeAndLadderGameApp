package com.mdoc.codingtest.businesslogicImpl;

import java.util.HashMap;
import java.util.Map;

import com.mdoc.codingtest.businesslogic.SnakeAndLadderService;

public class SnakeAndLadderServiceImpl {

	
	public Map<Integer, Integer> processGame(int input,int previousPosition,int previouscredit) {
		
		HashMap <Integer, Integer> gameResult =  new HashMap<Integer,Integer>();
		int currentPostion=previousPosition+input ;
		
		int currentCredit = calculateCreditBasedOnPosition(currentPostion,previouscredit);
		int finalPosition = calculatePostionBasedOnGame(currentPostion);
		gameResult.put(finalPosition, currentCredit);
		return gameResult;
	}

	private int calculatePostionBasedOnGame(int currentPostion) {
		
        int finalPostion =currentPostion;
        switch(currentPostion) {
        case 14:
        	finalPostion =2;
        case 43:
        	finalPostion =41;
        case 47:
            finalPostion =37;
        case 23 :
           finalPostion =8;
        case 12 :
        	finalPostion =26;
        case 24 :
        	finalPostion =33;
        case 35 :
        	finalPostion =36;
        case 5 :
        	finalPostion =10;
        case 16 :
        	finalPostion =29;
        case 40 :
        	finalPostion =45;
        default:
        	finalPostion=currentPostion;
        
        }
		return finalPostion;
	}

	private int calculateCreditBasedOnPosition(int currentPostion,int previouscredit ) {
       
		if(isLadderAvailable(currentPostion)){
			
			return previouscredit+=100;
		}
	    if(isSnakePresent(currentPostion)) {
	    	return previouscredit-=100;
	    }
	    if(isFurtherMovePossible(currentPostion)){
	    	
	    	return previouscredit-=10;
	    }
		return previouscredit;
	}

	private boolean isFurtherMovePossible(int currentPostion) {
		
		if(currentPostion > 49) {
			return true;
		}
		return false;
	}

	private boolean isSnakePresent(int currentPostion) {
		
		if(currentPostion == 14 ||currentPostion == 43 ||currentPostion==47||currentPostion==23) {
			return true;
		}
		return false;
	}

	private boolean isLadderAvailable(int currentPostion) {
		
		if(currentPostion == 5 ||currentPostion == 12 ||currentPostion==16||currentPostion==40||currentPostion==24||currentPostion==35) {
			return true;
		}
		return false;
		
	}

	
	
	
}
