public class RCCar {
 
        //features of a RC car
        // battery, distance

        private int battery;
        private float distance;

        public RCCar(){
                
                this.battery = 100;
                this.distance = 0;  
        }
        

        public static RCCar buyCar(){
                RCCar newCar = new RCCar();
                return newCar;
        }

        public void drive()
        {
                if (battery == 0) return;

                distance += 20;
                System.out.println("Driven 20m");
                --battery;
                System.out.println(displayBattery());

                // distance = 29m  -> if (29 mod 20) != 0  
        }

        
        public String displayBattery(){
                return "Battery is at: " + battery + "%";
        }

        
        public String displayDistance(){
                return "Distance travelled: " + distance + "m";
        }

}