
import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import javax.swing.JOptionPane;
import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

public class PrintingEngine extends StepperMotor{   
   
    int l=64;    
   String chs[]=new String[l],font,temp1,temp2; 
   int nos[]=new int[l],a=0;
   StepperMotor sm=new StepperMotor();
   final GpioController gpio = GpioFactory.getInstance();
   GpioPinDigitalOutput pin1,pin2,pin3;
   int ch[][][]=new int[65][3][2];
   DataProcessing dp=new DataProcessing();
          
          private void Mapping()
          {
              // space is 0 indexed;
              ch[0][0][0]=0; ch[0][0][1]=0; 
              ch[0][1][0]=0; ch[0][1][1]=0;
              ch[0][2][0]=0; ch[0][2][1]=0;              
              //characters begin
              ch[1][0][0]=1; ch[1][0][1]=0; 
              ch[1][1][0]=0; ch[1][1][1]=0;
              ch[1][2][0]=0; ch[1][2][1]=0;
              
              ch[2][0][0]=0; ch[2][0][1]=1; 
              ch[2][1][0]=0; ch[2][1][1]=0;
              ch[2][2][0]=0; ch[2][2][1]=0;
              
              ch[3][0][0]=0; ch[3][0][1]=0; 
              ch[3][1][0]=1; ch[3][1][1]=0;
              ch[3][2][0]=0; ch[3][2][1]=0;
              
              ch[4][0][0]=0; ch[4][0][1]=0; 
              ch[4][1][0]=0; ch[4][1][1]=1;
              ch[4][2][0]=0; ch[4][2][1]=0;
              
              ch[5][0][0]=0; ch[5][0][1]=0; 
              ch[5][1][0]=0; ch[5][1][1]=0;
              ch[5][2][0]=1; ch[5][2][1]=0;
              
              ch[6][0][0]=0; ch[6][0][1]=0; 
              ch[6][1][0]=0; ch[6][1][1]=0;
              ch[6][2][0]=0; ch[6][2][1]=1;
              
              ch[7][0][0]=1; ch[7][0][1]=1; 
              ch[7][1][0]=0; ch[7][1][1]=0;
              ch[7][2][0]=0; ch[7][2][1]=0;              
              
              ch[8][0][0]=1; ch[8][0][1]=0; 
              ch[8][1][0]=1; ch[8][1][1]=0;
              ch[8][2][0]=0; ch[8][2][1]=0;              
              
              ch[9][0][0]=1; ch[9][0][1]=0; 
              ch[9][1][0]=0; ch[9][1][1]=1;
              ch[9][2][0]=0; ch[9][2][1]=0;              
              
              ch[10][0][0]=1; ch[10][0][1]=0; 
              ch[10][1][0]=0; ch[10][1][1]=0;
              ch[10][2][0]=1; ch[10][2][1]=0;
              
              ch[11][0][0]=1; ch[11][0][1]=0; 
              ch[11][1][0]=0; ch[11][1][1]=0;
              ch[11][2][0]=0; ch[11][2][1]=1;
              
              ch[12][0][0]=0; ch[12][0][1]=1; 
              ch[12][1][0]=1; ch[12][1][1]=0;
              ch[12][2][0]=0; ch[12][2][1]=0;
              
              ch[13][0][0]=0; ch[13][0][1]=1; 
              ch[13][1][0]=0; ch[13][1][1]=1;
              ch[13][2][0]=0; ch[13][2][1]=0;
              
              ch[14][0][0]=0; ch[14][0][1]=1; 
              ch[14][1][0]=0; ch[14][1][1]=0;
              ch[14][2][0]=1; ch[14][2][1]=0;              
                       
              ch[15][0][0]=0; ch[15][0][1]=1; 
              ch[15][1][0]=0; ch[15][1][1]=0;
              ch[15][2][0]=0; ch[15][2][1]=1;
              
              ch[16][0][0]=1; ch[16][0][1]=1; 
              ch[16][1][0]=1; ch[16][1][1]=0;
              ch[16][2][0]=0; ch[16][2][1]=0;
              
              ch[17][0][0]=1; ch[17][0][1]=1; 
              ch[17][1][0]=0; ch[17][1][1]=1;
              ch[17][2][0]=0; ch[17][2][1]=0;
              
              ch[18][0][0]=1; ch[18][0][1]=1; 
              ch[18][1][0]=0; ch[18][1][1]=0;
              ch[18][2][0]=1; ch[18][2][1]=0;
              
              ch[19][0][0]=1; ch[19][0][1]=1; 
              ch[19][1][0]=0; ch[19][1][1]=0;
              ch[19][2][0]=0; ch[19][2][1]=1;
              
              ch[20][0][0]=0; ch[20][0][1]=0; 
              ch[20][1][0]=1; ch[20][1][1]=1;
              ch[20][2][0]=0; ch[20][2][1]=0;
              
              ch[21][0][0]=0; ch[21][0][1]=0; 
              ch[21][1][0]=1; ch[21][1][1]=0;
              ch[21][2][0]=1; ch[21][2][1]=0;
              
              ch[22][0][0]=0; ch[22][0][1]=0; 
              ch[22][1][0]=1; ch[22][1][1]=0;
              ch[22][2][0]=0; ch[22][2][1]=1;
              
              ch[23][0][0]=1; ch[23][0][1]=0; 
              ch[23][1][0]=1; ch[23][1][1]=1;
              ch[23][2][0]=0; ch[23][2][1]=0;
              
              ch[24][0][0]=1; ch[24][0][1]=0; 
              ch[24][1][0]=1; ch[24][1][1]=0;
              ch[24][2][0]=1; ch[24][2][1]=0;
              
              ch[25][0][0]=1; ch[25][0][1]=0; 
              ch[25][1][0]=1; ch[25][1][1]=0;
              ch[25][2][0]=0; ch[25][2][1]=1;
              
              ch[26][0][0]=0; ch[26][0][1]=1; 
              ch[26][1][0]=1; ch[26][1][1]=1;
              ch[26][2][0]=0; ch[26][2][1]=0;
              
              ch[27][0][0]=0; ch[27][0][1]=1; 
              ch[27][1][0]=1; ch[27][1][1]=0;
              ch[27][2][0]=1; ch[27][2][1]=0;
              
              ch[28][0][0]=0; ch[28][0][1]=1; 
              ch[28][1][0]=1; ch[28][1][1]=0;
              ch[28][2][0]=0; ch[28][2][1]=1;
              
              ch[29][0][0]=1; ch[29][0][1]=1; 
              ch[29][1][0]=1; ch[29][1][1]=1;
              ch[29][2][0]=0; ch[29][2][1]=0;
              
              ch[30][0][0]=1; ch[30][0][1]=1; 
              ch[30][1][0]=1; ch[30][1][1]=0;
              ch[30][2][0]=1; ch[30][2][1]=0;
              
              ch[31][0][0]=1; ch[31][0][1]=1; 
              ch[31][1][0]=1; ch[31][1][1]=0;
              ch[31][2][0]=0; ch[31][2][1]=1;
              
              ch[32][0][0]=0; ch[32][0][1]=0; 
              ch[32][1][0]=0; ch[32][1][1]=1;
              ch[32][2][0]=1; ch[32][2][1]=0;
              
              ch[33][0][0]=0; ch[33][0][1]=0; 
              ch[33][1][0]=0; ch[33][1][1]=1;
              ch[33][2][0]=0; ch[33][2][1]=1;
              
              ch[34][0][0]=1; ch[34][0][1]=0; 
              ch[34][1][0]=0; ch[34][1][1]=1;
              ch[34][2][0]=1; ch[34][2][1]=0;
              
              ch[35][0][0]=1; ch[35][0][1]=0; 
              ch[35][1][0]=0; ch[35][1][1]=1;
              ch[35][2][0]=0; ch[35][2][1]=1;
              
              ch[36][0][0]=1; ch[36][0][1]=1; 
              ch[36][1][0]=0; ch[36][1][1]=1;
              ch[36][2][0]=1; ch[36][2][1]=0;
              
              ch[37][0][0]=1; ch[37][0][1]=1; 
              ch[37][1][0]=0; ch[37][1][1]=1;
              ch[37][2][0]=0; ch[37][2][1]=1;
              
              ch[38][0][0]=1; ch[38][0][1]=1; 
              ch[38][1][0]=1; ch[38][1][1]=1;
              ch[38][2][0]=1; ch[38][2][1]=0;
              
              ch[39][0][0]=1; ch[39][0][1]=1; 
              ch[39][1][0]=1; ch[39][1][1]=1;
              ch[39][2][0]=0; ch[39][2][1]=1;
              
              ch[40][0][0]=0; ch[40][0][1]=0; 
              ch[40][1][0]=0; ch[40][1][1]=0;
              ch[40][2][0]=1; ch[40][2][1]=1;
              
              ch[41][0][0]=1; ch[41][0][1]=0; 
              ch[41][1][0]=0; ch[41][1][1]=0;
              ch[41][2][0]=1; ch[41][2][1]=1;
              
              ch[42][0][0]=0; ch[42][0][1]=1; 
              ch[42][1][0]=0; ch[42][1][1]=0;
              ch[42][2][0]=1; ch[42][2][1]=1;
              
              ch[43][0][0]=0; ch[43][0][1]=0; 
              ch[43][1][0]=1; ch[43][1][1]=0;
              ch[43][2][0]=1; ch[43][2][1]=1;
              
              ch[44][0][0]=0; ch[44][0][1]=0; 
              ch[44][1][0]=0; ch[44][1][1]=1;
              ch[44][2][0]=1; ch[44][2][1]=1;
              
              ch[45][0][0]=1; ch[45][0][1]=1; 
              ch[45][1][0]=0; ch[45][1][1]=0;
              ch[45][2][0]=1; ch[45][2][1]=1;
              
              ch[46][0][0]=1; ch[46][0][1]=0; 
              ch[46][1][0]=1; ch[46][1][1]=0;
              ch[46][2][0]=1; ch[46][2][1]=1;
              
              ch[47][0][0]=1; ch[47][0][1]=0; 
              ch[47][1][0]=0; ch[47][1][1]=1;
              ch[47][2][0]=1; ch[47][2][1]=1;
              
              ch[48][0][0]=1; ch[48][0][1]=1; 
              ch[48][1][0]=1; ch[48][1][1]=0;
              ch[48][2][0]=1; ch[48][2][1]=1;
              
              ch[49][0][0]=1; ch[49][0][1]=1; 
              ch[49][1][0]=0; ch[49][1][1]=1;
              ch[49][2][0]=1; ch[49][2][1]=1;
              
              ch[50][0][0]=1; ch[50][0][1]=1; 
              ch[50][1][0]=1; ch[50][1][1]=1;
              ch[50][2][0]=1; ch[50][2][1]=1;
                      
              ch[51][0][0]=0; ch[51][0][1]=1; 
              ch[51][1][0]=0; ch[51][1][1]=1;
              ch[51][2][0]=1; ch[51][2][1]=0;
              
              ch[52][0][0]=0; ch[52][0][1]=1; 
              ch[52][1][0]=0; ch[52][1][1]=1;
              ch[52][2][0]=0; ch[52][2][1]=1;
              
              ch[53][0][0]=0; ch[53][0][1]=0; 
              ch[53][1][0]=1; ch[53][1][1]=1;
              ch[53][2][0]=1; ch[53][2][1]=0;
              
              ch[54][0][0]=0; ch[54][0][1]=0; 
              ch[54][1][0]=1; ch[54][1][1]=1;
              ch[54][2][0]=0; ch[54][2][1]=1;
              
              ch[55][0][0]=0; ch[55][0][1]=1; 
              ch[55][1][0]=1; ch[55][1][1]=0;
              ch[55][2][0]=1; ch[55][2][1]=1;
              
              ch[56][0][0]=0; ch[56][0][1]=1; 
              ch[56][1][0]=0; ch[56][1][1]=1;
              ch[56][2][0]=1; ch[56][2][1]=1;
              
              ch[57][0][0]=0; ch[57][0][1]=1; 
              ch[57][1][0]=1; ch[57][1][1]=1;
              ch[57][2][0]=1; ch[57][2][1]=0;
              
              ch[58][0][0]=0; ch[58][0][1]=1; 
              ch[58][1][0]=1; ch[58][1][1]=1;
              ch[58][2][0]=0; ch[58][2][1]=1;
              
              ch[59][0][0]=0; ch[59][0][1]=0; 
              ch[59][1][0]=1; ch[59][1][1]=1;
              ch[59][2][0]=1; ch[59][2][1]=1;
              
              ch[60][0][0]=0; ch[60][0][1]=1; 
              ch[60][1][0]=1; ch[60][1][1]=1;
              ch[60][2][0]=1; ch[60][2][1]=1;
              
              ch[61][0][0]=1; ch[61][0][1]=0; 
              ch[61][1][0]=1; ch[61][1][1]=1;
              ch[61][2][0]=1; ch[61][2][1]=1;
              
              ch[62][0][0]=1; ch[62][0][1]=0; 
              ch[62][1][0]=1; ch[62][1][1]=1;
              ch[62][2][0]=1; ch[62][2][1]=0;
              
              ch[63][0][0]=1; ch[63][0][1]=0; 
              ch[63][1][0]=1; ch[63][1][1]=1;
              ch[63][2][0]=0; ch[63][2][1]=1;
              
              ch[64][0][0]=0; ch[64][0][1]=1; 
              ch[64][1][0]=0; ch[64][1][1]=1;
              ch[64][2][0]=1; ch[64][2][1]=1;                          
          }
        
          
          
          
        
