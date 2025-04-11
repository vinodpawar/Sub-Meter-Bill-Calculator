import java.util.Scanner;

public class TenantLightBillCalculator {

	public static void main(String[] args) {

		/*
		 * input ----- bill amount and unit consumed for xx3051; Shop 1+2, Block 1,
		 * Block 2 bill amount and unit consumed for xx0644; Home + 1 BHK
		 * 
		 * Reading recorded on 15th day of previous month Reading recorded on 15th day
		 * of previous month
		 * 
		 * Do you need adjustments?
		 */

		// Main meter bill amount
		float meterOneBill = 0.0f;
		float meterOneUnits = 0.0f;
		float rsPerUnit = 0.0f;

		// Meter readings - current and previous for Shop 1 and 2 (Chat Bhandar)
		float currentReadingShops = 0.0f;
		float previousReadingShops = 0.0f;
		float unitsConsumedShops = 0.0f;

		// Meter readings - current and previous for Advocate
		float currentReadingBlock1 = 0.0f;
		float previousReadingBlock1 = 0.0f;
		float unitsConsumedBlock1 = 0.0f;

		// Meter readings - current and previous for Tailor
		float currentReadingBlock2 = 0.0f;
		float previousReadingBlock2 = 0.0f;
		float unitsConsumedBlock2 = 0.0f;

		// Final bill
		float shopsBill = 0.0f;
		float Block1Bill = 0.0f;
		float Block2Bill = 0.0f;

		Scanner scanner = new Scanner(System.in);

		// Get Amount, Unit and Rupees per unit for xx3051
		System.out.println("Enter bill amount for 490012183051:");
		meterOneBill = scanner.nextFloat();
		System.out.println("Enter units consumed on 490012183051:");
		meterOneUnits = scanner.nextFloat();
		rsPerUnit = (meterOneBill / meterOneUnits);
		// System.out.println(String.format("%.2f", rsPerUnit));

		// Get current and prev reading for Shop 1 and 2 and find units consumed
		System.out.println("Enter current reading for Shop 1 and 2 (Chat Bhandar):");
		currentReadingShops = scanner.nextFloat();
		System.out.println("Enter previous reading for Shop 1 and 2 (Chat Bhandar):");
		previousReadingShops = scanner.nextFloat();
		unitsConsumedShops = currentReadingShops - previousReadingShops;

		// Get current and prev reading for Block 1 and find units consumed
		System.out.println("Enter current reading for Block 1:");
		currentReadingBlock1 = scanner.nextFloat();
		System.out.println("Enter previous reading for Block 1:");
		previousReadingBlock1 = scanner.nextFloat();
		unitsConsumedBlock1 = currentReadingBlock1 - previousReadingBlock1;

		// Get current and prev reading for Block 2 and find unit consumed
		System.out.println("Enter current reading for Block 2:");
		currentReadingBlock2 = scanner.nextFloat();
		System.out.println("Enter previous reading for Block 2");
		previousReadingBlock2 = scanner.nextFloat();
		unitsConsumedBlock2 = currentReadingBlock2 - previousReadingBlock2;
		scanner.close();

		// finding bill for indivisuals
		shopsBill = unitsConsumedShops * rsPerUnit;
		Block1Bill = unitsConsumedBlock1 * rsPerUnit;
		Block2Bill = unitsConsumedBlock2 * rsPerUnit;

		System.out.println("Actual bill: " + meterOneBill);
		float genBill = shopsBill + Block1Bill + Block2Bill;
		System.out.println(genBill);
		if (meterOneBill == genBill) {

			System.out.println(shopsBill);
			System.out.println(Block1Bill);
			System.out.println(Block2Bill);
		}

		else {

			float diffForEach = (meterOneBill - (shopsBill + Block1Bill + Block2Bill)) / 3;
			System.out.println("Shop 1 and 2: ");
			System.out.println(shopsBill + diffForEach);
			System.out.println("Block 1: ");
			System.out.println(Block1Bill + diffForEach);
			System.out.println("Block 2: ");
			System.out.println(Block2Bill + diffForEach);
		}

	}

}
