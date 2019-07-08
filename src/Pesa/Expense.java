package Pesa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravinder's PC
 */
public class Expense {
    private double balance=0;
    private double exp =0;
    private double inc =0;
    private  String name;
    public void setName(String s)
    {
        this.name = s;
    }
    public String getName()
    {
        return this.name;
    }
    public void credit(double amt)
    {
        this.inc+=amt;
    }
    public void debit(double amt)
    {
        this.exp-=amt;
    }
    public void reset()
    {
        this.balance=0;
    }
    public double getBal()
    {
        return this.balance;
    }
    public void setBal(Double b)
    {
        this.balance = b;
    }
    public double getExp()
    {
        return this.exp;
    }
    public double getInc()
    {
        return this.inc;
    }
    public void setExp(double amt)
    {
        this.exp = amt;
    }
    public void setInc(double amt)
    {
        this.inc = amt;
    }
    public String InttoMonth(int a)
    {
        String s="";
        switch (a)
        {
            case 1: s="January";
            break;
            case 2: s= "February";
            break;
            case 3: s= "March";
            break;
            case 4: s="April";
            break;
            case 5: s="May";
            break;
            case 6: s="June";
            break;
            case 7: s="July";
            break;
            case 8: s="August";
            break;
            case 9: s="September";
            break;
            case 10: s="October";
            break;
            case 11: s="November";
            break;
            case 12: s="December";
            break;
            
        }
        return s;
    }
}
