package Lab1Session3;

public class SoNguyenTo {
    public int a;

    public int getA() {
        return this.a;
    }

    public void setA(int a) {
        if(this.isSoNguyenTo(a)){
            this.a = a;
        }
        else {
            System.out.println(a + "  không phải số nguyên tố,không lưu trữ.");
        }
    }
    SoNguyenTo(){
        System.out.println("bạn vừa tạo ra 1 đối tượng soNguyenTo");
    }
    SoNguyenTo(int x){
        if (this.isSoNguyenTo(x)) {
            this.a = x;
        }
        else {
            System.out.println(x + "  không phải số nguyên tố,không lưu trữ.");
        }

    }
    boolean isSoNguyenTo(int x){
        int count = 1;
        for (int i = 1;i <= x; i++){

            if (x%i==0){
                count++;
            }
        }
        if (count == 2){
            return true;
        }
        else {
            return false;
        }
    }
    int timSoNguyenToTiepTheo(){
        int NextNumber = 0;


        for ( int i = this.getA() + 1 ; ; i++){

            if ( this.isSoNguyenTo(i) ){
                NextNumber = i;
                break;
            }
        }
        return NextNumber;
    }
    public static void main(String[] args) {
        SoNguyenTo so1 = new SoNguyenTo();
        SoNguyenTo so2 = new SoNguyenTo(2);
        System.out.println(so2.getA());
        so1.setA(9);
        System.out.println(so1.isSoNguyenTo(2));
        System.out.println(so2.isSoNguyenTo(4));
        System.out.println(so1.getA());
        so1.setA(3);
        System.out.println(so1.getA());
        System.out.println("số nguyên tố tiếp theo của so2 ="+ so2.timSoNguyenToTiepTheo());
        so2.setA(11);
        System.out.println(so2.getA());
        System.out.println("số nguyên tố tiếp theo của so2 ="+ so2.timSoNguyenToTiepTheo());
    }
}
