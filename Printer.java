public class Printer extends DataMultiCheck
{
    public void settlingIn()
    {
        do
        {
            
            for(int i=0;i<9;i++)
            for(int j=0;j<9;j++)
            if(data[i][j].length()!=1||data[i][j].charAt(0)=='0')
            data[i][j]=present(i,j);
             printer();
            for(int i=0;i<5;i++)
            test();
            for(int i=0;i<9&&checker();i++)
            {
                datamulticheckrow(i);
                test();
                test();
                datamulticheckcolumn(i);
                test();
                test();
            }
            /*
            System.out.println("\n\n");
            datamulticheckblock(0,0);test();
            datamulticheckblock(0,3);test();
            datamulticheckblock(0,6);test();
            datamulticheckblock(3,0);test();
            datamulticheckblock(3,3);test();
            datamulticheckblock(3,6);test();
            datamulticheckblock(6,0);test();
            datamulticheckblock(6,3);test();
            datamulticheckblock(6,6);test();*/
            printer();
            System.out.println("\n\n");
        }
        while(checker());
    }
    public void printer()
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            System.out.print(data[i][j]+"\t");
            System.out.println();
        }
    }
    public void test()
    {
        for(int i=0;i<9;i++)
        for(int j=0;j<9;j++)
        {
            if(data[i][j].length()!=1||data[i][j].equals('0'+""))
            data[i][j]=present(i,j);
        }
    }
}