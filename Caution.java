public class Caution extends Input//NO ERRORS HERE  
{
    public boolean checker()
    {
        for(int i=0;i<9;i++)
        for(int j=0;j<9;j++)
        if(data[i][j].length()!=1||data[i][j].charAt(0)==('0'))
        return true;
        return false;
    }
    public String present(int a,int b)
    {
      String q="";
      for(int i=1;i<=9;i++)
      {
          boolean f=true;
          for(int j=0;j<9&&f;j++)
          if(data[a][j].equals(i+"")||data[j][b].equals(i+""))
          f=false;
          for(int j=(a/3)*3;j<(a/3)*3+3&&f;j++)
          for(int pr=(b/3)*3;pr<(b/3)*3+3&&f;pr++)
          if(data[j][pr].equals(i+"")&&data[j][pr].length()==1)
          f=false;
          if(f)
          q+=i;
      }
      return q;
    }
    
}