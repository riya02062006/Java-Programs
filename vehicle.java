import java.time.Year;
public class vehicle{
    String brand;
    String model;
    int year;
    double basePrice;
     
    Vehicle(String brand,String modelm,int year,double basePrice){
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.basePrice=basePrice;
    }

    void displayInfo(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
        System.out.println("Base Price:"+basePrice);
     }
     double calculateResaleValue(){
        int currentYear=Year.now().getValue();
        int age=currentYear-year;
        return basePrice*Math.pow(0.85,age);
     }
    }
     class Car extends Vehicle{
        int numberOfDoors;
        Car(String brand,String model,int year,double basePrice,int numberOfDoors){
            super(brand,model,year,basePrice);
            this.numberOfDoors=numberOfDoors;
        }
        double calculateInsurance(){
            return 5000+(1000*numberOfDoors);
        }
        double calculateMaintanenceCost(){
            return 3000+(500*numberOfDoors);
        }
        void displayInfo(){
            super.displayInfo();
            System.out.println("Number of Doors:"+numberOfDoors);
            System.out.println("Insurance cost:"+calculateInsurance());
            System.out.println("Maintanence Cost:"+calculateMaintanenceCost());
            System.out.println("Resale Value:"+calculateResaleValue());
        }
    }

        class Motorcycle extends Vehicle{
            boolean hasSidecar;

            Motorcycle(String brand,String model,int year,double basePrice,boolean hasSidecar){
                super(brand,model,year,basePrice);
                this.hasSidecar=hasSidecar;
            }
            double calculateInsurance(){
                return hasSidecar ? 2500+1500:2500;
            }
            double calculateMaintanenceCost(){
                return hasSidecar ? 2000+1000:2000;
            }
            void displayInfo(){
                super.displayInfo();
                System.out.println("Has Sidecar:"+(hasSidecar ? "Yes": "No"));
                System.out.println("Insurance Cost:"+calculateInsurance());
                System.out.println("Maintanence Cost:"+calculateMaintanenceCost());
                System.out.println("Resale value:"+calculateResaleValue());
            }
        }
        class vehicleDetails{
            public static void main(String args[]){
                Car car=new Car("Hyundai","Sandro Sportz",2020,500000,4);
                Motorcycle bike=new Motorcycle("Bajaj","CT100",2010,50000,true);
                System.out.println("----Car Details----");
                car.displayInfo();
                System.out.println("----Motorcycle Details----");
                bike.displayInfo();
            }
        }






         

