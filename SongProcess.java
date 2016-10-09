package Week1_Q1;
/**
 * @author 		Konstantin Frolov
 * Student ID 	R00144177
 * Email		konstantin.frolov@mycit.ie
 * GitHub		https://github.com/ConstantineFrol/repositories
 */
public class SongProcess {

	private int bottlesQty;
	private String songText;
	
	public SongProcess()
	{
		bottlesQty = 99;
		songText = " bottles of beer on the wall";
	}
	
	public SongProcess(int a)
	{
		this.bottlesQty = a;
		songText = " bottles of beer on the wall";
	}
	
	public void showResult()
	{
		do
		{
			if(bottlesQty > 1)
			{
				System.out.println
				(		bottlesQty + songText + "\n" +
						bottlesQty + " bottles of beer\n" +
						"Take one down\n" +
						"Pass it around\n"
				);
				
				bottlesQty--;
				
				if(bottlesQty == 1)
				{
					System.out.println(bottlesQty + " bottle of beer on the wall\n");
				}
				else
				{
					System.out.println(bottlesQty + songText + "\n");
				}
				
			}
			else
			{
				System.out.println
				(		bottlesQty + " bottle of beer on the wall" + "\n" +
						bottlesQty + " bottle of beer\n" +
						"Take one down\n" +
						"Pass it around\n"
				);
				
				bottlesQty--;
				
				System.out.println
				(
						"No more bottles of beer on the wall\n"
				);
			}
		}while(bottlesQty!=0);
		
		System.out.println("--//--//--//--//--//--//--//--//--//--//--//--//--//--//--//--//--//--//\n");
	}
	
	
}
