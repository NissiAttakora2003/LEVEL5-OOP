
public class WordProcessor implements Counter
{
	
		
	public int countWords(String sentence)
	{
		int wordCount=0;
		String[] words;
		words=sentence.split(" ");
		for(int i=0;i<words.length;i++)
		{
			if(!(words[i].isEmpty())){

				wordCount+=1;
			}
		}
		System.out.println("the number of words in the sentence is : "+wordCount );
		
		return wordCount;
		}
	public int countLetters (String sentence)
	{
		String []words;
		int letterCount=0;
		words=sentence.split(" ");
		for(int i=0;i<words.length;i++)
		{
			if(!(words[i].isEmpty())){
				String word="";
				word=words[i];
				for(int j=0;j<word.length();j++){
					letterCount+=1;
					}
			}
			
		}
		System.out.println("the number of letters are: "+ letterCount);
		return letterCount;
		}
	public int getLength (String sentence) {
		System.out.println("the lenghth of the data inserted is :" + sentence.length());
		return 0;}


}
