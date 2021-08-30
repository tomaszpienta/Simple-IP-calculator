import java.util.ArrayList;
import java.util.List;

public class MaskIp {

	public MaskIp() {
	}

	public ArrayList<Integer> cases(int key) {
		AddressIp addressIp = new AddressIp();
		ArrayList<Integer> listIp = new ArrayList<>();
		int tab[] = new int[4];
		switch (key) {
		case 0:
			tab[0] = 0;
			tab[1] = 0;
			tab[2] = 0;
			tab[3] = 0;
			listIp.add(tab[0]);
			listIp.add(tab[1]);
			listIp.add(tab[2]);
			listIp.add(tab[3]);
			break;
		case 1:
			tab[0] = 128;
			tab[1] = 0;
			tab[2] = 0;
			tab[3] = 0;
			listIp.add(tab[0]);
			listIp.add(tab[1]);
			listIp.add(tab[2]);
			listIp.add(tab[3]);
			break;
		case 2:
			tab[0] = 192;
			tab[1] = 0;
			tab[2] = 0;
			tab[3] = 0;
			listIp.add(tab[0]);
			listIp.add(tab[1]);
			listIp.add(tab[2]);
			listIp.add(tab[3]);
			break;
		case 3:
			tab[0] = 224;
			tab[1] = 0;
			tab[2] = 0;
			tab[3] = 0;
			listIp.add(tab[0]);
			listIp.add(tab[1]);
			listIp.add(tab[2]);
			listIp.add(tab[3]);
			break;
		case 4:
			tab[0] = 240;
			tab[1] = 0;
			tab[2] = 0;
			tab[3] = 0;
			listIp.add(tab[0]);
			listIp.add(tab[1]);
			listIp.add(tab[2]);
			listIp.add(tab[3]);
			break;
		case 5:
			tab[0] = 248;
			tab[1] = 0;
			tab[2] = 0;
			tab[3] = 0;
			listIp.add(tab[0]);
			listIp.add(tab[1]);
			listIp.add(tab[2]);
			listIp.add(tab[3]);
			break;
		case 6:
			tab[0] = 252;
			tab[1] = 0;
			tab[2] = 0;
			tab[3] = 0;
			listIp.add(tab[0]);
			listIp.add(tab[1]);
			listIp.add(tab[2]);
			listIp.add(tab[3]);
			break;
		case 7:
			tab[0] = 254;
			tab[1] = 0;
			tab[2] = 0;
			tab[3] = 0;
			listIp.add(tab[0]);
			listIp.add(tab[1]);
			listIp.add(tab[2]);
			listIp.add(tab[3]);
			break;
		case 8:
			tab[0] = 255;
			tab[1] = 0;
			tab[2] = 0;
			tab[3] = 0;
			listIp.add(tab[0]);
			listIp.add(tab[1]);
			listIp.add(tab[2]);
			listIp.add(tab[3]);
			break;
		case 9:
			tab[0] = 255;
			tab[1] = 128;
			tab[2] = 0;
			tab[3] = 0;
			listIp.add(tab[0]);
			listIp.add(tab[1]);
			listIp.add(tab[2]);
			listIp.add(tab[3]);
			break;
		case 10:
			tab[0] = 255;
			tab[1] = 192;
			tab[2] = 0;
			tab[3] = 0;
			listIp.add(tab[0]);
			listIp.add(tab[1]);
			listIp.add(tab[2]);
			listIp.add(tab[3]);
			break;
		case 11:
			tab[0] = 255;
			tab[1] = 224;
			tab[2] = 0;
			tab[3] = 0;
			listIp.add(tab[0]);
			listIp.add(tab[1]);
			listIp.add(tab[2]);
			listIp.add(tab[3]);
			break;
		case 12:
			tab[0] = 255;
			tab[1] = 240;
			tab[2] = 0;
			tab[3] = 0;
			listIp.add(tab[0]);
			listIp.add(tab[1]);
			listIp.add(tab[2]);
			listIp.add(tab[3]);
			break;
		case 13:
			tab[0] = 255;
			tab[1] = 248;
			tab[2] = 0;
			tab[3] = 0;
			listIp.add(tab[0]);
			listIp.add(tab[1]);
			listIp.add(tab[2]);
			listIp.add(tab[3]);
			break;
		case 14:
			tab[0] = 255;
			tab[1] = 252;
			tab[2] = 0;
			tab[3] = 0;
			listIp.add(tab[0]);
			listIp.add(tab[1]);
			listIp.add(tab[2]);
			listIp.add(tab[3]);
			break;
		case 15:
			tab[0] = 255;
			tab[1] = 254;
			tab[2] = 0;
			tab[3] = 0;
			listIp.add(tab[0]);
			listIp.add(tab[1]);
			listIp.add(tab[2]);
			listIp.add(tab[3]);
			break;
		case 16:
			tab[0] = 255;
			tab[1] = 255;
			tab[2] = 0;
			tab[3] = 0;
			listIp.add(tab[0]);
			listIp.add(tab[1]);
			listIp.add(tab[2]);
			listIp.add(tab[3]);
			break;
		case 17:
			tab[0] = 255;
			tab[1] = 255;
			tab[2] = 128;
			tab[3] = 0;
			listIp.add(tab[0]);
			listIp.add(tab[1]);
			listIp.add(tab[2]);
			listIp.add(tab[3]);
			break;
		case 18:
			tab[0] = 255;
			tab[1] = 255;
			tab[2] = 192;
			tab[3] = 0;
			listIp.add(tab[0]);
			listIp.add(tab[1]);
			listIp.add(tab[2]);
			listIp.add(tab[3]);
			break;
		case 19:
			tab[0] = 255;
			tab[1] = 255;
			tab[2] = 224;
			tab[3] = 0;
			listIp.add(tab[0]);
			listIp.add(tab[1]);
			listIp.add(tab[2]);
			listIp.add(tab[3]);
			break;
		case 20:
			tab[0] = 255;
			tab[1] = 255;
			tab[2] = 240;
			tab[3] = 0;
			listIp.add(tab[0]);
			listIp.add(tab[1]);
			listIp.add(tab[2]);
			listIp.add(tab[3]);
			break;
		case 21:
			tab[0] = 255;
			tab[1] = 255;
			tab[2] = 248;
			tab[3] = 0;
			listIp.add(tab[0]);
			listIp.add(tab[1]);
			listIp.add(tab[2]);
			listIp.add(tab[3]);
			break;
		case 22:
			tab[0] = 255;
			tab[1] = 255;
			tab[2] = 252;
			tab[3] = 0;
			listIp.add(tab[0]);
			listIp.add(tab[1]);
			listIp.add(tab[2]);
			listIp.add(tab[3]);
			break;
		case 23:
			tab[0] = 255;
			tab[1] = 255;
			tab[2] = 254;
			tab[3] = 0;
			listIp.add(tab[0]);
			listIp.add(tab[1]);
			listIp.add(tab[2]);
			listIp.add(tab[3]);
			break;
		case 24:
			tab[0] = 255;
			tab[1] = 255;
			tab[2] = 255;
			tab[3] = 0;
			listIp.add(tab[0]);
			listIp.add(tab[1]);
			listIp.add(tab[2]);
			listIp.add(tab[3]);
			break;
		case 25:
			tab[0] = 255;
			tab[1] = 255;
			tab[2] = 255;
			tab[3] = 128;
			listIp.add(tab[0]);
			listIp.add(tab[1]);
			listIp.add(tab[2]);
			listIp.add(tab[3]);
			break;
		case 26:
			tab[0] = 255;
			tab[1] = 255;
			tab[2] = 255;
			tab[3] = 192;
			listIp.add(tab[0]);
			listIp.add(tab[1]);
			listIp.add(tab[2]);
			listIp.add(tab[3]);
			break;
		case 27:
			tab[0] = 255;
			tab[1] = 255;
			tab[2] = 255;
			tab[3] = 224;
			listIp.add(tab[0]);
			listIp.add(tab[1]);
			listIp.add(tab[2]);
			listIp.add(tab[3]);
			break;
		case 28:
			tab[0] = 255;
			tab[1] = 255;
			tab[2] = 255;
			tab[3] = 240;
			listIp.add(tab[0]);
			listIp.add(tab[1]);
			listIp.add(tab[2]);
			listIp.add(tab[3]);
			break;
		case 29:
			tab[0] = 255;
			tab[1] = 255;
			tab[2] = 255;
			tab[3] = 248;
			listIp.add(tab[0]);
			listIp.add(tab[1]);
			listIp.add(tab[2]);
			listIp.add(tab[3]);
			break;
		case 30:
			tab[0] = 255;
			tab[1] = 255;
			tab[2] = 255;
			tab[3] = 252;
			listIp.add(tab[0]);
			listIp.add(tab[1]);
			listIp.add(tab[2]);
			listIp.add(tab[3]);
			break;
		case 31:
			tab[0] = 255;
			tab[1] = 255;
			tab[2] = 255;
			tab[3] = 254;
			listIp.add(tab[0]);
			listIp.add(tab[1]);
			listIp.add(tab[2]);
			listIp.add(tab[3]);
			break;
		case 32:
			tab[0] = 255;
			tab[1] = 255;
			tab[2] = 255;
			tab[3] = 255;
			listIp.add(tab[0]);
			listIp.add(tab[1]);
			listIp.add(tab[2]);
			listIp.add(tab[3]);
			break;
		}

		int tab1[] = { 128, 64, 32, 16, 8, 4, 2, 1 };
		ArrayList<Integer> list = new ArrayList<>();
		for (int li : listIp) {
			for (int i : tab1) {
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

		System.out.println("Net mask: " + listIp.get(0)+"."+listIp.get(1)+"."+listIp.get(2)+"."+listIp.get(3));

		System.out.print("Mask binary form: ");
		addressIp.showList(oktet1);
		System.out.print(".");
		addressIp.showList(oktet2);
		System.out.print(".");
		addressIp.showList(oktet3);
		System.out.print(".");
		addressIp.showList(oktet4);
		System.out.println();

		return list;

	}
}
