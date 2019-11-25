package numbers;

public class Initial5PerfectNum {
	public static void main(String[] args) {
		int i,  sum = 0 ;
		int count=0;
				System.out.print("Initial 5 perfect num : ");

        for(int j=2;count<=5;j++)

        {

            sum=1;

            for(i=2;i<j;i++)

            {     if(j%i==0)
            {
                  sum=sum+i;
                  
            }

            }

        if(j==sum)
        {
        	  System.out.print(j+",");
        	  count++;
        }

                

        }
        System.out.println();
        System.out.println(count);
}

	}


