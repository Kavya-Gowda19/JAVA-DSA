1. A 
   B C 
   D E F 
   G H I J 
   K L M N O

package pack.com;
import java.util.*;
public class Alphabets {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int i,j;
		int ch=65;                              //ASCII value for A starts from 65
		for( i=1;i<=n;i++) {
			for( j=1;j<=i;j++)
			{
				System.out.print((char)ch + " ");     //(char)ch is important
				ch+=1;
			}
			System.out.println("");
	}
}
}

2.
*  *  *  *  *  *  *  *  *  *  * 
 *  *        *  *  *        *  * 
 *     *  *     *     *  *     * 
 *     *  *     *     *  *     * 
 *  *        *  *  *        *  * 
 *  *  *  *  *  *  *  *  *  *  * 
 *  *        *  *  *        *  * 
 *     *  *     *     *  *     * 
 *     *  *     *     *  *     * 
 *  *        *  *  *        *  * 
 *  *  *  *  *  *  *  *  *  *  * 
package pack.com;
import java.util.Scanner;
public class PatternUni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      
      System.out.println("Enetr the number");
      int n=s.nextInt();
      for(int i=0;i<=n-1;i++) {
    	  for(int j=0;j<=n-1;j++) {
    		  if(i==0||i==(n-1)||j==0||j==(n-1)||i==(n/2)||j==(n/2)||i==j||i+j==(n-1)||i+j==(n/2)||j-i==(n/2)||i-j==(n/2)||i+j==(n-1)+n/2)
{
    			  System.out.print(" * ");
    		  }
    		  else {
    			  System.out.print("   ");
    		   
    	  }
    	
    	  }
    	  System.out.println("");
	}

	}
}



3.
  # # # # # #     # # # # # # #       # # # # # # #   # # # # # # #     # # # # # # # #   # # # # # # # #   # # # # # # # #   #             #   #             # 
#             #   #             #   #                 #             #   #                 #                         #         # #         # #   #             # 
#             #   #             #   #                 #             #   #                 #                         #         #   #     #   #   #             # 
#             #   #             #   #                 #             #   #                 #                         #         #     # #     #   #             # 
# # # # # # # #   # # # # # # #     #                 #             #   # # # # # # # #   #       # # # #   #       #         #       #     #   #             # 
#             #   #             #   #                 #             #   #                 #             #   #       #         #             #     #         #   
#             #   #             #   #                 #             #   #                 #             #   #       #         #             #       #     #     
#             #   # # # # # # #       # # # # # # #   # # # # # # #     #                 # # # # # # # #   # # # # #         #             #         # #       



