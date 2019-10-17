
public class SortCommandLine {
	public static void main(String[] args)
	{
		int i,j;
		int val[]= new int[args.length];
		System.out.println("command line Array before sorting is:");
		for(i=0;i<args.length;i++) {
		 val[i]=Integer.valueOf(args[i]);
			 System.out.println(val[i]);
		}
		
		for( i=0;i<args.length;i++) {
			for(j=0;j<args.length-1;j++)    {
				if(val[j]>val[j+1]) {
					int a=val[j];
					val[j]=val[j+1];
					val[j+1]=a;
				}
				
			}
		
		}
		System.out.println("command line Array after sorting is:");
		for(i=0;i<args.length;i++) {
			System.out.println(val[i]);	
		}
	
	
}}
