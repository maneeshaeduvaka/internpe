public class namedforloop {
    public static void main(String args[]){
        int i,j;
        loop1:      for(i=1;i<=10;i++){
            System.out.println();
            loop2:     for(j=1;j<=10;j++){
                System.out.println(j+"");
                if(j==8)
                    break loop1;
            }
        }
    }
}