     public  PrintingEngine()
        {
             pin1= gpio.provisionDigitalOutputPin(RaspiPin.GPIO_12, "pin19", PinState.HIGH);
             pin2= gpio.provisionDigitalOutputPin(RaspiPin.GPIO_13, "pin21", PinState.HIGH);
             pin3= gpio.provisionDigitalOutputPin(RaspiPin.GPIO_14, "pin23", PinState.HIGH);
             Mapping();
        }
    
     
    
    public void Extract(String data)
    {
        int l=data.length(),i,lm=0,hl=0,k=0,enters=0;
        String ch,ch1;
        
        k=0; ch="";
        for(i=0;i<l;i++)
        {
            ch=data.substring(i, i+1);
           
            if(ch.compareTo("\n")==0)
           {   enters++;    }
            
            if(ch.compareTo("\n")==0 && k==0)
            {   k++;
                hl=i;
                font=data.substring(lm,hl);               
            }
            
            if(ch.compareTo("\n")==0 && enters>1)
            {
            lm=hl+1;
            hl=lm+1;
            chs[a]=data.substring(lm,hl);    
            
            lm=lm+2; 
            hl=i; 
            ch1=data.substring(lm,hl); 
            nos[a]=Integer.parseInt(ch1);  
            a++;
            }              
        }   
        
    }
    
