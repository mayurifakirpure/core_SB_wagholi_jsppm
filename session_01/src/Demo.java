
public class Demo {
	
	//data_mem
	//mem_function
	
	private int dd,mm,yy;//instance var. 
	
	public void initDate()
	{
		dd=mm=yy=1;
	}
	
	public void setDate(int d,int m,int y)
	{
		dd = d;
		mm = m;
		yy = y;
	}
	
	public void displayDate()
	{
		System.out.println("Date = ["+dd+"/"+mm+"/"+yy+"]");
	}
	
	public static void main(String[] args) {
		//Demo d;//reference var
		//d = new Demo();
		Demo d = new Demo();
		System.out.println("d = "+d.dd);
		d.initDate();
		d.displayDate();
		d.setDate(3, 07, 2024);
		d.displayDate();
	}
}
