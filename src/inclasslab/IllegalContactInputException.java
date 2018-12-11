/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclasslab;

/**
 *
 * @author 16473
 */
public class IllegalContactInputException extends RuntimeException {

    public IllegalContactInputException() 
    {
        super("PLease enter the valid information");
    } 
    
    public IllegalContactInputException(String message) 
    {
        super(message);
    } 
    
    public IllegalContactInputException(Throwable throwable) 
    {
        super(throwable);
    } 
    
    public IllegalContactInputException( String message , Throwable throwable) 
    {
        super(message , throwable);
    } 
    
    
}
