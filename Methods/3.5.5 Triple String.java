public String tripleString(String str)
{
  str = str+ str+ str;
	 String tripleString = str;
	 return tripleString;
}


// or you can just do this instead

public String tripleString(String str)
{
    return str.repeat(3);
}
