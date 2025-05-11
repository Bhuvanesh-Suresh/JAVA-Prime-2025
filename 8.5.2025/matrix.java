public class matrix {
    public static void main(String[] args) {
        int[][] mat={{5,0,0},{0,5,0},{0,0,5}};
        boolean flag=true;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat.length;j++)
            {
                // System.out.print(mat[i][j]);
                if(i!=j && mat[i][j]!=0)
                {
                    flag=false;
                    break;

                }
            }
            // System.out.println(" ");
            if(!flag)
            {
                break;
            }
        }
        if(flag==true)
        {
            System.out.println("Diagonal");
        }
        else
        {
            System.out.println("Not diagonal");
        }
    }
}
