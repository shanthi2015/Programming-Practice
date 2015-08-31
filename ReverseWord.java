package edu.wbqa.strings;

public class ReverseWord {
	
	public static String reverseWordByWord(String str){
        int strLeng = str.length()-1;
        String reverse = "", temp = "";

        for(int i = 0; i <= strLeng; i++){
            temp += str.charAt(i);
            if((str.charAt(i) == ' ') || (i == strLeng)){
                for(int j = temp.length()-1; j >= 0; j--){
                    reverse += temp.charAt(j);
                    if((j == 0) && (i != strLeng))
                        reverse += " ";
                }
                temp = "";
            }
        }
        return reverse;
    }

	public static void main(String[] args) {
		ReverseWord rw=new ReverseWord();
		String str = "hello world";
		String result=rw.reverseWordByWord(str);
		System.out.println(result);
		
	}

}
