import java.util.Random;
public class PhraseOMatic{
	public static void main(String[] args){
		String[] wordListOne ={"agnostic","opinionated","voiceactivated","haptically driven","extensible","reactive","agent based","functional","AI enabled","strongly typed"};
		String[] wordListTwo = {"Loosely coupled","six sigma","asynchronous","event driven","pub-sub","IoT","cloud native","service oriented","containerized","serverless","microservices","distributed ledger"};
		String[] wordListThree = {"framework","library","DSL","REST API","repository","pipeline","service mesh","architecture","prespective","design","orientation"};
		
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;

		Random rand = new Random();
		int rand1 = rand.nextInt(oneLength);
		int rand2 = rand.nextInt(twoLength);
		int rand3 = rand.nextInt(threeLength);

		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

		System.out.println("What we need is a " + phrase);
	}
}