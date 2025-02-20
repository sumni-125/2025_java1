package day05.배열실습_학생;

public class 배열실습2_최지태 {

	public static void main(String[] args) {
		final int Y_MAX = 55;
		final int X_MAX = 138;
		final int Y_SET = Y_MAX / 2;
		final int X_SET = X_MAX / 2;
		final char NULLCHAR = ' ';
		final char MARK = '●';
		char[][] graph = new char[Y_MAX][X_MAX];

		for (int i = 0; i < graph.length; i++) {
			for (int j = 0; j < graph[i].length; j++) {
				if (i == graph.length / 2 || i == 0 || i == graph.length - 1) {
					graph[i][j] = '=';
				} else if (j == graph[i].length / 2 || j == 0 || j == graph[i].length - 1) {
					graph[i][j] = '|';
				} else {
					graph[i][j] = NULLCHAR;
				}
			}
		}

		// y = x**2 / 50 - 15

		double x = -X_SET;
		double y;

		for (int i = 0; i < X_MAX; i++) {
			double a = x * -1;
			y = Y_SET;
			y += (a * a) / 50 - 15;
			y = (int) (Math.round(y));
			if (y < 0 || y >= Y_MAX) {
				x++;
				continue;
			}
			graph[(int) y][(int) (x + X_SET)] = MARK;
			x++;
		}

		// y = x
		x = -X_SET;
		for (int i = 0; i < X_MAX; i++) {
			double a = x * -1;
			y = Y_SET;
			y += a;
			y = (int) (Math.round(y));
			if (y < 0 || y >= Y_MAX) {
				x++;
				continue;
			}
			graph[(int) y][(int) (x + X_SET)] = MARK;
			x++;
		}

		// y = -x / 4
		x = -X_SET;
		for (int i = 0; i < X_MAX; i++) {
			double a = x * -1;
			y = Y_SET;
			y += -1 * a / 4;
			y = (int) (Math.round(y));
			if (y < 0 || y >= Y_MAX) {
				x++;
				continue;
			}
			graph[(int) y][(int) (x + X_SET)] = MARK;
			x++;
		}

		for (int i = 0; i <= graph.length; i++) {
			for (int j = 0; j < graph[i].length; j++) {
				System.out.print(graph[i][j]);
			}
			System.out.print("\n");
		}
	}

}
