
/**
 * Write a description of class Ejercicios here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicios{
    // secuencia de serie 
     public String Ejercio1(int n){
        int anterior=0;
        int numero=2;
        int saltos=4;
        String Serie="";
        for(int i=1;i<=n;i++){
            if(i<3){
                anterior=i;
            }else{
                if(i>2){
                    if(numero==2){
                        anterior+=numero;
                        numero=1;
                    }else{
                        
                        if(saltos==i){
                            anterior+=3;
                            saltos=saltos*2;
                        }else{
                            anterior+=numero;
                        }
                        numero=2;
                    }
                }
            }
            if(i<n){
                Serie+=anterior+",";
            }else{
                Serie+=anterior+"";
            }
            

        }
        return Serie;
    }
    //sucesion de Padovan
    public String Ejercicio2(int n){
        int  p[] = new int[n];
        int i;
        String sucesPadovan="";
        for(i=0;i<n;i++){
            if(i<=2){
                p[i]=1;
            }else{
                p[i]=p[i-2]+p[i-3];
              
            }
            if(i<n){
                sucesPadovan+=p[i]+"";
            }else{
                sucesPadovan+=p[i]+"";
            }
            
        }
        return sucesPadovan;    
    }
}
