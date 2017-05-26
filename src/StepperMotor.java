/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author root
 */ 
import com.pi4j.io.gpio.GpioController; 
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;


    /**
     *
     * @author Wim
     */
    public class StepperMotor {

        private final GpioController gpio = GpioFactory.getInstance();
        private GpioPinDigitalOutput Head0,Head1,Head2,Head3,Roll0, Roll1,Roll2,Roll3;
        private GpioPinDigitalInput IR;
        private PinState ps;
        private static int roll,head,irdelay;
        public static StepperMotor stepperMotor;
        
        void Delay(int time) throws InterruptedException
    {
        Thread.sleep(time);
    }
        
        void IRdetection() throws InterruptedException
        {
            for(int i=0;i<3;i++)
            {
               ps=IR.getState();
               
               if(ps.isHigh())
               {
                   stop();
               }
               Delay(irdelay);
               
               
            }
           
           
        }
        
        public StepperMotor() {
            
            Head0= gpio.provisionDigitalOutputPin(RaspiPin.GPIO_16, "pin10", PinState.LOW);
            Head1= gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "pin12", PinState.LOW);
            Head2= gpio.provisionDigitalOutputPin(RaspiPin.GPIO_04, "pin16", PinState.LOW);
            Head3= gpio.provisionDigitalOutputPin(RaspiPin.GPIO_05, "pin18", PinState.LOW);
            
            IR=gpio.provisionDigitalInputPin(RaspiPin.GPIO_03, "pin09");
            
            Roll0= gpio.provisionDigitalOutputPin(RaspiPin.GPIO_26, "pin32", PinState.LOW);
            Roll1= gpio.provisionDigitalOutputPin(RaspiPin.GPIO_27, "pin36", PinState.LOW);
            Roll2= gpio.provisionDigitalOutputPin(RaspiPin.GPIO_28, "pin38", PinState.LOW);
            Roll3= gpio.provisionDigitalOutputPin(RaspiPin.GPIO_29, "pin40", PinState.LOW);
            
            
                        
            stepperMotor = this;
           
        }

        public static StepperMotor getInstance() {
            if (stepperMotor == null) {
                stepperMotor = new StepperMotor();
            }
            return stepperMotor;
         
        }

        public void HeadSpinLeft(int steps,long speed) throws InterruptedException {
            GpioPinDigitalOutput[] GpioPins = {Head0, Head1, Head2, Head3};
            GpioPinDigitalOutput oldPin = null, newPin = null;
            int counter =0 ,i=0;
            while (i<steps ) {
                 counter = 0;     
                 
                    switch (counter) {
                        case 0:
                            oldPin = GpioPins[GpioPins.length - 1];
                            newPin = GpioPins[counter];
                            i++;
                            break;
                        case 1:
                            oldPin = GpioPins[counter - 1];
                            newPin = GpioPins[counter];
                            i++;
                            break;
                        case 2:
                            oldPin = GpioPins[counter - 1];
                            newPin = GpioPins[counter];
                            i++;
                            break;
                        case 3:
                            oldPin = GpioPins[counter - 1];
                            newPin = GpioPins[counter];
                            i++;
                            break;
                    }
                    oldPin.setState(PinState.LOW);
                    newPin.setState(PinState.HIGH);
                    Thread.sleep(speed);
                    counter++;
                
            }
        }
        public void RollerSpinLeft(int steps,long speed) throws InterruptedException {
            GpioPinDigitalOutput[] GpioPins = {Roll0, Roll1, Roll2, Roll3};
            GpioPinDigitalOutput oldPin = null, newPin = null;
            int counter = 0,i=0;
            while (i<steps ) {
                 counter = 0;     
                 
                    switch (counter) {
                        case 0:
                            oldPin = GpioPins[GpioPins.length - 1];
                            newPin = GpioPins[counter];
                            i++;
                            break;
                        case 1:
                            oldPin = GpioPins[counter - 1];
                            newPin = GpioPins[counter];
                            i++;
                            break;
                        case 2:
                            oldPin = GpioPins[counter - 1];
                            newPin = GpioPins[counter];
                            i++;
                            break;
                        case 3:
                            oldPin = GpioPins[counter - 1];
                            newPin = GpioPins[counter];
                            i++;
                            break;
                    }
                    oldPin.setState(PinState.LOW);
                    newPin.setState(PinState.HIGH);
                    Thread.sleep(speed);
                    counter++;
                
            }
        }

        public void HeadSpinRight(int steps,long speed) throws InterruptedException {
            GpioPinDigitalOutput[] GpioPins = {Head3, Head2,Head1, Head0};
            GpioPinDigitalOutput oldPin = null, newPin = null;
            int counter = 0,i=0;
            while (i<steps ) {
                 counter = 0;     
                 
                    switch (counter) {
                        case 0:
                            oldPin = GpioPins[GpioPins.length - 1];
                            newPin = GpioPins[counter];
                            i++;
                            break;
                        case 1:
                            oldPin = GpioPins[counter - 1];
                            newPin = GpioPins[counter];
                            i++;
                            break;
                        case 2:
                            oldPin = GpioPins[counter - 1];
                            newPin = GpioPins[counter];
                            i++;
                            break;
                        case 3:
                            oldPin = GpioPins[counter - 1];
                            newPin = GpioPins[counter];
                            i++;
                            break;
                    }
                    oldPin.setState(PinState.LOW);
                    newPin.setState(PinState.HIGH);
                    Thread.sleep(speed);
                    counter++;
                
            }
        }

         public void RollerSpinRight(int steps,long speed) throws InterruptedException {
            GpioPinDigitalOutput[] GpioPins = {Roll3, Roll2,Roll1,Roll0};
            GpioPinDigitalOutput oldPin = null, newPin = null;
            int counter = 0,i=0;
            while (i<steps ) {
                 counter = 0;     
                 
                    switch (counter) {
                        case 0:
                            oldPin = GpioPins[GpioPins.length - 1];
                            newPin = GpioPins[counter];
                            i++;
                            break;
                        case 1:
                            oldPin = GpioPins[counter - 1];
                            newPin = GpioPins[counter];
                            i++;
                            break;
                        case 2:
                            oldPin = GpioPins[counter - 1];
                            newPin = GpioPins[counter];
                            i++;
                            break;
                        case 3:
                            oldPin = GpioPins[counter - 1];
                            newPin = GpioPins[counter];
                            i++;
                            break;
                    }
                    oldPin.setState(PinState.LOW);
                    newPin.setState(PinState.HIGH);
                    Thread.sleep(speed);
                    counter++;
                
            }
        }

        
        public void HeadSpinRightSmooth(int steps,long speed) throws InterruptedException {
            GpioPinDigitalOutput[] GpioPins = {Head3, Head2,Head1, Head0};
            int i=0,counter;
            while (i<steps) {
                 counter = 0;
                               
                    switch (counter) {
                        case 0:
                            GpioPins[2].setState(PinState.HIGH);    
                            i++;
                            break;
                        case 1:                                                   
                            GpioPins[3].setState(PinState.LOW);
                            i++;
                            break;
                        case 2:                                                       
                            GpioPins[1].setState(PinState.HIGH);      
                            i++;
                            break;
                        case 3:                                                                    
                            GpioPins[2].setState(PinState.LOW);
                            i++;
                            break;
                        case 4:                            
                            GpioPins[0].setState(PinState.HIGH); 
                            i++;
                            break;
                        case 5:                                                      
                            GpioPins[1].setState(PinState.LOW);
                            i++;
                            break;
                        case 6:                           
                            GpioPins[3].setState(PinState.HIGH);  
                            i++;
                            break;
                        case 7:                                                      
                            GpioPins[0].setState(PinState.LOW);
                            i++;
                            break;                        
                           
                    }     
                    
                    Thread.sleep(speed);
                    counter++;
                }
            }
        

        public void stop() {
            
            Head0.setState(PinState.LOW);
            Head1.setState(PinState.LOW);
            Head2.setState(PinState.LOW);
            Head3.setState(PinState.LOW);
            
            Roll0.setState(PinState.LOW);
            Roll1.setState(PinState.LOW);
            Roll2.setState(PinState.LOW);
            Roll3.setState(PinState.LOW);
            gpio.shutdown();
        }
    }

