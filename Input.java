import java.util.*;
public class Input
{
    String[][] data;
    Input()
    {
         String[][]data={{"0","2","0","0","0","0","0","0","1"},{"0","0","0","0","2","0","3","0","9"},{"0","0","4","0","0","0","0","5","0"},
        {"0","0","5","0","0","0","0","0","0"},
        {"0","9","0","4","0","2","0","8","0"},{"0","0","3","0","8","6","0","0","0"},{"0","0","0","0","0","0","5","0","0"}
        ,{"9","0","2","0","0","5","7","0","0"},{"0","8","0","9","7","0","1","0","2"}};
        this.data=data;
    }
    void takingin()
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter one complete row at a time,blank should be reffered as 0(PLease avoid any spaces!!!)");
        for(int i=0;i<9;i++)
        {
            String rda=sc.next();
            for(int j=0;j<9;j++)
            data[i][j]=rda.charAt(j)+"";
        }
    }
}