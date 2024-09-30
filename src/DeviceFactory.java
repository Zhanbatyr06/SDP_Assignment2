interface Smartphone { void getDetails(); }
interface Laptop { void getDetails(); }

class AppleSmartphone implements Smartphone { public void getDetails() { System.out.println("Apple Smartphone."); } }
class AppleLaptop implements Laptop { public void getDetails() { System.out.println("Apple Laptop."); } }
class SamsungSmartphone implements Smartphone { public void getDetails() { System.out.println("Samsung Smartphone."); } }
class SamsungLaptop implements Laptop { public void getDetails() { System.out.println("Samsung Laptop."); } }

interface DeviceFactory {
    Smartphone createSmartphone();
    Laptop createLaptop();
}

class AppleFactory implements DeviceFactory {
    public Smartphone createSmartphone() { return new AppleSmartphone(); }
    public Laptop createLaptop() { return new AppleLaptop(); }
}

class SamsungFactory implements DeviceFactory {
    public Smartphone createSmartphone() { return new SamsungSmartphone(); }
    public Laptop createLaptop() { return new SamsungLaptop(); }
}