    void Strike(int time) throws InterruptedException
    {
        pin3.setState(PinState.LOW);
        Delay(time);
        pin3.setState(PinState.HIGH);
        
    }
    
    int[] Encode(String s)
    {
        int l=s.length();
        int a[]=new int[l];
        String ch;
        for(int i=0;i<l;i++)
        {
            ch=s.substring(i, i+1);
            if(ch.compareTo("\n")==0)
            {
                a[i]=-1;
            }
            else{
                a[i]=FindIndex(ch);
            }
        }
        return a;
    }
    public void PrintPin1(String s) throws InterruptedException
    {
        
        String data[]=dp.Partition(s);
        
        int lines=dp.lines(s),hash[],lmove=5,hdspeed=8,retspd=5,
            length,retsteps, enter=2,rollspd=2,rollsm=1,striketime=3;
        
        for(int i=0;i<lines;i++)
        {
            hash=Encode(data[i]);
            length=data[i].length();
            
            for(int grid=0;grid<3;grid++)
            {
                retsteps=0;
                for(int j=0;j<length;j++)
                 {
                    if(hash[j]==-1)
                    {
                        sm.RollerSpinLeft(enter, rollspd);
                    }
                    else
                    {
                        if(ch[hash[j]][grid][0]==1) 
                        { Strike(striketime);}
                        sm.HeadSpinLeft(lmove,hdspeed);
                        retsteps=retsteps+lmove;
                        
                        if(ch[hash[j]][grid][1]==1) 
                        { Strike(striketime);}
                        sm.HeadSpinLeft(lmove,hdspeed);
                        retsteps=retsteps+lmove;
                    }
                 }
                sm.RollerSpinLeft(rollsm, rollspd);
                sm.HeadSpinRight(retsteps,retspd);
            }
            
            
        }
        
    }
    
    
    int FindIndex(String ch)
    {
      int l=a,i=0;
      String item=ch;
      for(i=0;i<a;i++)
      {
          if(chs[i].compareTo(item)==0)
          {
              return i;
          }
      }     
        
        return -1;
    }
    
