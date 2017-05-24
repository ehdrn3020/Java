한글/영어/숫자 조사 구분 코드
firstValue : 받침이 있는 조사(이/은/과)
secondValue : 받침이 없는 조사(가/는/와)

public class KoreanUtil {
	
	// 종성을 이용하여 조사 선택해주는 메소드
	public static final String getComleteWordByJongsung(String name, String firstValue, String secondValue) {
		
		char lastName = name.charAt(name.length() - 1);
		System.out.println("lastName:"+lastName);
		
		String selectedValue = null;
		
		// 한글 일 때
		if(lastName >= 0xAC00 && lastName <= 0xD7A3){
			selectedValue = (lastName - 0xAC00) % 28 > 0 ? firstValue : secondValue;
		}
		//영어 일 때
		else if(lastName >= 0x41 && lastName <= 0x5A){
			if(lastName == 'L' || lastName == 'N' || lastName == 'M' || lastName == 'R')//받침
					selectedValue = firstValue;
			else 
				selectedValue = secondValue;
		}
		//숫자 일 때
		else if(lastName >= 0x30 && lastName <= 0x39){
			if(lastName == '2' || lastName =='4' || lastName =='9')
				selectedValue = secondValue;
			else 
				selectedValue = firstValue;
		}
		else{
			selectedValue = "";
		}

		return selectedValue;
	}
}
