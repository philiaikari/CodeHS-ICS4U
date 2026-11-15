public String repeatString(String str, int n)
{
  String text = "";
  
  for (int i = 0; i < n; i++) 
      {
        text = text + str;
      }
      
    return text;
}

//or you can simple just

public String repeatString(String str, int n)
{
    return str.repeat(n);
}