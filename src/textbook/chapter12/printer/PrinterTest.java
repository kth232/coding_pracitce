package textbook.chapter12.printer;

public class PrinterTest {
    public static void main(String[] args) {
        
    GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>(); //powder형으로 인스턴스 생성
    powderPrinter.setMaterial(new Powder()); //powder 자료형으로 material 설정
    Powder powder = powderPrinter.getMaterial(); // 형변환 하지 않음
    System.out.println(powderPrinter);
    powderPrinter.printing(); //powder.doPrinting(); 호출

    GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
    plasticPrinter.setMaterial(new Plastic()); //plastic 자료형으로 material 설정
    Plastic plastic = plasticPrinter.getMaterial(); // 형변환 하지 않음
    System.out.println(plasticPrinter);
    plasticPrinter.printing(); //plastic.doPrinting(); 호출

	/*	대입된 자료형을 명시하지 않으면 강제 형변환해줘야 함
        GenericPrinter powderPrinter2 = new GenericPrinter(); 
		powderPrinter2.setMaterial(new Powder());
		Powder powder = (Powder)powderPrinter.getMaterial(); //강제 형변환
		System.out.println(powderPrinter);
		*/
    //GenericPrinter<Water> printer = new GenericPrinter<Water>();	
    }
}
