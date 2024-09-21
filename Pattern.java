package Pattern;

public class Pattern {
    public void  numberIncreasingPyramidPattern(int n){
        int i=1,j=1,num=1;
        for(i=1; i<=n ; ++i){
            for(j=1;j<=n;++j){
                if(i>=j){
                    //System.out.print(j +" "); for numberIncreasingPyamidPattern
                    if((i+j)%2==0)  //For print 0 and 1
                        System.out.print("1 ");
                    else System.out.print("0 ");
                }
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }

    }
    public void numberIncreasingReversePyramidPattern(int n){
        int i=1,j=1;
        for(i=1; i<=n ; ++i){
            for(j=1;j<=n;++j){
                if(i+j < n+2 )
                    System.out.print(j +" ");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
    public void SquareHollowPattern(int n){
        int i=1,j=1;
        for(i=1; i<=n ; ++i){
            for(j=1;j<=n;++j){
                if(i==1 || j==1 || i==n || j==n )
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("\n");
        }
    }

    public void NumbertrianglePattern(int n){
        int i=1,j=1,count=0;
        for(i=1; i<=n ; ++i){
            for(j=1; j<=2*n; ++j){
                int ij = i+j;
                if(count<i && ij >= (n+1) && ij % 2 == 1 ){
                    System.out.print(i);
                    ++count;
                }
                else System.out.print(" ");
            }
            System.out.print("\n");
            count=0;
        }
    }

}

