import java.util.Scanner;
/**
 * A fill-in question specifies the answer in the auestion text denotated by '_' characters. For exa,ple:
 *          "The investor of Java was _James Gosling_."
 * 
 * @author jebelfor 
 * @version 1 February 2017
 */
public class FillingQuestion extends Question
{
    /**
     * FillInQuestion overrides the setText method defined in Question
     * 
     * sets the question text
     * 
     * @param questionText the text of this question
     */
    public void setText (String questionText)
    {
        Scanner parser = new Scanner( questionText );
        parser.useDelimiter( "_" );
        String question = parser.next();
        String answer = parser.next();
        question += "_____" + parser.next();
        
        /*
         * User the super reserved word to call the setText and setAnswer methods of the superclass (Question)
         */
        super.setText(question);
        super.setAnswer(answer);
    }
}
