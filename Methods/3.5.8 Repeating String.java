public String repeatString(String str, int n)
{
  String text = "";
  
  for (int i = 0; i < n; i++) 
      {
        text = text + str;
      }
      
    return text;
}

//or you can simple just do this instead

public String repeatString(String str, int n)
{
    return str.repeat(n);
}