package pack.com;
import java.util.Scanner;
public class AlphabetsPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the Size");
   int n=s.nextInt();
   int i,j;
   for( i=0;i<n;i++) {
   //A
	   for( j=0;j<n;j++) {
		   if(j==0 && i!=0 || i==0 && j!=0 && j!=(n-1)||i==(n/2)||j==(n-1)&& i!= 0) {
			   System.out.print("# ");  
		   }
		   else {
			   System.out.print("  "); //two space *_ here __
		   }
	   }
	  
   //B
	   System.out.print("  ");
	   for( j=0;j<n;j++) {
		   if(j==0||i==0 && j!=(n-1)||i==(n-1)&&j!=(n-1)||j==(n-1)&& i!=0 && i!=(n-1) && i!=(n/2)  ||i==(n/2)&& j!=(n-1) ) 
		   {
			   System.out.print("# ");  
		   }
		   else {
			   System.out.print("  "); 
		   }
	    
	 
   }
   //C
	   System.out.print("  ");
   for( j=0;j<n;j++) {
	   if(j==0 && i!=0 && i!=(n-1)|| i==0 && j!=0 ||i==(n-1)&& j!=0) {
		   System.out.print("# ");  
	   }
	   else {
		   System.out.print("  "); 
	   }
   }
	   
	 //D
       System.out.print("  ");
	   for( j=0;j<n;j++) {
		   if(j==0||i==0 && j!=(n-1)||i==(n-1)&&j!=(n-1)||j==(n-1)&& i!=0 && i!=(n-1) ) 
		   {
			   System.out.print("# ");  
		   }
		   else {
			   System.out.print("  "); 
		   }
   } 
	   //F
	   System.out.print("  ");
	   for( j=0;j<n;j++) {
		   if(j==0||i==0 ||i==(n/2) ) 
		   {
			   System.out.print("# ");  
		   }
		   else {
			   System.out.print("  "); 
		   }
	    
	 
   }
	 //G
	   System.out.print("  ");
	   for( j=0;j<n;j++) {
		   if(j==0||i==0||i==(n-1)||j==(n-1)&& i>=(n/2)||i==(n/2)&& j>=(n/2)) 
		   {
			   System.out.print("# ");  
		   }
		   else {
			   System.out.print("  "); 
		   }	 
   }
	   //J
	   System.out.print("  ");
	   for( j=0;j<n;j++) {
		   if(i==0||i==(n-1)&& j<=(n/2)||j==(n/2)||j==0 && i>=(n/2)) 
		   {
			   System.out.print("# ");  
		   }
		   else {
			   System.out.print("  "); 
		   }	 
   }
	 //M
	   System.out.print("  ");
	   for( j=0;j<n;j++) {
		   if(j==0||j==(n-1)||i==j&& j<=(n/2)||i+j==(n-1)&&j>=(n/2)) 
		   {
			   System.out.print("# ");  
		   }
		   else {
			   System.out.print("  "); 
		   }	 
   }
	 //V
	   System.out.print("  ");
	   for( j=0;j<n;j++) {
		   if(j==0&& i<=(n/2)||j==(n-1) && i<=(n/2)||i-j==(n/2)||(i+j)==(n-1)+n/2) 
		   {
			   System.out.print("# ");  
		   }
		   else {
			   System.out.print("  "); 
		   }	 
	   }
   System.out.println("");
}

}
}
// 1. #
package pack.com;
import java.util.Scanner;
public class Patterns {
	public static void main(String[] args) {	
		System.out.println("#");
	}

}

// 2.#
     #
     #
     #
     #

package pack.com;
import java.util.Scanner;
public class Patterns {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
  System.out.println("Enter the number");
  int n=s.nextInt();
  for(int i=0;i<=n;i++{
		System.out.println("#");
	}
}
}


//3.#####

package pack.com;
import java.util.Scanner;
public class Patterns3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print("#");
		}	
	}
}

//4.#####
    #####
    #####
    #####
    #####

package pack.com;
import java.util.Scanner;
public class Patterns4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("#");
			}
			System.out.println("");
		}
	}
}


//5.1 1 1 1 1 
    2 2 2 2 2 
    3 3 3 3 3 
    4 4 4 4 4 
    5 5 5 5 5

package pack.com;
import java.util.Scanner;
public class Patterns5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(i+" ");
			}
			System.out.println("");
		}
	}
}

//6.1 2 3 4 5 
    1 2 3 4 5 
    1 2 3 4 5 
    1 2 3 4 5 
    1 2 3 4 5

package pack.com;
import java.util.Scanner;
public class Patterns6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}
}

//7.1 2 3 4 5 
    6 7 8 9 10 
    11 12 13 14 15 
    16 17 18 19 20 
    21 22 23 24 25 
package pack.com;
import java.util.Scanner;
public class Patterns7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				count+=1;
				System.out.print(count+" ");
			}
			System.out.println("");
		}
	}
}

//8.25 24 23 22 21 
    20 19 18 17 16 
    15 14 13 12 11 
    10 9 8 7 6 
    5 4 3 2 1

package pack.com;
import java.util.Scanner;
public class Patterns8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int i,j;
		int count=n*n;
		for( i=1;i<=n;i++) {
			for( j=1;j<=n;j++)
			{
				
				System.out.print(count+" ");
				count-=1;
			}
			System.out.println("");
		}
	}
}

//9.1 6 11 16 21 
    2 7 12 17 22 
    3 8 13 18 23 
    4 9 14 19 24 
    5 10 15 20 25

