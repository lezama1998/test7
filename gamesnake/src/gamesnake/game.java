/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gamesnake;

/**
 *
 * @author Veevart 3
 */
public class game {

    public game() {
    }
    
   private int []tablero={0,
        0,0,+12,0,0,
        +11,0,0,+9,+2,
        0,0,0,-10,0,
        0,0,0,-11,0,
        0,-2,0,-8,0,
        -2,-3,-4,-5,-6
        
            
			};


private int casilla=0;


private static String ganador;


public int dados()
	{
	return (int)(Math.random()*(6)+1);
	}



public void avanzar()
	{ 
            while (casilla<25){
	int d;
	
	d=dados();

        System.out.println(" Dado arroja "+d);
	casilla=casilla+d;
	
	
	if(tablero[casilla]>0)
		{
		casilla=casilla+tablero[casilla];
		
		System.out.println(" has escalado  hasta la casilla "+casilla);
                }
	if(tablero[casilla]<0)
		{
		casilla=casilla+tablero[casilla];
		
		System.out.println(" Has retrocedido hasta la casilla "+casilla);
                }
	
        System.out.println(" estas en la casilla "+casilla);
	if(casilla>=25)
	{
	
	
	System.out.println(" felicidades has ganado "+casilla);
	}
//return casilla;

	} 
    
    
    
        }
    
    
} //final
