package LW_03;

import java.util.Scanner;

public class Q3 {


    public static class Owner {
        private String ownerName;
        private String phoneNo;


        public Owner() {
            this.ownerName = "Unknown";
            this.phoneNo = "N/A";
        }

        public Owner(String ownerName, String phoneNo) {
            this.ownerName = ownerName;
            this.phoneNo = phoneNo;
        }

        public String getOwnerName() {
            return ownerName;
        }

        public void setOwnerName(String ownerName) {
            this.ownerName = ownerName;
        }

        public String getPhoneNo() {
            return phoneNo;
        }

        public void setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
        }

        @Override
        public String toString() {
            return "Owner Name: " + ownerName + ", Phone No: " + phoneNo;
        }
    }


    public static class Bicycle {
        private Owner owner;


        public Bicycle() {
            this.owner = new Owner();
        }

        public Bicycle(String name, String num) {
            this.owner = new Owner(name, num);
        }

        public Owner getOwner() {
            return owner;
        }

        public void setOwner(Owner owner) {
            this.owner = owner;
        }

        public String getOwnerName() {
            return owner.getOwnerName();
        }

        public void setOwnerName(String name) {
            owner.setOwnerName(name);
        }

        public String getPhoneNo() {
            return owner.getPhoneNo();
        }

        public void setPhoneNo(String num) {
            owner.setPhoneNo(num);
        }

        @Override
        public String toString() {
            return "Bicycle Owner Details -> " + owner.toString();
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Owner Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = scanner.nextLine();


        Bicycle bicycle = new Bicycle(name, phone);

        System.out.println("\n--- Bicycle Information ---");
        System.out.println("Owner Name: " + bicycle.getOwnerName());
        System.out.println("Phone No: " + bicycle.getPhoneNo());
        System.out.println("Full Details: " + bicycle);

        scanner.close();
    }
}
