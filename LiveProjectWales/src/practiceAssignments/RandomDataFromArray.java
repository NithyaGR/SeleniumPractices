package practiceAssignments;

import java.util.Random;

public class RandomDataFromArray {

	
	public static void main(String[] args) {

		String[] dataFields = new String [13];
		dataFields[0] = "FirstName";
		dataFields[1] = "LastName";
		dataFields[2] = "License";
		dataFields[3] = "SSN";
		dataFields[4] = "Address";
		dataFields[5] = "Age";
		dataFields[6] = "Weight";
		dataFields[7] = "Height";
		dataFields[8] = "City";
		dataFields[9] = "State";
		dataFields[10] = "ZipCode";
		dataFields[11] = "ProviderInfo";
		dataFields[12] = "InsuranceInfo";
		int length = dataFields.length;
		Random rand = new Random();
		int number = rand.nextInt(13);
		System.out.println(number);

		for(int i=0; i<number; i++){
			int num = rand.nextInt(length);
			System.out.println(dataFields[num]);
		}

		String licenseValue = 9999999+ rand.nextInt(89999999)+"";
		System.out.println(licenseValue);
		

		String state = "";
		String[] sArray = new String [50];
		sArray[0] = "Alabama";sArray[1] = "Alaska";sArray[2] = "Arizona";sArray[3] = "Arkansas";sArray[4] = "California";
		sArray[5] = "Colorado";sArray[6] = "Connecticut";sArray[7] = "Delaware";sArray[8] = "Florida";sArray[9] = "Georgia";
		sArray[10] = "Hawaii";sArray[11] = "Idaho";sArray[12] = "Illinois";sArray[13] = "Indiana";sArray[14] = "Iowa";
		sArray[15] = "Kansas";sArray[16] = "Kentucky";sArray[17] = "Louisiana";sArray[18] = "Maine";sArray[19] = "Maryland";
		sArray[20] = "Massachusetts";sArray[21] = "Michigan";sArray[22] = "Minnesota";sArray[23] = "Mississippi";sArray[24] = "Missouri";
		sArray[25] = "Montana";sArray[26] = "Nebraska";sArray[27] = "Nevada";sArray[28] = "New Hampshire";sArray[29] = "New Jersey";
		sArray[30] = "New Mexico";sArray[31] = "New York";sArray[32] = "North Carolina";sArray[33] = "North Dakota";sArray[34] = "Ohio";
		sArray[35] = "Oklahoma";sArray[36] = "Oregon";sArray[37] = "Pennsylvania";sArray[38] = "Rhode Island";sArray[39] = "South Carolina";
		sArray[40] = "South Dakota";sArray[41] = "Tennessee";sArray[42] = "Texas";sArray[43] = "Utah";sArray[44] = "Vermont";
		sArray[45] = "Virginia";sArray[46] = "Washington";sArray[47] = "West Virginia";sArray[48] = "Wisconsin";sArray[49] = "Wyoming";
		int num = rand.nextInt(49);
		state = sArray[num];
		System.out.println(state);		
		


	}

}
