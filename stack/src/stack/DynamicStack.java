package stack;

public class DynamicStack extends CustomStack
{
	public DynamicStack() 
	{
		super();
	}
	public DynamicStack(int val)
	{
		super(val);
	}
	@Override
	public boolean push(int val) throws Exception
	{
		if(this.isFull())
		{
			int[] temp = new int[data.length*2];
			for(int i=0;i<size;i++)
			{
				temp[i]=data[i];
			}
			data=temp;
		}
		return super.push(val);
	}
}
