//Submitted by: Ben Ryan Rinconada BSIT-2A
//Demo video google drive folder link: https://drive.google.com/drive/folders/1cz8wV-tAkjAhtJtL1mmH51U3dWtguyX2

import java.util.Scanner;
import java.util.ArrayList;


public class PCperipheral {
    private String type;
    private String code;
    private String name;
    private String employee;
    private boolean available;

    public PCperipheral(String type, String name, String code,boolean available){
        this.type = type;
        this.name = name;
        this.code = code;
        this.available = available;

    }
    
    public String getType(){
        return type;
    }
    public String getName(){
        return name;
    }
    public String getCode(){
        return code;
    }
    public String getEmployee(){
        return employee;
    }
    public boolean isAvailable(){
        return available;
    }
    public String getDetails(){
        return "Type: "+ getType() + "Name: " + getName() + "Code: " + getCode() + "Employee: " + getEmployee() + "Availability" + isAvailable()   ;
    }

    public void setType(String type){
        this.type = type;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCode(String code){
        this.code = code; 
    }
    public void setEmployee(String employee){
        this.employee = employee;
    }
    public void setAvailability(boolean available){
        this.available = available;
    }


  
}
class WorkplaceInventory{
    public static void main(String[] args) {
        ArrayList<PCperipheral> peripherals = new ArrayList<PCperipheral>();
        ArrayList<String> employeeList = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        boolean done = false;

        while (!done) {
         System.out.println("____________________________ WORKPLACE PERIPHERAL INVENTORY ____________________________");
         System.out.println("1.ADD Record");
         System.out.println("2.VIEW Record");
         System.out.println("3.EDIT Record");
         System.out.println("4.DELETE Record");
         System.out.println("5.REPORT");
         System.out.print("6. Exit");
         System.out.print("____________________________________________________________");
         System.out.print("Enter your choice: ");
         int opt01 = scanner.nextInt();


          if (opt01 == 1) {
            System.out.println("a. Add a peripheral");
            System.out.println("b. Add Peripheral to employee");
            System.out.print(": ");
            String opt02 = scanner.next();

            if (opt02.equals("a")) {
                System.out.println("______________________________________ ENTER TYPE ______________________________________");
                System.out.println("                          Enter [input] for input peripherals");
                System.out.println("                         Enter [output] for output peripherals");
                System.out.println("           Enter [multi] if peripheral is both an input and output peripherals");
                System.out.print(": ");
                String type =scanner.next();
                System.out.println("Enter Peripheral Name: ");
                String name =scanner.next();
                System.out.println("Enter Peripheral Code");
                String code = scanner.next();
                peripherals.add(new PCperipheral(type, name, code, true));
        
            } 
            else if (opt02.equals("b")) {
                System.out.println("__ ASSIGN PERIPHERAL TO EMPLOYEE _______________________________________________________");
                System.out.println("Enter employee name: ");
                String employee =scanner.next();
        
                if(!employee.contains(employee)){
                    employeeList.add(employee);
        
                }
                System.out.println("Enter Peripheral Code: ");
                String code = scanner.next();
                for(PCperipheral peripheral : peripherals){
                    if(peripheral.getCode().equals(code)) {
                        peripheral.setEmployee(employee);
                        peripheral.setAvailability(false);
                        
                            }
                        }
                    }
                    } 
            else if (opt01 == 2) {
                System.out.println("_____________________________________ VIEW RECORD _____________________________________");
                System.out.println("a. View all peripherals");
                System.out.println("b. View available peripherals");
                System.out.println("c. View not available peripherals");
                System.out.println("d. View all input devices");
                System.out.println("e. View all output devices");
                System.out.println("f. View all input/output devices");
                System.out.println("g. View all employees");
                System.out.print("____________________________________________________________");
                System.out.print("Enter your choice: ");
                String opt03 = scanner.next();

                if (opt03.equals("a")) {
                    System.out.println("__ ALL PERIPHERALS _____________________________________________________________________");
                    for(PCperipheral peripheral : peripherals){
                        System.out.println("Type: " + peripheral.getType() + " | " + "Name: " + peripheral.getName()
                        + " | " + "Code: " + peripheral.getCode() + " | " + "Employee: " + peripheral.getEmployee()
                        + " | " + "Availability: " + peripheral.isAvailable());
                    }
                    System.out.println("__ _____________________________________________________________________________________");
                } 
                else if (opt03.equals("b")) {
                    System.out.println("__ AVAILABLE PERIPHERALS _______________________________________________________________");
                    for(PCperipheral peripheral : peripherals) {
                        if(peripheral.isAvailable()){
                            System.out.println("Type: " + peripheral.getType() + " | " + "Name: " + peripheral.getName()
                            + " | " + "Code: " + peripheral.getCode());
                        }
                    }
                            System.out.println("__ _____________________________________________________________________________________");
                } 
                else if (opt03.equals("c")) {
                    System.out.println("__ UNVAILABLE PERIPHERALS ______________________________________________________________");
                    for(PCperipheral peripheral : peripherals){
                        if(!peripheral.isAvailable()){
                            System.out.println("Type: " + peripheral.getType() + " | " + "Name: " + peripheral.getName()
                            + " | " + "Code: " + peripheral.getCode() + " | " + "Employee: " + peripheral.getEmployee());
            
                        }
                    }System.out.println("__ _____________________________________________________________________________________");
                
                    
                } 
                else if (opt03.equals("d")) {
                    System.out.println("__ INPUT DEVICES________________________________________________________________________");
                    for(PCperipheral peripheral : peripherals){
                    if(peripheral.getType().equals("input")){
                    System.out.println("Name: " + peripheral.getName() + " | " + "Code: " + peripheral.getCode()
                    + " | " + "Eployee: " + peripheral.getEmployee() + " | " + "Availabilty: " + peripheral.isAvailable());
                }   System.out.println("__ _____________________________________________________________________________________");

             }

                } 
                else if (opt03.equals("e")) {
                    System.out.println("__ OUTPUT DEVICES_______________________________________________________________________");
                    for(PCperipheral peripheral : peripherals){
                    if(peripheral.getType().equals("output")){
                    System.out.println("Name: " + peripheral.getName() + " | " + "Code: " + peripheral.getCode()
                    + " | " + "Eployee: " + peripheral.getEmployee() + " | " + "Availabilty: " + peripheral.isAvailable());     
                }  System.out.println("__ _____________________________________________________________________________________");
                
            }
        
                } 
                else if (opt03.equals("f")) {
                    System.out.println("__ INPUT/OUTPUT DEVICES_________________________________________________________________");
                    for(PCperipheral peripheral : peripherals){
                        if(peripheral.getType().equals("multi")){
                        System.out.println("Name: " + peripheral.getName() + " | " + "Code: " + peripheral.getCode()
                        + " | " + "Eployee: " + peripheral.getEmployee() + " | " + "Availabilty: " + peripheral.isAvailable());       
                    }   System.out.println("__ _____________________________________________________________________________________");

            }
                    
                
                } 
                else if (opt03.equals("g")) {
                        System.out.println("__ EMPLOYEE/S __________________________________________________________________________");
                        for(PCperipheral peripheral : peripherals){
                            if(!peripheral.isAvailable()){
                                System.out.println(peripheral.getEmployee());
                            }
                        }
                    }
         }
          else if (opt01 == 3) {
            System.out.println("__ EDIT PERIPHERAL INFO ________________________________________________________________");
            System.out.println("Enter Peripheral code: ");
            String code = scanner.next();
            for(PCperipheral peripheral : peripherals){
                if(peripheral.getCode().equals(code)){
                    System.out.println("Enter new type: ");
                    peripheral.setType(scanner.next());
                    System.out.println("Enter new name: ");
                    peripheral.setName(scanner.next());
                    System.out.println("Enter new Code: ");
                    peripheral.setCode(scanner.next());
                    break;
                }
            }
    
        }
            
            else if (opt01 == 4) {
                System.out.println("__ DELETE PERIPHERAL ___________________________________________________________________");
                System.out.print("Enter peripheral code: ");
                String code = scanner.next();
                for(PCperipheral peripheral : peripherals){
                    if(peripheral.getCode().equals(code)){
                        peripherals.remove(peripheral);
                        break;
                    }
                }
        }
            
        else if (opt01 == 5) {
            int availablePeripherals = 0, assignedPeripherals = 0, inputDevices = 0, outputDevices = 0, inputAndOutputDevices=0;
        for (PCperipheral peripheral : peripherals) {
            if (peripheral.isAvailable()) {
                availablePeripherals++;
            } else {
                assignedPeripherals++;
            }
            if (peripheral.getType().equals("input")) {
                inputDevices++;
            } else if (peripheral.getType().equals("output")) {
                outputDevices++;
            }else if (peripheral.getType().equals("multi")) {
                inputAndOutputDevices++;
            }
        }
        System.out.println("__ REPORT ______________________________________________________________________________");
        System.out.println("Number of available peripherals: " + availablePeripherals);
        System.out.println("Number of assigned peripherals: " + assignedPeripherals);
        System.out.println("Number of input devices: " + inputDevices);
        System.out.println("Number of output devices: " + outputDevices);
        System.out.println("Number of Input/Output devices: " + inputAndOutputDevices);
        System.out.println("Nunber of Employees with peripherals assigned: " + assignedPeripherals++);
        System.out.println("__ _____________________________________________________________________________________");
       }

       else if (opt01 == 6) {
        System.out.println("___________________________________ PROGRAM CLOSED _____________________________________");
        break;
            }
        }
     }
}