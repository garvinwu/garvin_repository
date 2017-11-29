package printer;

import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.attribute.Attribute;
import javax.print.attribute.standard.PrinterStateReasons;

/**
 * Created by Administrator on 2017/11/28.
 */
public class WindowsPrinter {

    public static void main(String[] args) {
        PrintService printService = PrintServiceLookup.lookupDefaultPrintService();
        PrinterStateReasons value = printService.getAttribute(PrinterStateReasons.class);
        Attribute[] toArray = printService.getAttributes().toArray();
        System.out.println(toArray);
    }
}
