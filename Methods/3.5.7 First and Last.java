public String firstAndLast(String str) {
    
    char charFirst = str.charAt(0);
    char charLast = str.charAt(str.length()-1);
	return "" + charFirst + charLast;
}
