package Stack;
import java.util.*;
public class InfixEvaluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="2+(5-3*6/2)";
			int res=Infixres(s);
			System.out.println(res);
	}

	private static int Infixres(String s) {
		// TODO Auto-generated method stub
		
		Stack<Character> operator=new Stack<>();
		Stack<Integer> operands=new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isDigit(c))
			{
				operands.push(c-'0');
			}
			else if(c=='(')
			{
				operator.push(c);
			}
			else if(c==')')
			{
				while(operator.peek()!='(')
				{
					char cc=operator.pop();
					int v2=operands.pop();
					int v1=operands.pop();
					int ff=operation(v1,v2,cc);
					operands.push(ff);
				}
				operator.pop();
			}
			else if(c=='+' ||c=='-' ||c=='/' ||c=='*')
			{
				while(operator.size()>0 && operator.peek()!='(' && precedence(c)<=precedence(operator.peek()))
				{
					char ccc=operator.pop();
					int val1=operands.pop();
					int val2=operands.pop();
					int ff=operation(val1,val2,ccc);
					operands.push(ff);	
				}
				operator.push(c);
			}	
			
		}
		while(operator.size()>0)
		{
			char ccc=operator.pop();
			int val1=operands.pop();
			int val2=operands.pop();
			int ff=operation(val1,val2,ccc);
			operands.push(ff);
		}
		return operands.peek();
	}

	private static int precedence(char c) {
		// TODO Auto-generated method stub
		if(c=='+' || c=='-')
		{
			return 1;
		}
		else 
		{
			return 2;
		}
		
	}
	
	public static int operation(int a,int b,char c)
	{
		if(c=='+')
		{
			return a+b;
		}
		else if(c=='-')
		{
			return a-b;
		}
		else if(c=='*')
		{
			return a*b;
		}
		else 
		{
			return a/b;
		}
		
	}

}
