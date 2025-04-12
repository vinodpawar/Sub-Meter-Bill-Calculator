import java.util.Scanner;
public class TenantLightBillCalculator {

	// Declarations
	public static float meterOneBill, meterOneUnits, rsPerUnit, currentReadingShops, previousReadingShops,
			unitsConsumedShops, currentReadingBlock1, previousReadingBlock1, unitsConsumedBlock1, currentReadingBlock2,
			previousReadingBlock2, unitsConsumedBlock2, shopsBill, Block1Bill, Block2Bill;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Get MSEB bill and units consumed for current month
		System.out.println("Enter MSEB bill amount for xx3051:");
		meterOneBill = scanner.nextFloat();
		System.out.println("Enter MSEB units consumed on xx3051:");
		meterOneUnits = scanner.nextFloat();
		rsPerUnit = (meterOneBill / meterOneUnits);
		// System.out.println(String.format("%.2f", rsPerUnit));

		// Get previous reading of sub-meter
		System.out.println("Enter previous reading for Shop 1 and 2:");
		previousReadingShops = scanner.nextFloat();
		unitsConsumedShops = currentReadingShops - previousReadingShops;
		System.out.println("Enter previous reading for Block 1:");
		previousReadingBlock1 = scanner.nextFloat();
		unitsConsumedBlock1 = currentReadingBlock1 - previousReadingBlock1;
		System.out.println("Enter previous reading for Block 2");
		previousReadingBlock2 = scanner.nextFloat();

		// Get current reading of sub-meter
		System.out.println("Enter current reading for Shop 1 and 2 (Chat Bhandar):");
		currentReadingShops = scanner.nextFloat();
		System.out.println("Enter current reading for Block 1:");
		currentReadingBlock1 = scanner.nextFloat();
		System.out.println("Enter current reading for Block 2:");
		currentReadingBlock2 = scanner.nextFloat();

		// Calculating the units consumed by indivisuals
		unitsConsumedBlock2 = currentReadingBlock2 - previousReadingBlock2;
		scanner.close();

		// finding bill for indivisuals
		shopsBill = unitsConsumedShops * rsPerUnit;
		Block1Bill = unitsConsumedBlock1 * rsPerUnit;
		Block2Bill = unitsConsumedBlock2 * rsPerUnit;

		System.out.println("Actual bill: " + meterOneBill);
		float genBill = shopsBill + Block1Bill + Block2Bill;
		System.out.println("Generated bill: " + genBill);
		
		// Checking if MSEB bill and Generated bill matches
		if (meterOneBill == genBill) {

			System.out.println(shopsBill);
			System.out.println(Block1Bill);
			System.out.println(Block2Bill);
		}

		else {

			// Adjusting bill if MSEB bill and Generated bill do not match
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