    void Delay(int time) throws InterruptedException
    {
        Thread.sleep(time);
    }
    
    public void Actuation3(int index) throws InterruptedException
    {
          int hmove=1,lmove=1,speed=2,actdelay=2;
          // head needs to return on the exact cell location to avoid errorss and irregualr dispalcements
        
        switch(index)
                {
            case 1:
                sm.HeadSpinLeft(lmove, speed);
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);
                break;
                
          case 2:
                sm.HeadSpinLeft(lmove, speed);
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);              
                break;
                
                
          case 3:
                sm.HeadSpinLeft(lmove, speed);
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                break;
         case 4:
                sm.HeadSpinRight(lmove, speed);
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                sm.HeadSpinLeft(lmove, speed);
                break;
                
          case 5:
                sm.HeadSpinLeft(lmove, speed);
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);
                break;
                
          case 6:
                sm.HeadSpinRight(lmove, speed);
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                sm.HeadSpinLeft(lmove, speed);
                break;
                
                
          case 7:
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                sm.HeadSpinLeft(lmove, speed);
                
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);
                break;
         case 8:
                pin2.setState(PinState.LOW);                
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(lmove, speed);
                pin1.setState(PinState.LOW);                
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);
                
                break;
          case 9:
                sm.HeadSpinRight(lmove, speed);
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(2*lmove, speed);
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);
                break;
                
          case 10:
                sm.HeadSpinLeft(lmove, speed);
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                sm.HeadSpinRightSmooth(lmove, speed);
                break;
                
                
          case 11:
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(lmove, speed);
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);
                
                break;
         case 12:
                
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                break;
          case 13:
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                sm.HeadSpinRight(lmove, speed);
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                sm.HeadSpinLeft(lmove, speed);
                break;
                
          case 14:
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(lmove, speed);
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);
                break;                
                
          case 15:
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                
                break;
         case 16:
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(lmove, speed);
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);            
                break;
                
          case 17:
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                sm.HeadSpinRight(lmove, speed);
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(lmove*2, speed);
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                break;
                
          case 18:
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(lmove, speed);
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);
                
                break;        
          
         case 19:
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
              
                sm.HeadSpinLeft(lmove, speed);
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);                
                break;
                
         case 20:
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinRight(lmove, speed);
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                sm.HeadSpinLeft(lmove, speed);
                break;
                
          case 21:
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(lmove, speed);
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);
                break;
                
          case 22:
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                break;                
                
          case 23:
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinRight(lmove, speed);
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(2*lmove, speed);
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                break;
                
         case 24:
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(lmove, speed);
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);          
                break;
                
          case 25:
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(lmove, speed);
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);
                break;
                
          case 26:
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinRight(lmove, speed);
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                sm.HeadSpinLeft(lmove, speed);
                break;               
                
          case 27:
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(lmove, speed);
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);
                break;
                
         case 28:
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                break;
                
          case 29:
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(lmove, speed);
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                sm.HeadSpinRight(lmove*2, speed);
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                sm.HeadSpinLeft(lmove, speed);
                break;
                
          case 30:
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(lmove, speed);
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);
                break;                
                
          case 31:
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(lmove, speed);
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);                
                break;
                
         case 32:
                sm.HeadSpinRight(lmove, speed);
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(2*lmove, speed);
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);
                break;          
        
          case 33:
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                
                sm.HeadSpinRight(lmove, speed);
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                sm.HeadSpinLeft(lmove, speed);
                break;
                
          case 34:
                sm.HeadSpinLeft(lmove, speed);
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                
                sm.HeadSpinRight(2*lmove, speed);
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                sm.HeadSpinLeft(lmove, speed);
                break;    
                
          case 35:
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                
                sm.HeadSpinRight(lmove, speed);
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(2*lmove, speed);
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);
                break;
                
         case 36:
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                sm.HeadSpinRight(lmove, speed);
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(2*lmove, speed);
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);
                break;
                
          case 37:
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                
                sm.HeadSpinRight(lmove, speed);
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(2*lmove, speed);
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);
                break;
                
          case 38:
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinRight(lmove, speed);
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(2*lmove, speed);
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);
                break;
                
                
          case 39:
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                
                sm.HeadSpinRight(lmove, speed);
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(2*lmove, speed);
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                break;
                
         case 40:
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(lmove, speed);
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);
                break;
                
          case 41:
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(lmove, speed);
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);
                break;
                
          case 42:
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(lmove, speed);
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);
                break;              
                
          case 43:
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(lmove, speed);
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);
                break;
                
         case 44:
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                
                sm.HeadSpinRight(lmove, speed);
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(2*lmove, speed);
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);
                break;
                
          case 45:
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(lmove, speed);
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);
                break;
                
          case 46:
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(lmove, speed);
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);
                break;                
                
          case 47:
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                
                sm.HeadSpinRight(lmove, speed);
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(2*lmove, speed);
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);
                break;
                
         case 48:
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(lmove, speed);
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);
                break;
                
          case 49:
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                
                sm.HeadSpinRight(lmove, speed);
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(2*lmove, speed);
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);
                break;
                
          case 50:
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                
                sm.HeadSpinRight(lmove, speed);
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(2*lmove, speed);
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);
                break;             
                
          case 51:
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                sm.HeadSpinRight(lmove, speed);
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(2*lmove, speed);
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);
                break;
                
         case 52:
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                
                sm.HeadSpinRight(lmove, speed);
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                sm.HeadSpinLeft(lmove, speed);
                break;
                
          case 53:
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinRight(lmove, speed);
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(2*lmove, speed);
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);
                break;
                
          case 54:
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinRight(lmove, speed);
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                sm.HeadSpinLeft(lmove, speed);
                break;             
                
          case 55:
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(lmove, speed);
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);         
                break;
                
         case 56:
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                
                sm.HeadSpinRight(lmove, speed);
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(2*lmove, speed);
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);
                break;
                
          case 57:
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinRight(lmove, speed);
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(2*lmove, speed);
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);
                break;
                
          case 58:
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                
                sm.HeadSpinRight(lmove, speed);
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                sm.HeadSpinLeft(lmove, speed);
                break;
                
                
          case 59:
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                
                sm.HeadSpinRight(lmove, speed);
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(2*lmove, speed);
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);
                break;
                
         case 60:
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                break;
                
          case 61:
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                
                sm.HeadSpinRight(lmove, speed);
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(2*lmove, speed);
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);
                break;
                
          case 62:
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinRight(lmove, speed);
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(2*lmove, speed);
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);
                break;                
                
          case 63:
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                
                sm.HeadSpinRight(lmove, speed);
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(2*lmove, speed);
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);
                break;
                
         case 64:
                pin1.setState(PinState.LOW);
                Delay(actdelay);
                pin1.setState(PinState.HIGH);
                                
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);  
                 
                sm.HeadSpinRight(lmove, speed);
                pin2.setState(PinState.LOW);
                Delay(actdelay);
                pin2.setState(PinState.HIGH);
                
                sm.HeadSpinLeft(2*lmove, speed);
                pin3.setState(PinState.LOW);
                Delay(actdelay);
                pin3.setState(PinState.HIGH);
                sm.HeadSpinRight(lmove, speed);
                break;
        
          }
        sm.HeadSpinLeft(hmove, speed);
    } 
    
    public  void GetValue(String data) throws InterruptedException
    {
         int i=0,l=data.length(),index;
         int speedroll=6,steps=10,space=10,speedhead=9;
        
        String ch="";
        for(i=0;i<l;i++)
        {
          ch=data.substring(i,i+1);
          index=FindIndex(ch);
          if(index==-1)
          {
              if(ch.compareTo("\n")==0)
              {
                  sm.RollerSpinLeft(steps,speedroll);
              }
              else if(ch.compareTo(" ")==0)
              {
                  sm.HeadSpinLeft(space, speedhead);
              }
              
          }
          else{             
          
          Actuation3(index);
          }
          
        }
    }
    
    
    
    
}
