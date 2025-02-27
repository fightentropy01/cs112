//Martin Murphy
//10/26/2014
//CS112
//Project 3





import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VehicleDatabase 
{

	public static void main(String[] args) 
	{
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//MAIN
		
		//Count
		
	//	System.out.println("\n");
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		int count = 0;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		//     I/O
		
		
		//Scanner


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		File inputFile = new File(args[0]);
		Scanner LineScan = null, WordScan;
		
		
		
		//nullpoint!!!! calls args
		Vehicle[] DBV = null;

		
		
		
		// trycatch
		try 
		{
			LineScan = new Scanner(inputFile);
		} catch (FileNotFoundException e)
		{
			System.out.println("Null try again. Look for " + e);
		}

		if (LineScan.hasNext())
		{
			int size = LineScan.nextInt();
			DBV = new Vehicle[size];
		}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//Iter



///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		while (LineScan.hasNext()) 
		{
			String nextLine = LineScan.nextLine();
			WordScan = new Scanner(nextLine);
			WordScan.useDelimiter("\\s*,\\s*");
			
			
			
			//
			while (WordScan.hasNext())
			{
				String ClassType = WordScan.next();
				
				
				
				//Class
				
				
				//TEMP HOLDS*
				//array process
				
				//temp
				if (ClassType.contains("Sedan")) 
				{
					String manufacturer = WordScan.next().trim();
					String numWheels_temp = WordScan.next().trim();
					
					//
					int numWheels = Integer.parseInt(numWheels_temp);
					String mpg_temp = WordScan.next().trim();
					
					//
					double mpg = Double.parseDouble(mpg_temp);
					String numSeats_temp = WordScan.next().trim();
					
					
					
					
					//temp
					int numSeats = Integer.parseInt(numSeats_temp);
					String model = WordScan.next().trim();
					String type_temp = WordScan.next().trim();
					SedanTypes type = SedanTypes.valueOf(type_temp);
					String numCylinders_temp = WordScan.next().trim();
					
					//temp
					int numCylinders = Integer.parseInt(numCylinders_temp);
					String horsepower_temp = WordScan.next().trim();
					
					
					//temp holds
					double horsepower = Double.parseDouble(horsepower_temp);
					DBV[count] = new Sedan(manufacturer, numWheels, mpg, numSeats, model, type, numCylinders, horsepower);
					count++;
				} 
				
				//Class
				
				
				
				//
				else if (ClassType.contains("Truck")) 
				
				{
					String manufacturer = WordScan.next().trim();
					String numWheels_temp = WordScan.next().trim();
					
					
					//trim
					int numWheels = Integer.parseInt(numWheels_temp);
					String mpg_temp = WordScan.next().trim();
					
					
					
					
					
					//trim
					double mpg = Double.parseDouble(mpg_temp);
					String numSeats_temp = WordScan.next().trim();
					
					//trim
					int numSeats = Integer.parseInt(numSeats_temp);
					String model = WordScan.next().trim();
					String numAxles_temp = WordScan.next().trim();
					
					
					
					
					//
					int numAxles = Integer.parseInt(numAxles_temp);
					String grossVehicleMass_temp = WordScan.next().trim();
					
					//Count
					int grossVehicleMass = Integer.parseInt(grossVehicleMass_temp);
					String type_temp = WordScan.next().trim();
					TruckTypes type = TruckTypes.valueOf(type_temp);
					DBV[count] = new Truck(manufacturer, numWheels, mpg,
							numSeats, model, numAxles, grossVehicleMass, type);
					count++;
				} 
				
				//Class
				
				
				
				else if (ClassType.contains("MotorCycle")) 
				{
					String manufacturer = WordScan.next().trim();
					String numWheels_temp = WordScan.next().trim();
					
					
					//<>
					
					
					int numWheels = Integer.parseInt(numWheels_temp);
					String model = WordScan.next().trim();
					String weight_temp = WordScan.next().trim();
					
					//**
					
					int weight = Integer.parseInt(weight_temp);
					String horsepower_temp = WordScan.next().trim();
					
					
					//&&
					int horsepower = Integer.parseInt(horsepower_temp);
					String mpg_temp = WordScan.next().trim();
					double mpg = Double.parseDouble(mpg_temp);
					DBV[count] = new MotorCycle(manufacturer, numWheels, model, weight, horsepower, mpg);
					count++;
				} 
				
				
				
				
				
				else if (ClassType.contains("Bicycle")) 
				
				
				
				{
					String manufacturer = WordScan.next().trim();
					String numWheels_temp = WordScan.next().trim();
					
					
					//&&
					int numWheels = Integer.parseInt(numWheels_temp);
					String model = WordScan.next().trim();
					String weight_temp = WordScan.next().trim();
					
					//***
					int weight = Integer.parseInt(weight_temp);
					String CBP = WordScan.next().trim();
					
					
					//$$$
					int caloriesBurnedPerHour = Integer.parseInt(CBP);
					String hasGears_temp = WordScan.next().trim();
					
					//@@@
					boolean hasGears = Boolean.parseBoolean(hasGears_temp);
					String hasSuspensions_temp = WordScan.next().trim();
					boolean hasSuspensions = Boolean.parseBoolean(hasSuspensions_temp);
					
					
					DBV[count] = new Bicycle(manufacturer, numWheels, model, weight, caloriesBurnedPerHour, hasGears, hasSuspensions);
					count++;
				} 
				
				
				
				
				
				//Safe check
				
				else
				
				{
				System.out.println("Sorry something went wrong.");
				System.out.println();
				}
			}
		}
		System.out.println("Inventory");
		
		
		
		
		
		
		
		for (int i = 0; i < DBV.length; i++) 
		{
			System.out.println(DBV[i].toString());
		}
		System.out.println("\n");
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ignor class casing



///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		Scanner InputScan = new Scanner(System.in);
		System.out.println("Pick catagory:");
		
		System.out.println("\n");
		
		String ClassName = InputScan.next();
//comp
		
		
		
		
		//nocasesense

		while (ClassName.compareToIgnoreCase("Sedan")!=0&&
				ClassName.compareToIgnoreCase("MotorCycle")!=0&&
				ClassName.compareToIgnoreCase("Bicycle")!=0&&
				ClassName.compareToIgnoreCase("Truck")!=0)
		
		
		
		
		//Advise
			
			//select  options
		{
			System.out.println("Select from Sedan,  MotorCycle,Bycle, or Truck please. ");
			
			ClassName = InputScan.next();
		}

		
		for (int i = 0; i < DBV.length; i++)
		{
			if (DBV[i].getClassName().compareToIgnoreCase(ClassName) == 0) 
			
			{
				System.out.println(DBV[i].toString());
			}
		}

		System.out.println("\n");
		
		
		System.out.println("\n");
//Most tested is manufact
		
		System.out.println("Selection sort by manufacturer is preffered");
		
		String algX = InputScan.next().trim();
//comp
		//ignore
		
		while (algX.compareToIgnoreCase("manufacturer")!=0&&
				algX.compareToIgnoreCase("numWheels")!=0)
			
			
			
			
			
		//Bin search can be sporadic in results
		{
			System.out.println("Please type carefully ");
			
			algX = InputScan.next();
		}

		
		selectionSort(DBV, algX);
		
		
		
		
		System.out.println("\n");

		
		for (int i = 0; i < DBV.length; i++) 
		{
		System.out.println(DBV[i].toString());
		}
		System.out.println("\n");

		
		System.out.println("Search for a model");
		
		String name = InputScan.next().trim();
		
		//SORTS ALGS
		
		while (BinarySearch(DBV, name) == null)
		{
			System.out.println("Sorry not found");
			
			name = InputScan.next().trim();
		}
		System.out.println(BinarySearch(DBV, name).toString());

	}
	
	
	
	
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////


//Selection  rearrange

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void selectionSort(Vehicle[] list, String HowToSort)
	{
		int min;
		Vehicle temp;
		for (int index = 0; index < list.length - 1; index++)
		{
			min = index;
			for (int scan = index + 1; scan < list.length; scan++) 
			{
				if (HowToSort.compareToIgnoreCase("manufacturer") == 0) 
				{
					if (list[scan].manufacturer.compareTo(list[min].manufacturer) < 0)
						min = scan;
				}
				if (HowToSort.compareToIgnoreCase("numWheels") == 0) 
				{
					if (list[scan].numWheels < list[min].numWheels)
						min = scan;
				}
			}
			
			temp = list[min];
			list[min] = list[index];
			list[index] = temp;
		}
	}
	
	
	
	
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Bin Search
	//mid = (min + max) / 2;


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static Vehicle BinarySearch(Vehicle[] list, String name) 
	{
		int min = 0, max = list.length -1 , mid = 0;
		boolean Done = false;
		while (!Done && min <= max) 
		{
			mid = (min + max) / 2;
			if (list[mid].manufacturer.contains(name))
				Done = true;
			else if (list[mid].manufacturer.compareToIgnoreCase(name)>0)
				max = mid - 1;
			else
				min = mid + 1;
		}
		if (Done)
			return list[mid];
		else
			return null;
	}
} 
