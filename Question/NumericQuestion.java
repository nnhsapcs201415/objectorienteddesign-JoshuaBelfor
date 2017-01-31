/**
 * Write a description of class NumericQuestion here.
 * 
 * @author jebelfor 
 * @version (1/31/17)
 */
public class NumericQuestion extends Question
{    
    /*
     * We dont need to define text or answer as instance variables as they 
     *  are inherited from question
     *  
     *  
     *  We do need a new instance variable for the answer as a double.
     */
    private double numericAnswer;
    /**
     * Constructor for objects of class NumericQuestion
     */
    public NumericQuestion()
    {

    }

    /**
     * The numericquestion class is overloading the setAnswer method defined in the 
     *  Question class.
     *  
     *  
     *  Sets tehe answer for this question
     *  
     *  @param correctResponse the answer
     */
    public void setAnswer(double correctResponse)
    {
        this.numericAnswer = correctResponse;
    }

    /**
    *T he NumericQuestion class overides the checkAnswer method defined
    *   in the Question class
    * @param response the response to check
    * @return true if the response was correct, false otherwise
     */
    public boolean checkAnswer(String response)
    {
        double responseAsDouble = Double.parseDouble (response);
        return Math.abs(responseAsDouble - numericAnswer) <= 0.01;
    }    
}