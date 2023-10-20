public class Bill {
    String idBill;
    String idEmployee;
    String idCustomer;
    String idDiscount;
    float tolalBill;
    String printDate;

    public Bill (){
        this.idBill="";
        this.idEmployee="";
        this.idCustomer="";
        this.idDiscount="";
        this.tolalBill=0;
        this.printDate="";
    }

    public Bill (String idBill, String idEmployee, String idCustomer, String idDiscount, float totalBill, String printDate){
        this.idBill=idBill;
        this.idEmployee=idEmployee;
        this.idCustomer=idCustomer;
        this.idDiscount=idDiscount;
        this.tolalBill=totalBill;
        this.printDate=printDate;
    }

}
