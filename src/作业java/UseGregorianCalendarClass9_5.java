package ��ҵjava;

import java.util.GregorianCalendar;
public class UseGregorianCalendarClass9_5 {
    public static void main(String[] args) {
        GregorianCalendar day = new GregorianCalendar();
        int a = day.get(GregorianCalendar.YEAR);
        int b = day.get(GregorianCalendar.MONTH);
        int c = day.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("�޸�ǰ"+ a + " �� " + b + "��" + c + "��");
        long l = 1234567898765L;
        day.setTimeInMillis(l);
        a = day.get(GregorianCalendar.YEAR);
        b = day.get(GregorianCalendar.MONTH);
        c = day.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("�޸ĺ�" + a + " �� " + b + "��" + c + "��");
    }
}
