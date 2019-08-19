
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhonny Rojas
 */
public class OrdenarNum {
    
    private int num;
    
    private int i,j;
    
    private int listaNum[];
   

    
    public OrdenarNum() {
    }
    
    public void Orden(){
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el numero de datos; ");
        num= lector.nextInt();
        listaNum= new int [num];
        for(i=0; i<num; i++){
            System.out.println("Numero"+(i+1)+": ");
            listaNum [i]= lector.nextInt();
        }
        
        System.out.println("----------------------------------------");
        System.out.println("Esto son los numeros que usted ingreso: ");
        for(int nume : listaNum){
            System.out.println(nume);
            
        }
        
        
        
        int aux;
        for(i=0; i < num; i++){
            for(j=i+1; j < num; j++){
                if(listaNum[i] > listaNum[j]){
                    aux=listaNum[i];
                    listaNum[i]=listaNum[j];
                    listaNum[j]=aux;
                }
            }
            
        }
        System.out.println("--------------------------------------------------");
        System.out.println("Estos son los numero ordenados de menos a mayor: (");
        for(i=0; i < num; i++){
            System.out.println(listaNum[i]+", ");
            
        }
        System.out.println(") ");
        
        
        
    }
    
}
