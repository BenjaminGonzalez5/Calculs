package org.example.Calcul;

/**
 * Hello world!
 *
 */
public class Calcul 
{
	private int operande1 = 0;
    private int operande2 = 0;
    public void Calculs(int operande1, int operande2)
    {
        this.operande1 = operande1;
        this.operande2 = operande2;
    }
    public int multiplier()
    {
        return operande1 * operande2;
    }
    public int additionner()
    {
        return operande1 + operande2;
    }
    public int diviser()
    {
        return operande1 / operande2;
    }
    public int soustraire()
    {
        return operande1 - operande2;
    }
}