package pack.com;
import java.util.*;
public class Patterns9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int i,j;
		for( i=1;i<=n;i++) {
			count=i;
			for( j=1;j<=n;j++)
			{
				System.out.print(count+" ");
				count=count+n;
			}
			System.out.println("");
		}
	}
}

//10.# # # # # * * * * * 
     # # # # # * * * * * 
     # # # # # * * * * * 
     # # # # # * * * * * 
     # # # # # * * * * * 

package pack.com;
import java.util.*;
public class Patterns10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int i,j;
		for( i=1;i<=n;i++) {	
			for( j=1;j<=n;j++)
			{
				System.out.print("# ");		
			}
			for( j=1;j<=n;j++)
			{
				System.out.print("* ");			
			}
			System.out.println("");
	}
}
}

//11.
     * 
     * * 
     * * * 
     * * * * 
     * * * * *

package pack.com;
import java.util.*;
public class Patterns11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int i,j;
		for( i=1;i<=n;i++) {
			for( j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}

//12.1 
     2 2 
     3 3 3 
     4 4 4 4 
     5 5 5 5 5 


package pack.com;
import java.util.*;
public class Patterns12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int i,j;
		for( i=1;i<=n;i++) {
			for( j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println("");
		}
	}
	}

//13.1 
     1 2 
     1 2 3 
     1 2 3 4 
     1 2 3 4 5    

package pack.com;
import java.util.*;
public class Patterns13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int i,j;
        for( i=1;i<=n;i++) {
            for( j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
	}
}

//14.1 
     2 3 
     4 5 6 
     7 8 9 10 
     11 12 13 14 15


package pack.com;
import java.util.*;
public class Patterns14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int i,j;
        int count=1;
        for( i=1;i<=n;i++) {
            for( j=1;j<=i;j++)
            {
                System.out.print(count+" ");
                count+=1;

            }
            System.out.println("");
        }
}
}

//15.# # # # # % 
     # # # # # % % 
     # # # # # % % % 
     # # # # # % % % % 
     # # # # # % % % % % 

package pack.com;
import java.util.*;
public class Patterns14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int i,j;
        int count=0;
        for( i=1;i<=n;i++) {
            for( j=1;j<=n;j++)
            {
                System.out.print("# ");
            }
            for( j=1;j<=i;j++)
            {
                System.out.print("% ");
            }
            System.out.println("");
        }
}
}

//16.* * * * * 
     * * * * 
     * * * 
     * * 
     *
package pack.com;
import java.util.*;
public class Patterns14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int i,j;
        for( i=1;i<=n;i++) {
            for(j=n;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
}
}

//17.- - - - - # # # # # 
     - - - - # # # # # 
     - - - # # # # # 
     - - # # # # # 
     - # # # # # 

package pack.com;
import java.util.*;
public class Patterns14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
	      int i,j;
	        for( i=1;i<=n;i++) {
	            for( j=n;j>=i;j--)
	            {
	                System.out.print("- ");
	            }
	            for( j=0;j<n;j++)
	            {
	                System.out.print("# ");
	            }
	            System.out.println("");
	        }
}
}

//18.- # # # # # 
     - - # # # # # 
     - - - # # # # # 
     - - - - # # # # # 
     - - - - - # # # # #

package pack.com;
import java.util.*;
public class Patterns14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int i,j;
        for( i=1;i<=n;i++) {
            for( j=1;j<=i;j++)
            {
                System.out.print("- ");
            }
            for( j=0;j<n;j++)
            {
               System.out.print("# ");
            }
            System.out.println("");
        }
}
}

//19.- - - - - # 
     - - - - # # # 
     - - - # # # # # 
     - - # # # # # # # 
     - # # # # # # # # # 

package pack.com;
import java.util.*;
public class Patterns14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int i,j;
        for (i = 1; i <= n; i++) {
            for (j=n; j>=i;j--) { 
                System.out.print("- ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            for (j = 2; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println("");
        }
   }
}
 
