public class Third {
    public static void main(String[] args) {
        AllInOnePrinter AIOP1 = new AllInOnePrinter();
        AIOP1.Fax("Content");
        BasicPrinter BP1 = new BasicPrinter();
        BP1.Print("Content");
    }
}

interface IPrinter {
    void Print(String content);
}

interface IScanner {
    void Scan(String content);
}

interface IFax{
    void Fax(String content);
}

class AllInOnePrinter implements IPrinter,IScanner,IFax {
    public void Print(String content) {
        System.out.println("Printing: " + content);
    }

    public void Scan(String content) {
        System.out.println("Scanning: " + content);
    }

    public void Fax(String content) {
        System.out.println("Faxing: " + content);
    }
}

class BasicPrinter implements IPrinter
{
    public void Print(String content)
    {
        System.out.println("Printing: " + content);
    }
}