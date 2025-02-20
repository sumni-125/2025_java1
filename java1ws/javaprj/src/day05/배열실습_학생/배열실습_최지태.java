package day05.배열실습_학생;

public class 배열실습_최지태 {

	public static void main(String[] args) {
		// Y = 0.114 * B + 0.587 * G + 0.299 * R

		int[][][] image = new int[3][10][10]; // 10*10 크기의 이미지 GRB 값 배열
		int[][] image2 = new int[10][10]; // 10*10 크기의 이미지 흑백 값 배열

		for (int k = 0; k < image.length; k++) {
			for (int i = 0; i < image[k].length; i++) {
				for (int j = 0; j < image[k][i].length; j++) {
					image[k][i][j] = (int) (Math.random() * 256);
				}
			}
		}

		for (int k = 0; k < image.length; k++) {
			switch (k) {
			case 0: {
				System.out.println("BLUE");
				break;
			}
			case 1: {
				System.out.println("RED");
				break;
			}
			case 2: {
				System.out.println("GREEN");
				break;
			}
			}
			for (int i = 0; i < image[k].length; i++) {
				for (int j = 0; j < image[k][i].length; j++) {
					System.out.print(image[k][i][j] + "\t");
				}
				System.out.println("");
			}
			System.out.println("");
		}

		for (int i = 0; i < image2.length; i++) {
			for (int j = 0; j < image2[i].length; j++) {
				image2[i][j] = (image[0][i][j] * 114 + image[1][i][j] * 587 + image[2][i][j] * 299) / 1000;
			}
		}

		System.out.println("흑백 이미지 변환");
		for (int i = 0; i < image2.length; i++) {
			for (int j = 0; j < image2[i].length; j++) {
				System.out.print(image2[i][j] + "\t");
			}
			System.out.println("");
		}

	}

}
