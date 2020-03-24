package tdd.junit;

public class RemoveA 

	{

		public String removeA(String string) 
		{
		
			char A[]=string.toCharArray();
			
			int stringLength=A.length;
			switch(stringLength)
			{
			case 0:
				break;
			case 1:
				if(A[0]=='A')
					A[0]=' ';
				break;
				default:
					if(A[0]=='A')
						A[0]=' ';
					if(A[0]!='A'&& A[1]=='A')
					{
						A[1]=A[0];
						A[0]=' ';
					}
					break;
					
			}
			return  new String(A).trim();
		
		}

	
		}
	
	