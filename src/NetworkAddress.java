import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NetworkAddress {
	static Scanner keyboard = new Scanner(System.in);

	public void binnaryForm(ArrayList list) {
		AddressIp addressIp = new AddressIp();
		List<Integer> okt1 = list.subList(0, 8);
		List<Integer> okt2 = list.subList(8, 16);
		List<Integer> okt3 = list.subList(16, 24);
		List<Integer> okt4 = list.subList(24, 32);

		addressIp.showList(okt1);
		System.out.print(".");
		addressIp.showList(okt2);
		System.out.print(".");
		addressIp.showList(okt3);
		System.out.print(".");
		addressIp.showList(okt4);
		System.out.println();
	}

	public ArrayList<Object> calc(ArrayList<Integer> list) {
		int tab[] = { 128, 64, 32, 16, 8, 4, 2, 1 };
		List<Integer> oktet1 = list.subList(0, 8);
		List<Integer> oktet2 = list.subList(8, 16);
		List<Integer> oktet3 = list.subList(16, 24);
		List<Integer> oktet4 = list.subList(24, 32);

		ArrayList<Object> arrayList = new ArrayList<>();
		ArrayList<Object> ar = new ArrayList<>();
		ArrayList<Object> ar1 = new ArrayList<>();
		ArrayList<Object> ar2 = new ArrayList<>();
		ArrayList<Object> ar3 = new ArrayList<>();

		for (int i = 0; i < oktet1.size(); i++) {
			if (oktet1.get(i) == 1) {
				ar.add(oktet1.get(i) * tab[i]);
			} else if (oktet1.get(i) == 0) {
				ar.add(oktet1.get(i) * 0);
			}
		}
		for (int i = 0; i < oktet2.size(); i++) {
			if (oktet2.get(i) == 1) {
				ar1.add(oktet2.get(i) * tab[i]);
			} else if (oktet2.get(i) == 0) {
				ar1.add(oktet2.get(i) * 0);
			}
		}
		for (int i = 0; i < oktet3.size(); i++) {
			if (oktet3.get(i) == 1) {
				ar2.add(oktet3.get(i) * tab[i]);
			} else if (oktet3.get(i) == 0) {
				ar2.add(oktet3.get(i) * 0);
			}
		}
		for (int i = 0; i < oktet4.size(); i++) {
			if (oktet4.get(i) == 1) {
				ar3.add(oktet4.get(i) * tab[i]);
			} else if (oktet4.get(i) == 0) {
				ar3.add(oktet4.get(i) * 0);
			}
		}
		int a = 0;
		int c[] = new int[4];
		for (int i = 0; i <= 7; i++) {
			int b = (int) ar.get((int) i);
			a = b + a;
			if (i == 7) {
				c[0] = a;
				arrayList.add(a);

			}
		}
		int a1 = 0;
		for (int i = 0; i <= 7; i++) {
			int b = (int) ar1.get((int) i);
			a1 = b + a1;
			if (i == 7) {
				c[1] = a1;
				arrayList.add(a1);
			}
		}
		int a2 = 0;
		for (int i = 0; i <= 7; i++) {
			int b = (int) ar2.get((int) i);
			a2 = b + a2;
			if (i == 7) {
				c[2] = a2;
				arrayList.add(a2);
			}
		}
		int a3 = 0;
		for (int i = 0; i <= 7; i++) {
			int b = (int) ar3.get((int) i);
			a3 = b + a3;
			if (i == 7) {
				c[3] = a3;
				arrayList.add(a3);
			}
		}
		return arrayList;
	}

	public void calculate() {
		MaskIp ip = new MaskIp();
		AddressIp addressIp = new AddressIp();

		System.out.print("Provide Mask (0-32): ");
		int mask = keyboard.nextInt();

		ArrayList<Integer> binaryIp = addressIp.ipAddresses();
		ArrayList<Integer> binaryMack = ip.cases(mask);

		ArrayList<Integer> networkAddres = new ArrayList<>();
		for (int i = 0; i <= 31; i++) {

			if (binaryIp.get(i) == 1 && binaryMack.get(i) == 1) {
				networkAddres.add(1);
			} else if (binaryIp.get(i) == 0 && binaryMack.get(i) == 1) {
				networkAddres.add(0);
			} else if (binaryIp.get(i) == 1 && binaryMack.get(i) == 0) {
				networkAddres.add(0);
			} else if (binaryIp.get(i) == 0 && binaryMack.get(i) == 0) {
				networkAddres.add(0);
			}
		}

		System.out.print("Binary Network Address: ");
		binnaryForm(networkAddres);

		ArrayList<Object> list = calc(networkAddres);

		ArrayList<Integer> broadcast = new ArrayList<>();
		int counter = 0;
		for (int i = 0; i < networkAddres.size(); i++) {
			counter++;
			if (counter <= mask) {
				broadcast.add(networkAddres.get(i));
			} else if (counter >= mask && networkAddres.get(i) == 0) {
				broadcast.add(1);
			}
		}

		System.out.println("Network Address: " + list.get(0) + "." + list.get(1) + "." + list.get(2) + "." + list.get(3)
				+ "/" + mask);

		System.out.println("Broadcast IP: " + calc(broadcast).get(0) + "." + calc(broadcast).get(1) + "."
				+ calc(broadcast).get(2) + "." + calc(broadcast).get(3));

		System.out.print("Broadcast IP binary: ");
		binnaryForm(broadcast);

		int counter2 = 0;
		int hosts = 0;
		for (int i = 0; i < networkAddres.size(); i++) {
			if (i >= mask) {
				counter2++;
				if (i == 31) {
					hosts = (int) Math.pow(2, counter2) - 2;
					System.out.println("Hosts count: " + hosts);

				}
			}

		}

		if (hosts != 0) {

			ArrayList<Integer> hostMin = new ArrayList<>();
			counter = 0;
			for (int i = 0; i < networkAddres.size(); i++) {
				counter++;
				if (i >= networkAddres.size() - 1) {
					hostMin.add(1);
				} else {
					hostMin.add(networkAddres.get(i));
				}
			}
			System.out.println("Host Min IP: " + calc(hostMin).get(0) + "." + calc(hostMin).get(1) + "."
					+ calc(hostMin).get(2) + "." + calc(hostMin).get(3));

			ArrayList<Integer> hostMax = new ArrayList<>();
			counter = 0;
			for (int i = 0; i < broadcast.size(); i++) {
				counter++;
				if (i >= broadcast.size() - 1) {
					hostMax.add(0);
				} else {
					hostMax.add(broadcast.get(i));
				}
			}
			System.out.println("Host Max IP: " + calc(hostMax).get(0) + "." + calc(hostMax).get(1) + "."
					+ calc(hostMax).get(2) + "." + calc(hostMax).get(3));
		} else {
			System.out.println("No hosts available - point to point");
		}
	}

}
