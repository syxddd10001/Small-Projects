class main{

        public static void main(String[] args) {
                
                RCCar car1 = new RCCar();
                
                System.out.println(car1.displayBattery());
                System.out.println(car1.displayBattery());
                
                for (int d = 0; d<5; ++d){
                        car1.drive();
                        System.out.println(car1.displayDistance());
                }
                
                System.out.println(car1.displayBattery());
                



        }
        
}