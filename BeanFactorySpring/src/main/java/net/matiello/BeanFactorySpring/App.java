package net.matiello.BeanFactorySpring;

import net.matiello.factory.BeanFactory;
import net.matiello.interfaces.ITeams;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ITeams team = BeanFactory.get("team");
        System.out.println(team.getTeams().toString() );
    }
}
