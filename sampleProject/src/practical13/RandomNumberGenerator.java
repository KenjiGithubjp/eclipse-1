package practical13;

import java.util.Random;
// ランダムな数字を設定

public class RandomNumberGenerator {

	   
		Random random = new Random();

		// 1-9の数字、ランダムに設定、表示
		public int randomNumber() {
			return  random.nextInt(9) + 1;
		}
	}
