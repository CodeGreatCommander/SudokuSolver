public class DataMultiCheck extends Caution
{
    public void datamulticheckrow(int i)
    {
        for(int n=1;n<=9;n++)
        {
            String addr="";
            for(int j=0;j<9;j++)
            {
                if(data[i][j].indexOf(n+"")>-1&&data[i][j].length()>1)
                addr+=j;
            }
            if(addr.length()==1)
            data[i][addr.charAt(0)-48]=n+"";
        }
    }
    public void datamulticheckcolumn(int j)
    {
        for(int n=1;n<=9;n++)
        {
            String addr="";
            for(int i=0;i<9;i++)
            {
                if(data[i][j].indexOf(n+"")>-1&&data[i][j].length()>1)
                addr+=i;
            }
            if(addr.length()==1)
            data[addr.charAt(0)-48][j]=n+"";
        }
    }
    public void datamulticheckblock(int a,int b)
    {
        for(int n=1;n<=9;n++)
        {
            String addr="";
            for(int i=a/3*3,k=0;k<3;k++,i++)
            for(int j=b/3*3,x=0;x<3;x++,j++)
                if(data[i][j].indexOf(n+"")>-1&&data[i][j].length()>1)
                addr+=i+","+j;
            
            if(addr.length()==3)
            data[addr.charAt(0)-48][addr.charAt(2)-48]=n+"";
        }
    }
}