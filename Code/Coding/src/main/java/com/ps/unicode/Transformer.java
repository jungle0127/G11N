package com.ps.unicode;

public class Transformer {
	public Transformer(){
		
	}
	public void printChinese(){
		for(int beginIndex = 0x4e00;beginIndex <= 0x9Fff; beginIndex++){
			System.out.println(Character.toChars(beginIndex));
		}
		System.out.println(Character.toChars(0x9fd5));
		Integer.toHexString(Character.codePointAt("张", 0));
	}
	public boolean isCJK(char c){
		Character.UnicodeBlock ub = Character.UnicodeBlock.of(c);
        if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
                || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B
                || ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION || ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS
                || ub == Character.UnicodeBlock.GENERAL_PUNCTUATION) {
            return true;
        }
        return false;
	}
}
