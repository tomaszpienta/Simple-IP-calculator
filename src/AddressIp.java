import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressIp {
	Scanner keyboard = new Scanner(System.in);

	public AddressIp() {
	}

	public void showList(List<Integer> listInt) {
		for (int el : listInt) {
			System.out.print(el + "");
		}
	}

	public ArrayList<Integer> ipAddresses() {
    	System.out.println("Provide IP Address: ");
        ArrayList<Integer> listIp = new ArrayList<>();
        int ips[] = new int[4];
		for (int i : ips) {
			ips[i] = keyboard.nextInt();
			listIp.add(ips[i]);
		}

        int tab[] = {128, 64, 32, 16, 8, 4, 2, 1};

        ArrayList<Integer> list = new ArrayList<>();
        for (int li : listIp) {
            for (int i : tab) {
                if (li >= i) {
                    int a = li - i;
                    list.add(1);
                    li = a;
                } else {
                    list.add(0);
                }
            }
        }

        List<Integer> oktet1 = list.subList(0, 8);
        List<Integer> oktet2 = list.subList(8, 16);
        List<Integer> oktet3 = list.subList(16, 24);
        List<Integer> oktet4 = list.subList(24, 32);

        System.out.println(
                "Address Ip: " + listIp.get(0) + "." + listIp.get(1) + "." + listIp.get(2) + "." + listIp.get(3));

        System.out.print("Binary form: ");

        showList(oktet1);
        System.out.print(".");
        showList(oktet2);
        System.out.print(".");
        showList(oktet3);
        System.out.print(".");
        showList(oktet4);
        System.out.println();
        return list;
    }

}
